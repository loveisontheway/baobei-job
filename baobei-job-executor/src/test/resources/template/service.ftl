package ${servicePackage};

import ${basePackage}.domain.${domainNameUpperCamel};
import java.util.List;
import java.lang.${pkDataType};

/**
 * ${description} - Service接口类
 *
 * @author ${author} on ${date}
 */
public interface ${domainNameUpperCamel}Service {

    int deleteByPrimaryKey(${pkDataType} id);

    int insert(${domainNameUpperCamel} ${domainNameLowerCamel});

    ${domainNameUpperCamel} selectByPrimaryKey(${pkDataType} id);

    List<${domainNameUpperCamel}> selectAll();

    int updateByPrimaryKey(${domainNameUpperCamel} ${domainNameLowerCamel});

}