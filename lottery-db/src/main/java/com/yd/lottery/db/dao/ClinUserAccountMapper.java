package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.ClinUserAccount;
import com.yd.lottery.db.domain.ClinUserAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClinUserAccountMapper {
    long countByExample(ClinUserAccountExample example);

    int deleteByExample(ClinUserAccountExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(ClinUserAccount record);

    int insertSelective(ClinUserAccount record);

    ClinUserAccount selectOneByExample(ClinUserAccountExample example);

    ClinUserAccount selectOneByExampleSelective(@Param("example") ClinUserAccountExample example, @Param("selective") ClinUserAccount.Column ... selective);

    List<ClinUserAccount> selectByExampleSelective(@Param("example") ClinUserAccountExample example, @Param("selective") ClinUserAccount.Column ... selective);

    List<ClinUserAccount> selectByExample(ClinUserAccountExample example);

    ClinUserAccount selectByPrimaryKeySelective(@Param("kid") Long kid, @Param("selective") ClinUserAccount.Column ... selective);

    ClinUserAccount selectByPrimaryKey(Long kid);

    int updateByExampleSelective(@Param("record") ClinUserAccount record, @Param("example") ClinUserAccountExample example);

    int updateByExample(@Param("record") ClinUserAccount record, @Param("example") ClinUserAccountExample example);

    int updateByPrimaryKeySelective(ClinUserAccount record);

    int updateByPrimaryKey(ClinUserAccount record);
}