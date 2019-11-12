package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.SysLog;
import com.yd.lottery.db.domain.SysLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLogMapper {
    long countByExample(SysLogExample example);

    int deleteByExample(SysLogExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectOneByExample(SysLogExample example);

    SysLog selectOneByExampleSelective(@Param("example") SysLogExample example, @Param("selective") SysLog.Column ... selective);

    List<SysLog> selectByExampleSelective(@Param("example") SysLogExample example, @Param("selective") SysLog.Column ... selective);

    List<SysLog> selectByExample(SysLogExample example);

    SysLog selectByPrimaryKeySelective(@Param("kid") Long kid, @Param("selective") SysLog.Column ... selective);

    SysLog selectByPrimaryKey(Long kid);

    SysLog selectByPrimaryKeyWithLogicalDelete(@Param("kid") Long kid, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") SysLog record, @Param("example") SysLogExample example);

    int updateByExample(@Param("record") SysLog record, @Param("example") SysLogExample example);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);

    int logicalDeleteByExample(@Param("example") SysLogExample example);

    int logicalDeleteByPrimaryKey(Long kid);
}