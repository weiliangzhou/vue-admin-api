package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.SysRole;
import com.yd.lottery.db.domain.SysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper {
    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Integer kid);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectOneByExample(SysRoleExample example);

    SysRole selectOneByExampleSelective(@Param("example") SysRoleExample example, @Param("selective") SysRole.Column ... selective);

    List<SysRole> selectByExampleSelective(@Param("example") SysRoleExample example, @Param("selective") SysRole.Column ... selective);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKeySelective(@Param("kid") Integer kid, @Param("selective") SysRole.Column ... selective);

    SysRole selectByPrimaryKey(Integer kid);

    SysRole selectByPrimaryKeyWithLogicalDelete(@Param("kid") Integer kid, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    int logicalDeleteByExample(@Param("example") SysRoleExample example);

    int logicalDeleteByPrimaryKey(Integer kid);
}