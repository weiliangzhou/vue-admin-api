package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.ClinUserSummary;
import com.yd.lottery.db.domain.ClinUserSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClinUserSummaryMapper {
    long countByExample(ClinUserSummaryExample example);

    int deleteByExample(ClinUserSummaryExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(ClinUserSummary record);

    int insertSelective(ClinUserSummary record);

    ClinUserSummary selectOneByExample(ClinUserSummaryExample example);

    ClinUserSummary selectOneByExampleSelective(@Param("example") ClinUserSummaryExample example, @Param("selective") ClinUserSummary.Column ... selective);

    List<ClinUserSummary> selectByExampleSelective(@Param("example") ClinUserSummaryExample example, @Param("selective") ClinUserSummary.Column ... selective);

    List<ClinUserSummary> selectByExample(ClinUserSummaryExample example);

    ClinUserSummary selectByPrimaryKeySelective(@Param("kid") Long kid, @Param("selective") ClinUserSummary.Column ... selective);

    ClinUserSummary selectByPrimaryKey(Long kid);

    int updateByExampleSelective(@Param("record") ClinUserSummary record, @Param("example") ClinUserSummaryExample example);

    int updateByExample(@Param("record") ClinUserSummary record, @Param("example") ClinUserSummaryExample example);

    int updateByPrimaryKeySelective(ClinUserSummary record);

    int updateByPrimaryKey(ClinUserSummary record);
}