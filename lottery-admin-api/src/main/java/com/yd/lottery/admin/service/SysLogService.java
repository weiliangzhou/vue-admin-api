package com.yd.lottery.admin.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yd.lottery.db.dao.SysLogMapper;
import com.yd.lottery.db.domain.SysLog;
import com.yd.lottery.db.domain.SysLogExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class SysLogService {
    @Resource
    private SysLogMapper logMapper;

    public void deleteById(Long id) {
        logMapper.logicalDeleteByPrimaryKey(id);
    }

    public void add(SysLog log) {
        log.setCreateTime(LocalDateTime.now());
        log.setUpdateTime(LocalDateTime.now());
        logMapper.insertSelective(log);
    }

    public PageInfo<SysLog> querySelective(String name, Integer page, Integer size, String sort, String order) {
        SysLogExample example = new SysLogExample();
        SysLogExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(name)) {
            criteria.andAdminLike("%" + name + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, size);
        List<SysLog> sysLogs = logMapper.selectByExample(example);
        return new PageInfo<>(sysLogs);
    }
}
