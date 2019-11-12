package com.yd.lottery.admin.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yd.lottery.db.dao.UserAddressMapper;
import com.yd.lottery.db.domain.UserAddress;
import com.yd.lottery.db.domain.UserAddressExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserAddressService {
    @Resource
    private UserAddressMapper addressMapper;

    public PageInfo<UserAddress> queryByUid(Long uid) {
        UserAddressExample example = new UserAddressExample();
        example.or().andUserKidEqualTo(uid).andDeletedEqualTo(false);
        List<UserAddress> userAddresses = addressMapper.selectByExample(example);
        return new PageInfo<>(userAddresses);
    }

    public UserAddress query(Long userId, Long id) {
        UserAddressExample example = new UserAddressExample();
        example.or().andKidEqualTo(id).andUserKidEqualTo(userId).andDeletedEqualTo(false);
        return addressMapper.selectOneByExample(example);
    }

    public int add(UserAddress address) {
//        address.setCreateTime(LocalDateTime.now());
//        address.setUpdateTime(LocalDateTime.now());
        return addressMapper.insertSelective(address);
    }

    public int update(UserAddress address) {
        address.setUpdateTime(LocalDateTime.now());
        return addressMapper.updateByPrimaryKeySelective(address);
    }

    public void delete(Long id) {
        addressMapper.logicalDeleteByPrimaryKey(id);
    }

    public UserAddress findDefault(Long userId) {
        UserAddressExample example = new UserAddressExample();
        example.or().andUserKidEqualTo(userId).andIsDefaultEqualTo(true).andDeletedEqualTo(false);
        return addressMapper.selectOneByExample(example);
    }

    public void resetDefault(Long userId) {
        UserAddress address = new UserAddress();
        address.setIsDefault(false);
        address.setUpdateTime(LocalDateTime.now());
        UserAddressExample example = new UserAddressExample();
        example.or().andUserKidEqualTo(userId).andDeletedEqualTo(false);
        addressMapper.updateByExampleSelective(address, example);
    }

    public PageInfo<UserAddress> querySelective(Long userId, String name, Integer page, Integer limit, String sort, String order) {
        UserAddressExample example = new UserAddressExample();
        UserAddressExample.Criteria criteria = example.createCriteria();

        if (userId != null) {
            criteria.andUserKidEqualTo(userId);
        }
        if (!StringUtils.isEmpty(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        List<UserAddress> userAddresses = addressMapper.selectByExample(example);
        return new PageInfo<>(userAddresses);
    }
}
