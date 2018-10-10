package com.example.modules.patient.domain;

import javax.persistence.*;

@Table(name = "decision_proc")
public class DecisionProc {
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
     * 决策流程图路径
     */
    @Column(name = "deci_img_path")
    private String deciImgPath;

    /**
     * 决策说明
     */
    @Column(name = "deci_desc")
    private String deciDesc;

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
     * 获取决策流程图路径
     *
     * @return deci_img_path - 决策流程图路径
     */
    public String getDeciImgPath() {
        return deciImgPath;
    }

    /**
     * 设置决策流程图路径
     *
     * @param deciImgPath 决策流程图路径
     */
    public void setDeciImgPath(String deciImgPath) {
        this.deciImgPath = deciImgPath;
    }

    /**
     * 获取决策说明
     *
     * @return deci_desc - 决策说明
     */
    public String getDeciDesc() {
        return deciDesc;
    }

    /**
     * 设置决策说明
     *
     * @param deciDesc 决策说明
     */
    public void setDeciDesc(String deciDesc) {
        this.deciDesc = deciDesc;
    }
}