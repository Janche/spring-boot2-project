package ${modulePackage}.${moduleName}.controller;

import ${basePackage}.common.exception.ServiceException;
import ${modulePackage}.${moduleName}.domain.${modelNameUpperCamel};
import ${modulePackage}.${moduleName}.service.${modelNameUpperCamel}Service;
import ${basePackage}.common.utils.CoreUtils;
import ${basePackage}.common.utils.restResult.RestResult;
import ${basePackage}.common.utils.restResult.ResultGenerator;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*
* @author ${author}
* @date ${date}
*/
@Slf4j
@RestController
@RequestMapping("${baseRequestMapping}")//TODO 1. 适当修改url
public class ${modelNameUpperCamel}Controller {
    @Resource
    private ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;

    public static final Map<String, String> VALID_MESSAGE;

    static {
        VALID_MESSAGE = new HashMap<>(5);
        //TODO 2. 添加验证信息，可以有多个
        //eg VALID_MESSAGE.put("code", "检验项目编码已存在");
    }

    @PostMapping("/add")
    public RestResult add(${modelNameUpperCamel} ${modelNameLowerCamel}) {
        //TODO 3.添加需要判断重复的字段, 可以为多个
        // this.isValid("${modelNameLowerCamel}Code", ${modelNameLowerCamel}.get${modelNameUpperCamel}Code());
        ${modelNameLowerCamel}.setId(CoreUtils.getUUID());
        ${modelNameLowerCamel}.setGmtCreate(new Date());
        ${modelNameLowerCamel}Service.save(${modelNameLowerCamel});
        return ResultGenerator.genSuccessResult().setMessage("保存成功");
    }

    @PostMapping("/delete")
    public RestResult delete(@RequestParam String id) {
        ${modelNameLowerCamel}Service.deleteById(id);
        return ResultGenerator.genSuccessResult().setMessage("删除成功");
    }

    @PostMapping("/update")
    public RestResult update(${modelNameUpperCamel} ${modelNameLowerCamel}) {
         //TODO 4.添加需要判断重复的字段, 可以为多个
        // ${modelNameUpperCamel} old${modelNameUpperCamel} = ${modelNameLowerCamel}Service.findById(${modelNameLowerCamel}.getId());
        // String code = ${modelNameLowerCamel}.get${modelNameUpperCamel}Code();
        // if(!code.equals(old${modelNameUpperCamel}.get${modelNameUpperCamel}Code())){
        //     this.isValid("${modelNameLowerCamel}Code", code);
        // }
        ${modelNameLowerCamel}.setGmtModified(new Date());
        ${modelNameLowerCamel}Service.update(${modelNameLowerCamel});
        return ResultGenerator.genSuccessResult().setMessage("修改成功");
    }

    @PostMapping("/search")
    public RestResult search(@RequestParam(defaultValue = "1") Integer page,
                            @RequestParam(defaultValue = "10") Integer size,
                            @RequestParam(defaultValue = "gmtCreate") String sortField, //TODO 3. 设置排序
                            @RequestParam(defaultValue = "desc") String sortOrder,
                            @RequestParam(required = false, defaultValue = "") String query) {
        List<${modelNameUpperCamel}> list = ${modelNameLowerCamel}Service.search(page, size, sortField, sortOrder, query);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    //TODO 5. 为实体类的时间类型字段添加注解，指定时间的格式
    //@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    /**
     * 用于下拉列表
     */
    @PostMapping("/list")
    public RestResult search() {
        List<${modelNameUpperCamel}> list = ${modelNameLowerCamel}Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/isValid")
    public RestResult isValid(@RequestParam String key, String value) {
        Boolean isValid = ${modelNameLowerCamel}Service.isValid(key, value);
        if (isValid) {
            return ResultGenerator.genSuccessResult();
        } else {
            String[] ret = {""};
            VALID_MESSAGE.forEach((k, v) -> {
                if (k.equals(key)) {
                    ret[0] = v;
                }
            });
            throw new ServiceException(ret[0]);
        }
    }
}
