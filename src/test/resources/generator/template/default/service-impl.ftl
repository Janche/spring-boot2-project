package ${basePackage}.modules.${moduleName}.service.impl;

import ${basePackage}.modules.${moduleName}.dao.${modelNameUpperCamel}Mapper;
import ${basePackage}.modules.${moduleName}.domain.${modelNameUpperCamel};
import ${basePackage}.modules.${moduleName}.service.${modelNameUpperCamel}Service;
import ${basePackage}.common.core.AbstractService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
*
* @author ${author}
* @date ${date}
*
*/
@Slf4j
@Service
@Transactional
public class ${modelNameUpperCamel}ServiceImpl extends AbstractService<${modelNameUpperCamel}> implements ${modelNameUpperCamel}Service {
    @Resource
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;

}
