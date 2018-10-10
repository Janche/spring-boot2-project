package com.example.modules.patient.domain;

import javax.persistence.*;

@Table(name = "decision_rule")
public class DecisionRule {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 门诊号
     */
    @Column(name = "out_num")
    private String outNum;

    /**
     * 规则编号
     */
    @Column(name = "rule_num")
    private Integer ruleNum;

    /**
     * 决策规则
     */
    @Column(name = "deci_rule")
    private String deciRule;

    /**
     * 文献路径
     */
    @Column(name = "lite_path")
    private String litePath;

    /**
     * 文献描述
     */
    @Column(name = "lite_desc")
    private String liteDesc;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取门诊号
     *
     * @return out_num - 门诊号
     */
    public String getOutNum() {
        return outNum;
    }

    /**
     * 设置门诊号
     *
     * @param outNum 门诊号
     */
    public void setOutNum(String outNum) {
        this.outNum = outNum;
    }

    /**
     * 获取规则编号
     *
     * @return rule_num - 规则编号
     */
    public Integer getRuleNum() {
        return ruleNum;
    }

    /**
     * 设置规则编号
     *
     * @param ruleNum 规则编号
     */
    public void setRuleNum(Integer ruleNum) {
        this.ruleNum = ruleNum;
    }

    /**
     * 获取决策规则
     *
     * @return deci_rule - 决策规则
     */
    public String getDeciRule() {
        return deciRule;
    }

    /**
     * 设置决策规则
     *
     * @param deciRule 决策规则
     */
    public void setDeciRule(String deciRule) {
        this.deciRule = deciRule;
    }

    /**
     * 获取文献路径
     *
     * @return lite_path - 文献路径
     */
    public String getLitePath() {
        return litePath;
    }

    /**
     * 设置文献路径
     *
     * @param litePath 文献路径
     */
    public void setLitePath(String litePath) {
        this.litePath = litePath;
    }

    public String getLiteDesc() {
        return liteDesc;
    }

    public void setLiteDesc(String liteDesc) {
        this.liteDesc = liteDesc;
    }
}