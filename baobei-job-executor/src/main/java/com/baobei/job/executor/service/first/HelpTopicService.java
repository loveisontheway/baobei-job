package com.baobei.job.executor.service.first;

import com.baobei.job.executor.domain.HelpTopic;
import java.util.List;
import java.lang.Integer;

/**
 * 主题 - Service接口类
 *
 * @author jiangjialiang on 2018/12/07
 */
public interface HelpTopicService {

    int deleteByPrimaryKey(Integer id);

    int insert(HelpTopic helpTopic);

    HelpTopic selectByPrimaryKey(Integer id);

    List<HelpTopic> selectAll();

    int updateByPrimaryKey(HelpTopic helpTopic);

}