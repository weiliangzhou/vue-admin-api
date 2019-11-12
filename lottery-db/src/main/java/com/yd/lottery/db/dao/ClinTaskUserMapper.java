package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.ClinTaskUser;
import com.yd.lottery.db.domain.ClinTaskUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClinTaskUserMapper {
    long countByExample(ClinTaskUserExample example);

    int deleteByExample(ClinTaskUserExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(ClinTaskUser record);

    int insertSelective(ClinTaskUser record);

    ClinTaskUser selectOneByExample(ClinTaskUserExample example);

    ClinTaskUser selectOneByExampleSelective(@Param("example") ClinTaskUserExample example, @Param("selective") ClinTaskUser.Column ... selective);

    List<ClinTaskUser> selectByExampleSelective(@Param("example") ClinTaskUserExample example, @Param("selective") ClinTaskUser.Column ... selective);

    List<ClinTaskUser> selectByExample(ClinTaskUserExample example);

    ClinTaskUser selectByPrimaryKeySelective(@Param("kid") Long kid, @Param("selective") ClinTaskUser.Column ... selective);

    ClinTaskUser selectByPrimaryKey(Long kid);

    int updateByExampleSelective(@Param("record") ClinTaskUser record, @Param("example") ClinTaskUserExample example);

    int updateByExample(@Param("record") ClinTaskUser record, @Param("example") ClinTaskUserExample example);

    int updateByPrimaryKeySelective(ClinTaskUser record);

    int updateByPrimaryKey(ClinTaskUser record);
}