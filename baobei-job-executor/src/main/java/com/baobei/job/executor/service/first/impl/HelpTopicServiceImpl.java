package com.baobei.job.executor.service.first.impl;

import com.baobei.job.executor.mapper.first.HelpTopicMapper;
import com.baobei.job.executor.domain.HelpTopic;
import com.baobei.job.executor.service.first.HelpTopicService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.Integer;
import java.util.List;

import javax.annotation.Resource;

/**
 * 主题 - ServiceImpl接口实现类
 *
 * @author jiangjialiang on 2018/12/07
 */
@Service
@Transactional
public class HelpTopicServiceImpl implements HelpTopicService {

    @Resource
    private HelpTopicMapper helpTopicMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return helpTopicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HelpTopic helpTopic) {
        return helpTopicMapper.insert(helpTopic);
    }

    @Override
    public HelpTopic selectByPrimaryKey(Integer id) {
        return helpTopicMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HelpTopic> selectAll() {
        return helpTopicMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(HelpTopic helpTopic) {
        return helpTopicMapper.updateByPrimaryKey(helpTopic);
    }

}