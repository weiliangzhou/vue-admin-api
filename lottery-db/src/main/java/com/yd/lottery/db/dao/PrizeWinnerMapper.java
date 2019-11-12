package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.PrizeWinner;
import com.yd.lottery.db.domain.PrizeWinnerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrizeWinnerMapper {
    long countByExample(PrizeWinnerExample example);

    int deleteByExample(PrizeWinnerExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(PrizeWinner record);

    int insertSelective(PrizeWinner record);

    PrizeWinner selectOneByExample(PrizeWinnerExample example);

    PrizeWinner selectOneByExampleSelective(@Param("example") PrizeWinnerExample example, @Param("selective") PrizeWinner.Column ... selective);

    List<PrizeWinner> selectByExampleSelective(@Param("example") PrizeWinnerExample example, @Param("selective") PrizeWinner.Column ... selective);

    List<PrizeWinner> selectByExample(PrizeWinnerExample example);

    PrizeWinner selectByPrimaryKeySelective(@Param("kid") Long kid, @Param("selective") PrizeWinner.Column ... selective);

    PrizeWinner selectByPrimaryKey(Long kid);

    int updateByExampleSelective(@Param("record") PrizeWinner record, @Param("example") PrizeWinnerExample example);

    int updateByExample(@Param("record") PrizeWinner record, @Param("example") PrizeWinnerExample example);

    int updateByPrimaryKeySelective(PrizeWinner record);

    int updateByPrimaryKey(PrizeWinner record);
}