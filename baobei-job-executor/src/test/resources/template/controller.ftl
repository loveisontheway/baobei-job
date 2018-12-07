package ${basePackage}.web;

import ${basePackage}.domain.${domainNameUpperCamel};
import ${servicePackage}.${domainNameUpperCamel}Service;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;
import java.lang.${pkDataType};

/**
 * ${description} - Controller类
 *
 * @author ${author} on ${date}
 */
@Api(description = "${description}")
@Controller
@RequestMapping("${baseRequestMapping}")
public class ${domainNameUpperCamel}Controller {

    @Resource
    private ${domainNameUpperCamel}Service ${domainNameLowerCamel}Service;

    @ApiOperation(value = "删除", notes = "单表删除")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", value = "主键", required = true, dataType = "${pkDataType}")
    })
    @DeleteMapping("/delete")
    public String deleteByPrimaryKey(@RequestParam ${pkDataType} id) {
        int result = ${domainNameLowerCamel}Service.deleteByPrimaryKey(id);
        return "" + result;
    }

    @ApiOperation(value = "新增", notes = "单表新增")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "${domainNameUpperCamel}", value = "${domainNameUpperCamel}对象", required = true, dataType = "Object")
    })
    @PostMapping("/add")
    public String insert(${domainNameUpperCamel} ${domainNameLowerCamel}) {
        int result = ${domainNameLowerCamel}Service.insert(${domainNameLowerCamel});
        return "" + result;
    }

    @ApiOperation(value = "详情", notes = "单表详情")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", value = "主键", required = true, dataType = "${pkDataType}")
    })
    @GetMapping("/detail")
    public ${domainNameUpperCamel} selectByPrimaryKey(@RequestParam ${pkDataType} id) {
        ${domainNameUpperCamel} ${domainNameLowerCamel} = ${domainNameLowerCamel}Service.selectByPrimaryKey(id);
        return ${domainNameLowerCamel};
    }

    @ApiOperation(value = "集合", notes = "单表集合")
    @GetMapping("/list")
    public List<${domainNameUpperCamel}> selectAll() {
        List<${domainNameUpperCamel}> list = ${domainNameLowerCamel}Service.selectAll();
        return list;
    }

    @ApiOperation(value = "更新", notes = "单表更新")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "${domainNameUpperCamel}", value = "${domainNameUpperCamel}对象", required = true, dataType = "Object")
    })
    @PutMapping("/update")
    public String updateByPrimaryKey(${domainNameUpperCamel} ${domainNameLowerCamel}) {
        int result = ${domainNameLowerCamel}Service.updateByPrimaryKey(${domainNameLowerCamel});
        return "" + result;
    }

}