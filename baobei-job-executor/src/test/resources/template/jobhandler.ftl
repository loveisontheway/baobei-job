package ${basePackage}.jobhandler;

import ${servicePackage}.${domainNameUpperCamel}Service;
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
 * ${description} - JobHandler类
 *
 * @author ${author} on ${date}
 */
@Api(description = "${description}")
@JobHandler(value="${baseRequestMapping}")
@Component
public class ${domainNameUpperCamel}JobHandler extends IJobHandler {

    private Logger logger = LoggerFactory.getLogger(${domainNameUpperCamel}JobHandler.class);

    @Resource
    private ${domainNameUpperCamel}Service ${domainNameLowerCamel}Service;

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