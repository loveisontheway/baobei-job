package com.baobei.job.executor.service.second.impl;

import com.baobei.job.executor.mapper.second.LeaderFeedbackMapper;
import com.baobei.job.executor.domain.LeaderFeedback;
import com.baobei.job.executor.service.second.LeaderFeedbackService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.Integer;
import java.util.List;

import javax.annotation.Resource;

/**
 * 负责人反馈表 - ServiceImpl接口实现类
 *
 * @author jiangjialiang on 2018/12/05
 */
@Service
@Transactional
public class LeaderFeedbackServiceImpl implements LeaderFeedbackService {

    @Resource
    private LeaderFeedbackMapper leaderFeedbackMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return leaderFeedbackMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LeaderFeedback leaderFeedback) {
        return leaderFeedbackMapper.insert(leaderFeedback);
    }

    @Override
    public LeaderFeedback selectByPrimaryKey(Integer id) {
        return leaderFeedbackMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<LeaderFeedback> selectAll() {
        return leaderFeedbackMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(LeaderFeedback leaderFeedback) {
        return leaderFeedbackMapper.updateByPrimaryKey(leaderFeedback);
    }

}