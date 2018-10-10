package com.example.modules.patient.domain;

import javax.persistence.*;

@Table(name = "patient_inf")
public class PatientInf {
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

    /**
     * 民族
     */
    private String nation;

    /**
     * 感染类型
     */
    @Column(name = "infe_type")
    private String infeType;

    /**
     * 感染部位
     */
    @Column(name = "infe_part")
    private String infePart;

    /**
     * 诊断
     */
    @Column(name = "diag_info")
    private String diagInfo;

    /**
     * APACHE II评分
     */
    @Column(name = "apa_score")
    private String apaScore;

    /**
     * 病史概要
     */
    @Column(name = "dis_outline")
    private String disOutline;

    /**
     * 肌酐清除率
     */
    @Column(name = "crcl_rate")
    private String crclRate;

    /**
     * 万古霉素测定方法
     */
    @Column(name = "wgms_chkm")
    private String wgmsChkm;

    /**
     * 体温
     */
    private String tempe;

    /**
     * 降钙素原
     */
    private String calci;

    /**
     * C反应蛋白
     */
    @Column(name = "c_react_po")
    private String cReactPo;

    /**
     * 中性粒细胞绝对数
     */
    @Column(name = "granu_num")
    private String granuNum;

    /**
     * 白细胞计数
     */
    @Column(name = "w_blood_ce")
    private String wBloodCe;

    /**
     * 葡萄糖
     */
    private String glucose;

    /**
     * 血肌酐
     */
    @Column(name = "serum_cte")
    private String serumCte;

    /**
     * 血尿酸
     */
    @Column(name = "bl_uric_ac")
    private String blUricAc;

    /**
     * 血尿素氮
     */
    @Column(name = "bl_urea_ni")
    private String blUreaNi;

    /**
     * 胱抑素C
     */
    @Column(name = "systatin_c")
    private String systatinC;

    /**
     * beta2微球蛋白
     */
    @Column(name = "beta2_mglob")
    private String beta2Mglob;

    /**
     * 总蛋白
     */
    @Column(name = "total_po")
    private String totalPo;

    /**
     * 白蛋白
     */
    private String albumin;

    /**
     * 球蛋白
     */
    private String globulin;

    /**
     * 直接胆红素
     */
    @Column(name = "direct_bi")
    private String directBi;

    /**
     * 间接胆红素
     */
    @Column(name = "indirect_bi")
    private String indirectBi;

    /**
     * 总胆红素
     */
    @Column(name = "total_bi")
    private String totalBi;

    /**
     * 谷丙转氨酶
     */
    private String ast;

    /**
     * 谷草转氨酶
     */
    private String alt;

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
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 获取体重
     *
     * @return weight - 体重
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置体重
     *
     * @param weight 体重
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * 获取民族
     *
     * @return nation - 民族
     */
    public String getNation() {
        return nation;
    }

    /**
     * 设置民族
     *
     * @param nation 民族
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * 获取感染类型
     *
     * @return infe_type - 感染类型
     */
    public String getInfeType() {
        return infeType;
    }

    /**
     * 设置感染类型
     *
     * @param infeType 感染类型
     */
    public void setInfeType(String infeType) {
        this.infeType = infeType;
    }

    /**
     * 获取感染部位
     *
     * @return infe_part - 感染部位
     */
    public String getInfePart() {
        return infePart;
    }

    /**
     * 设置感染部位
     *
     * @param infePart 感染部位
     */
    public void setInfePart(String infePart) {
        this.infePart = infePart;
    }

    /**
     * 获取诊断
     *
     * @return diag_info - 诊断
     */
    public String getDiagInfo() {
        return diagInfo;
    }

    /**
     * 设置诊断
     *
     * @param diagInfo 诊断
     */
    public void setDiagInfo(String diagInfo) {
        this.diagInfo = diagInfo;
    }

    /**
     * 获取APACHE II评分
     *
     * @return apa_score - APACHE II评分
     */
    public String getApaScore() {
        return apaScore;
    }

