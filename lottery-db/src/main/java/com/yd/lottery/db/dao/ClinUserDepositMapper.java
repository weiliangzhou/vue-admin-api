package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.ClinUserDeposit;
import com.yd.lottery.db.domain.ClinUserDepositExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClinUserDepositMapper {
    long countByExample(ClinUserDepositExample example);

    int deleteByExample(ClinUserDepositExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(ClinUserDeposit record);

    int insertSelective(ClinUserDeposit record);

    ClinUserDeposit selectOneByExample(ClinUserDepositExample example);

    ClinUserDeposit selectOneByExampleSelective(@Param("example") ClinUserDepositExample example, @Param("selective") ClinUserDeposit.Column ... selective);

    List<ClinUserDeposit> selectByExampleSelective(@Param("example") ClinUserDepositExample example, @Param("selective") ClinUserDeposit.Column ... selective);

    List<ClinUserDeposit> selectByExample(ClinUserDepositExample example);

    ClinUserDeposit selectByPrimaryKeySelective(@Param("kid") Long kid, @Param("selective") ClinUserDeposit.Column ... selective);

    ClinUserDeposit selectByPrimaryKey(Long kid);

    int updateByExampleSelective(@Param("record") ClinUserDeposit record, @Param("example") ClinUserDepositExample example);

    int updateByExample(@Param("record") ClinUserDeposit record, @Param("example") ClinUserDepositExample example);

    int updateByPrimaryKeySelective(ClinUserDeposit record);

    int updateByPrimaryKey(ClinUserDeposit record);
}