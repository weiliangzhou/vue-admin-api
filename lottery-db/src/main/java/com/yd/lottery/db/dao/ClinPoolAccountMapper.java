package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.ClinPoolAccount;
import com.yd.lottery.db.domain.ClinPoolAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClinPoolAccountMapper {
    long countByExample(ClinPoolAccountExample example);

    int deleteByExample(ClinPoolAccountExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(ClinPoolAccount record);

    int insertSelective(ClinPoolAccount record);

    ClinPoolAccount selectOneByExample(ClinPoolAccountExample example);

    ClinPoolAccount selectOneByExampleSelective(@Param("example") ClinPoolAccountExample example, @Param("selective") ClinPoolAccount.Column ... selective);

    List<ClinPoolAccount> selectByExampleSelective(@Param("example") ClinPoolAccountExample example, @Param("selective") ClinPoolAccount.Column ... selective);

    List<ClinPoolAccount> selectByExample(ClinPoolAccountExample example);

    ClinPoolAccount selectByPrimaryKeySelective(@Param("kid") Long kid, @Param("selective") ClinPoolAccount.Column ... selective);

    ClinPoolAccount selectByPrimaryKey(Long kid);

    int updateByExampleSelective(@Param("record") ClinPoolAccount record, @Param("example") ClinPoolAccountExample example);

    int updateByExample(@Param("record") ClinPoolAccount record, @Param("example") ClinPoolAccountExample example);

    int updateByPrimaryKeySelective(ClinPoolAccount record);

    int updateByPrimaryKey(ClinPoolAccount record);
}