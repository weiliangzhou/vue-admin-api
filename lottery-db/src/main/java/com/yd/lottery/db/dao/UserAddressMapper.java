package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.UserAddress;
import com.yd.lottery.db.domain.UserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAddressMapper {
    long countByExample(UserAddressExample example);

    int deleteByExample(UserAddressExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(UserAddress record);

    int insertSelective(UserAddress record);

    UserAddress selectOneByExample(UserAddressExample example);

    UserAddress selectOneByExampleSelective(@Param("example") UserAddressExample example, @Param("selective") UserAddress.Column ... selective);

    List<UserAddress> selectByExampleSelective(@Param("example") UserAddressExample example, @Param("selective") UserAddress.Column ... selective);

    List<UserAddress> selectByExample(UserAddressExample example);

    UserAddress selectByPrimaryKeySelective(@Param("kid") Long kid, @Param("selective") UserAddress.Column ... selective);

    UserAddress selectByPrimaryKey(Long kid);

    UserAddress selectByPrimaryKeyWithLogicalDelete(@Param("kid") Long kid, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") UserAddress record, @Param("example") UserAddressExample example);

    int updateByExample(@Param("record") UserAddress record, @Param("example") UserAddressExample example);

    int updateByPrimaryKeySelective(UserAddress record);

    int updateByPrimaryKey(UserAddress record);

    int logicalDeleteByExample(@Param("example") UserAddressExample example);

    int logicalDeleteByPrimaryKey(Long kid);
}