package com.example.modules.patient.DTO;

import com.example.modules.patient.domain.DecisionRule;
import com.example.modules.patient.domain.DrugCase;
import lombok.Data;

import java.util.List;

/**
 * @author lirong
 * @version v1.0
 * @since 2018/08/08 16:51
 */
@Data
public class PlanDTO {
    /**
     * 患者id
     */
    private Integer pid;

    /**
     * 门诊号
     */
    private String outNum;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private String age;

    /**
     * 体重
     */
    private String weight;

    /********************用药方案*******************/

    private DrugCase drugPlan;

    /********************决策流程*******************/

    /**
     * 决策流程图路径
     */
    private String deciImgPath;

    /********************决策规则*******************/

    private List<DecisionRule> rules;


}
