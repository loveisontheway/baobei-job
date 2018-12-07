package com.baobei.job.executor.service.second;

import com.baobei.job.executor.domain.LeaderFeedback;
import java.util.List;
import java.lang.Integer;

/**
 * 负责人反馈表 - Service接口类
 *
 * @author jiangjialiang on 2018/12/05
 */
public interface LeaderFeedbackService {

    int deleteByPrimaryKey(Integer id);

    int insert(LeaderFeedback leaderFeedback);

    LeaderFeedback selectByPrimaryKey(Integer id);

    List<LeaderFeedback> selectAll();

    int updateByPrimaryKey(LeaderFeedback leaderFeedback);

}