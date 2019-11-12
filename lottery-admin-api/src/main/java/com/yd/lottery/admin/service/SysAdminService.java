package com.yd.lottery.admin.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yd.lottery.db.dao.SysAdminMapper;
import com.yd.lottery.db.domain.SysAdmin;
import com.yd.lottery.db.domain.SysAdmin.Column;
import com.yd.lottery.db.domain.SysAdminExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class SysAdminService {
    private final Column[] result = new Column[]{Column.kid, Column.username, Column.avatar, Column.roleIds};
    @Resource
    private SysAdminMapper adminMapper;

    public List<SysAdmin> findAdmin(String username) {
        SysAdminExample example = new SysAdminExample();
        example.or().andUsernameEqualTo(username).andDeletedEqualTo(false);
        return adminMapper.selectByExample(example);
    }

    public SysAdmin findAdmin(Long id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    public PageInfo<SysAdmin> querySelective(String username, Integer page, Integer limit, String sort, String order) {
        SysAdminExample example = new SysAdminExample();
        SysAdminExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike("%" + username + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        List<SysAdmin> sysAdmins = adminMapper.selectByExampleSelective(example, result);
        return new PageInfo<>(sysAdmins);
    }

    public int updateById(SysAdmin admin) {
        admin.setUpdateTime(LocalDateTime.now());
        return adminMapper.updateByPrimaryKeySelective(admin);
    }

    public void deleteById(Long id) {
        adminMapper.logicalDeleteByPrimaryKey(id);
    }

    public void add(SysAdmin admin) {
        admin.setCreateTime(LocalDateTime.now());
        admin.setUpdateTime(LocalDateTime.now());
        adminMapper.insertSelective(admin);
    }

    public SysAdmin findById(Long id) {
        return adminMapper.selectByPrimaryKeySelective(id, result);
    }

    public List<SysAdmin> all() {
        SysAdminExample example = new SysAdminExample();
        example.or().andDeletedEqualTo(false);
        return adminMapper.selectByExample(example);
    }
}
