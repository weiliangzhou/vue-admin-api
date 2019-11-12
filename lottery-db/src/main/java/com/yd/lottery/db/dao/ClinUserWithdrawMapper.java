package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.ClinUserWithdraw;
import com.yd.lottery.db.domain.ClinUserWithdrawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClinUserWithdrawMapper {
    long countByExample(ClinUserWithdrawExample example);

    int deleteByExample(ClinUserWithdrawExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(ClinUserWithdraw record);

    int insertSelective(ClinUserWithdraw record);

    ClinUserWithdraw selectOneByExample(ClinUserWithdrawExample example);

    ClinUserWithdraw selectOneByExampleSelective(@Param("example") ClinUserWithdrawExample example, @Param("selective") ClinUserWithdraw.Column ... selective);

    List<ClinUserWithdraw> selectByExampleSelective(@Param("example") ClinUserWithdrawExample example, @Param("selective") ClinUserWithdraw.Column ... selective);

    List<ClinUserWithdraw> selectByExample(ClinUserWithdrawExample example);

    ClinUserWithdraw selectByPrimaryKeySelective(@Param("kid") Long kid, @Param("selective") ClinUserWithdraw.Column ... selective);

    ClinUserWithdraw selectByPrimaryKey(Long kid);

    int updateByExampleSelective(@Param("record") ClinUserWithdraw record, @Param("example") ClinUserWithdrawExample example);

    int updateByExample(@Param("record") ClinUserWithdraw record, @Param("example") ClinUserWithdrawExample example);

    int updateByPrimaryKeySelective(ClinUserWithdraw record);

    int updateByPrimaryKey(ClinUserWithdraw record);
}