package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.Prize;
import com.yd.lottery.db.domain.PrizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrizeMapper {
    long countByExample(PrizeExample example);

    int deleteByExample(PrizeExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(Prize record);

    int insertSelective(Prize record);

    Prize selectOneByExample(PrizeExample example);

    Prize selectOneByExampleSelective(@Param("example") PrizeExample example, @Param("selective") Prize.Column ... selective);

    List<Prize> selectByExampleSelective(@Param("example") PrizeExample example, @Param("selective") Prize.Column ... selective);

    List<Prize> selectByExample(PrizeExample example);

    Prize selectByPrimaryKeySelective(@Param("kid") Long kid, @Param("selective") Prize.Column ... selective);

    Prize selectByPrimaryKey(Long kid);

    int updateByExampleSelective(@Param("record") Prize record, @Param("example") PrizeExample example);

    int updateByExample(@Param("record") Prize record, @Param("example") PrizeExample example);

    int updateByPrimaryKeySelective(Prize record);

    int updateByPrimaryKey(Prize record);
}