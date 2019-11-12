package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.SysPermission;
import com.yd.lottery.db.domain.SysPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPermissionMapper {
    long countByExample(SysPermissionExample example);

    int deleteByExample(SysPermissionExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectOneByExample(SysPermissionExample example);

    SysPermission selectOneByExampleSelective(@Param("example") SysPermissionExample example, @Param("selective") SysPermission.Column ... selective);

    List<SysPermission> selectByExampleSelective(@Param("example") SysPermissionExample example, @Param("selective") SysPermission.Column ... selective);

    List<SysPermission> selectByExample(SysPermissionExample example);

    SysPermission selectByPrimaryKeySelective(@Param("kid") Long kid, @Param("selective") SysPermission.Column ... selective);

    SysPermission selectByPrimaryKey(Long kid);

    SysPermission selectByPrimaryKeyWithLogicalDelete(@Param("kid") Long kid, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);

    int logicalDeleteByExample(@Param("example") SysPermissionExample example);

    int logicalDeleteByPrimaryKey(Long kid);
}