package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.UserBase;
import com.yd.lottery.db.domain.UserBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBaseMapper {
    long countByExample(UserBaseExample example);

    int deleteByExample(UserBaseExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(UserBase record);

    int insertSelective(UserBase record);

    UserBase selectOneByExample(UserBaseExample example);

    UserBase selectOneByExampleSelective(@Param("example") UserBaseExample example, @Param("selective") UserBase.Column ... selective);

    List<UserBase> selectByExampleSelective(@Param("example") UserBaseExample example, @Param("selective") UserBase.Column ... selective);

    List<UserBase> selectByExample(UserBaseExample example);

    UserBase selectByPrimaryKeySelective(@Param("kid") Long kid, @Param("selective") UserBase.Column ... selective);

    UserBase selectByPrimaryKey(Long kid);

    int updateByExampleSelective(@Param("record") UserBase record, @Param("example") UserBaseExample example);

    int updateByExample(@Param("record") UserBase record, @Param("example") UserBaseExample example);

    int updateByPrimaryKeySelective(UserBase record);

    int updateByPrimaryKey(UserBase record);
}