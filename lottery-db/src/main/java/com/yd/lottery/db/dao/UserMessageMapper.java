package com.yd.lottery.db.dao;

import com.yd.lottery.db.domain.UserMessage;
import com.yd.lottery.db.domain.UserMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMessageMapper {
    long countByExample(UserMessageExample example);

    int deleteByExample(UserMessageExample example);

    int deleteByPrimaryKey(Long kid);

    int insert(UserMessage record);

    int insertSelective(UserMessage record);

    UserMessage selectOneByExample(UserMessageExample example);

    UserMessage selectOneByExampleSelective(@Param("example") UserMessageExample example, @Param("selective") UserMessage.Column ... selective);

    List<UserMessage> selectByExampleSelective(@Param("example") UserMessageExample example, @Param("selective") UserMessage.Column ... selective);

    List<UserMessage> selectByExample(UserMessageExample example);

    UserMessage selectByPrimaryKeySelective(@Param("kid") Long kid, @Param("selective") UserMessage.Column ... selective);

    UserMessage selectByPrimaryKey(Long kid);

    int updateByExampleSelective(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    int updateByExample(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    int updateByPrimaryKeySelective(UserMessage record);

    int updateByPrimaryKey(UserMessage record);
}