    /**
     * 设置APACHE II评分
     *
     * @param apaScore APACHE II评分
     */
    public void setApaScore(String apaScore) {
        this.apaScore = apaScore;
    }

    /**
     * 获取病史概要
     *
     * @return dis_outline - 病史概要
     */
    public String getDisOutline() {
        return disOutline;
    }

    /**
     * 设置病史概要
     *
     * @param disOutline 病史概要
     */
    public void setDisOutline(String disOutline) {
        this.disOutline = disOutline;
    }

    /**
     * 获取肌酐清除率
     *
     * @return crcl_rate - 肌酐清除率
     */
    public String getCrclRate() {
        return crclRate;
    }

    /**
     * 设置肌酐清除率
     *
     * @param crclRate 肌酐清除率
     */
    public void setCrclRate(String crclRate) {
        this.crclRate = crclRate;
    }

    /**
     * 获取万古霉素测定方法
     *
     * @return wgms_chkm - 万古霉素测定方法
     */
    public String getWgmsChkm() {
        return wgmsChkm;
    }

    /**
     * 设置万古霉素测定方法
     *
     * @param wgmsChkm 万古霉素测定方法
     */
    public void setWgmsChkm(String wgmsChkm) {
        this.wgmsChkm = wgmsChkm;
    }

    /**
     * 获取体温
     *
     * @return tempe - 体温
     */
    public String getTempe() {
        return tempe;
    }

    /**
     * 设置体温
     *
     * @param tempe 体温
     */
    public void setTempe(String tempe) {
        this.tempe = tempe;
    }

    /**
     * 获取降钙素原
     *
     * @return calci - 降钙素原
     */
    public String getCalci() {
        return calci;
    }

    /**
     * 设置降钙素原
     *
     * @param calci 降钙素原
     */
    public void setCalci(String calci) {
        this.calci = calci;
    }

    /**
     * 获取C反应蛋白
     *
     * @return c_react_po - C反应蛋白
     */
    public String getcReactPo() {
        return cReactPo;
    }

    /**
     * 设置C反应蛋白
     *
     * @param cReactPo C反应蛋白
     */
    public void setcReactPo(String cReactPo) {
        this.cReactPo = cReactPo;
    }

    /**
     * 获取中性粒细胞绝对数
     *
     * @return granu_num - 中性粒细胞绝对数
     */
    public String getGranuNum() {
        return granuNum;
    }

    /**
     * 设置中性粒细胞绝对数
     *
     * @param granuNum 中性粒细胞绝对数
     */
    public void setGranuNum(String granuNum) {
        this.granuNum = granuNum;
    }

    /**
     * 获取白细胞计数
     *
     * @return w_blood_ce - 白细胞计数
     */
    public String getwBloodCe() {
        return wBloodCe;
    }

    /**
     * 设置白细胞计数
     *
     * @param wBloodCe 白细胞计数
     */
    public void setwBloodCe(String wBloodCe) {
        this.wBloodCe = wBloodCe;
    }

    /**
     * 获取葡萄糖
     *
     * @return glucose - 葡萄糖
     */
    public String getGlucose() {
        return glucose;
    }

    /**
     * 设置葡萄糖
     *
     * @param glucose 葡萄糖
     */
    public void setGlucose(String glucose) {
        this.glucose = glucose;
    }

    /**
     * 获取血肌酐
     *
     * @return serum_cte - 血肌酐
     */
    public String getSerumCte() {
        return serumCte;
    }

    /**
     * 设置血肌酐
     *
     * @param serumCte 血肌酐
     */
    public void setSerumCte(String serumCte) {
        this.serumCte = serumCte;
    }

    /**
     * 获取血尿酸
     *
     * @return bl_uric_ac - 血尿酸
     */
    public String getBlUricAc() {
        return blUricAc;
    }

