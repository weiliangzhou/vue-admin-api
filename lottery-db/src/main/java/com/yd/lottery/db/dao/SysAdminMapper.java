package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.SysAdmin;
import com.yd.lottery.db.domain.SysAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAdminMapper {
    long countByExample(SysAdminExample example);

    int deleteByExample(SysAdminExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(SysAdmin record);

    int insertSelective(SysAdmin record);

    SysAdmin selectOneByExample(SysAdminExample example);

    SysAdmin selectOneByExampleSelective(@Param("example") SysAdminExample example, @Param("selective") SysAdmin.Column ... selective);

    List<SysAdmin> selectByExampleSelective(@Param("example") SysAdminExample example, @Param("selective") SysAdmin.Column ... selective);

    List<SysAdmin> selectByExample(SysAdminExample example);

    SysAdmin selectByPrimaryKeySelective(@Param("kid") Long kid, @Param("selective") SysAdmin.Column ... selective);

    SysAdmin selectByPrimaryKey(Long kid);

    SysAdmin selectByPrimaryKeyWithLogicalDelete(@Param("kid") Long kid, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") SysAdmin record, @Param("example") SysAdminExample example);

    int updateByExample(@Param("record") SysAdmin record, @Param("example") SysAdminExample example);

    int updateByPrimaryKeySelective(SysAdmin record);

    int updateByPrimaryKey(SysAdmin record);

    int logicalDeleteByExample(@Param("example") SysAdminExample example);

    int logicalDeleteByPrimaryKey(Long kid);
}