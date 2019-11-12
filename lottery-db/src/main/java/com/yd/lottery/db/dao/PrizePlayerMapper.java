package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.PrizePlayer;
import com.yd.lottery.db.domain.PrizePlayerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrizePlayerMapper {
    long countByExample(PrizePlayerExample example);

    int deleteByExample(PrizePlayerExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(PrizePlayer record);

    int insertSelective(PrizePlayer record);

    PrizePlayer selectOneByExample(PrizePlayerExample example);

    PrizePlayer selectOneByExampleSelective(@Param("example") PrizePlayerExample example, @Param("selective") PrizePlayer.Column ... selective);

    List<PrizePlayer> selectByExampleSelective(@Param("example") PrizePlayerExample example, @Param("selective") PrizePlayer.Column ... selective);

    List<PrizePlayer> selectByExample(PrizePlayerExample example);

    PrizePlayer selectByPrimaryKeySelective(@Param("kid") Long kid, @Param("selective") PrizePlayer.Column ... selective);

    PrizePlayer selectByPrimaryKey(Long kid);

    int updateByExampleSelective(@Param("record") PrizePlayer record, @Param("example") PrizePlayerExample example);

    int updateByExample(@Param("record") PrizePlayer record, @Param("example") PrizePlayerExample example);

    int updateByPrimaryKeySelective(PrizePlayer record);

    int updateByPrimaryKey(PrizePlayer record);
}