package com.example.modules.patient.domain;

import javax.persistence.*;

@Table(name = "drug_case")
public class DrugCase {
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
     * 药物名称
     */
    @Column(name = "drug_name")
    private String drugName;

    /**
     * 给药方式
     */
    @Column(name = "deli_way")
    private String deliWay;

    /**
     * 负荷剂量
     */
    @Column(name = "load_dose")
    private String loadDose;

    /**
     * 维持剂量
     */
    @Column(name = "main_dose")
    private String mainDose;

    /**
     * 给药间隔
     */
    @Column(name = "inte_deli")
    private String inteDeli;

    /**
     * 用药持续时间
     */
    @Column(name = "cont_deli")
    private String contDeli;

    /**
     * 药时曲线图路径
     */
    @Column(name = "bl_img_path")
    private String blImgPath;

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
     * 获取药物名称
     *
     * @return drug_name - 药物名称
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * 设置药物名称
     *
     * @param drugName 药物名称
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    /**
     * 获取给药方式
     *
     * @return deli_way - 给药方式
     */
    public String getDeliWay() {
        return deliWay;
    }

    /**
     * 设置给药方式
     *
     * @param deliWay 给药方式
     */
    public void setDeliWay(String deliWay) {
        this.deliWay = deliWay;
    }

    /**
     * 获取负荷剂量
     *
     * @return load_dose - 负荷剂量
     */
    public String getLoadDose() {
        return loadDose;
    }

    /**
     * 设置负荷剂量
     *
     * @param loadDose 负荷剂量
     */
    public void setLoadDose(String loadDose) {
        this.loadDose = loadDose;
    }

    /**
     * 获取维持剂量
     *
     * @return main_dose - 维持剂量
     */
    public String getMainDose() {
        return mainDose;
    }

    /**
     * 设置维持剂量
     *
     * @param mainDose 维持剂量
     */
    public void setMainDose(String mainDose) {
        this.mainDose = mainDose;
    }

    /**
     * 获取给药间隔
     *
     * @return inte_deli - 给药间隔
     */
    public String getInteDeli() {
        return inteDeli;
    }

    /**
     * 设置给药间隔
     *
     * @param inteDeli 给药间隔
     */
    public void setInteDeli(String inteDeli) {
        this.inteDeli = inteDeli;
    }

    /**
     * 获取用药持续时间
     *
     * @return cont_deli - 用药持续时间
     */
    public String getContDeli() {
        return contDeli;
    }

    /**
     * 设置用药持续时间
     *
     * @param contDeli 用药持续时间
     */
    public void setContDeli(String contDeli) {
        this.contDeli = contDeli;
    }

    /**
     * 获取药时曲线图路径
     *
     * @return bl_img_path - 药时曲线图路径
     */
    public String getBlImgPath() {
        return blImgPath;
    }

    /**
     * 设置药时曲线图路径
     *
     * @param blImgPath 药时曲线图路径
     */
    public void setBlImgPath(String blImgPath) {
        this.blImgPath = blImgPath;
    }
}