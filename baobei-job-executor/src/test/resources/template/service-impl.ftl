package ${serviceImplPackage};

import ${mapperPackage}.${domainNameUpperCamel}Mapper;
import ${basePackage}.domain.${domainNameUpperCamel};
import ${servicePackage}.${domainNameUpperCamel}Service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.lang.${pkDataType};
import java.util.List;

import javax.annotation.Resource;

/**
 * ${description} - ServiceImpl接口实现类
 *
 * @author ${author} on ${date}
 */
@Service
@Transactional
public class ${domainNameUpperCamel}ServiceImpl implements ${domainNameUpperCamel}Service {

    @Resource
    private ${domainNameUpperCamel}Mapper ${domainNameLowerCamel}Mapper;

    @Override
    public int deleteByPrimaryKey(${pkDataType} id) {
        return ${domainNameLowerCamel}Mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(${domainNameUpperCamel} ${domainNameLowerCamel}) {
        return ${domainNameLowerCamel}Mapper.insert(${domainNameLowerCamel});
    }

    @Override
    public ${domainNameUpperCamel} selectByPrimaryKey(${pkDataType} id) {
        return ${domainNameLowerCamel}Mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<${domainNameUpperCamel}> selectAll() {
        return ${domainNameLowerCamel}Mapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(${domainNameUpperCamel} ${domainNameLowerCamel}) {
        return ${domainNameLowerCamel}Mapper.updateByPrimaryKey(${domainNameLowerCamel});
    }

}