    /**
     * 设置血尿酸
     *
     * @param blUricAc 血尿酸
     */
    public void setBlUricAc(String blUricAc) {
        this.blUricAc = blUricAc;
    }

    /**
     * 获取血尿素氮
     *
     * @return bl_urea_ni - 血尿素氮
     */
    public String getBlUreaNi() {
        return blUreaNi;
    }

    /**
     * 设置血尿素氮
     *
     * @param blUreaNi 血尿素氮
     */
    public void setBlUreaNi(String blUreaNi) {
        this.blUreaNi = blUreaNi;
    }

    /**
     * 获取胱抑素C
     *
     * @return systatin_c - 胱抑素C
     */
    public String getSystatinC() {
        return systatinC;
    }

    /**
     * 设置胱抑素C
     *
     * @param systatinC 胱抑素C
     */
    public void setSystatinC(String systatinC) {
        this.systatinC = systatinC;
    }

    /**
     * 获取beta2微球蛋白
     *
     * @return beta2_mglob - beta2微球蛋白
     */
    public String getBeta2Mglob() {
        return beta2Mglob;
    }

    /**
     * 设置beta2微球蛋白
     *
     * @param beta2Mglob beta2微球蛋白
     */
    public void setBeta2Mglob(String beta2Mglob) {
        this.beta2Mglob = beta2Mglob;
    }

    /**
     * 获取总蛋白
     *
     * @return total_po - 总蛋白
     */
    public String getTotalPo() {
        return totalPo;
    }

    /**
     * 设置总蛋白
     *
     * @param totalPo 总蛋白
     */
    public void setTotalPo(String totalPo) {
        this.totalPo = totalPo;
    }

    /**
     * 获取白蛋白
     *
     * @return albumin - 白蛋白
     */
    public String getAlbumin() {
        return albumin;
    }

    /**
     * 设置白蛋白
     *
     * @param albumin 白蛋白
     */
    public void setAlbumin(String albumin) {
        this.albumin = albumin;
    }

    /**
     * 获取球蛋白
     *
     * @return globulin - 球蛋白
     */
    public String getGlobulin() {
        return globulin;
    }

    /**
     * 设置球蛋白
     *
     * @param globulin 球蛋白
     */
    public void setGlobulin(String globulin) {
        this.globulin = globulin;
    }

    /**
     * 获取直接胆红素
     *
     * @return direct_bi - 直接胆红素
     */
    public String getDirectBi() {
        return directBi;
    }

    /**
     * 设置直接胆红素
     *
     * @param directBi 直接胆红素
     */
    public void setDirectBi(String directBi) {
        this.directBi = directBi;
    }

    /**
     * 获取间接胆红素
     *
     * @return indirect_bi - 间接胆红素
     */
    public String getIndirectBi() {
        return indirectBi;
    }

    /**
     * 设置间接胆红素
     *
     * @param indirectBi 间接胆红素
     */
    public void setIndirectBi(String indirectBi) {
        this.indirectBi = indirectBi;
    }

    /**
     * 获取总胆红素
     *
     * @return total_bi - 总胆红素
     */
    public String getTotalBi() {
        return totalBi;
    }

    /**
     * 设置总胆红素
     *
     * @param totalBi 总胆红素
     */
    public void setTotalBi(String totalBi) {
        this.totalBi = totalBi;
    }

    /**
     * 获取谷丙转氨酶
     *
     * @return ast - 谷丙转氨酶
     */
    public String getAst() {
        return ast;
    }

    /**
     * 设置谷丙转氨酶
     *
     * @param ast 谷丙转氨酶
     */
    public void setAst(String ast) {
        this.ast = ast;
    }

    /**
     * 获取谷草转氨酶
     *
     * @return alt - 谷草转氨酶
     */
    public String getAlt() {
        return alt;
    }

    /**
     * 设置谷草转氨酶
     *
     * @param alt 谷草转氨酶
     */
    public void setAlt(String alt) {
        this.alt = alt;
    }
}