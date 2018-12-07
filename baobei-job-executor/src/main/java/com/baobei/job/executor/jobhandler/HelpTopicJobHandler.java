package com.baobei.job.executor.jobhandler;

import com.baobei.job.executor.service.first.HelpTopicService;
import com.baobei.job.core.biz.model.ReturnT;
import com.baobei.job.core.handler.IJobHandler;
import com.baobei.job.core.handler.annotation.JobHandler;
import com.baobei.job.core.log.XxlJobLogger;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.concurrent.TimeUnit;
import javax.annotation.Resource;

/**
 * 主题 - JobHandler类
 *
 * @author jiangjialiang on 2018/12/07
 */
@Api(description = "主题")
@JobHandler(value="helpTopicJobHandler")
@Component
public class HelpTopicJobHandler extends IJobHandler {

    private Logger logger = LoggerFactory.getLogger(HelpTopicJobHandler.class);

    @Resource
    private HelpTopicService helpTopicService;

    @Override
	public ReturnT<String> execute(String param) throws Exception {
        XxlJobLogger.log("BAOBEI-JOB, Hello World.");
        logger.info(">>>>>>>>>>>>>param: "+param);
        for (int i = 0; i < 5; i++) {
            XxlJobLogger.log("beat at:" + i);
            TimeUnit.SECONDS.sleep(2);
        }
        return SUCCESS;
    }

}