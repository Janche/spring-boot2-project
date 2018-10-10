-- MySQL dump 10.13  Distrib 5.7.20, for Win64 (x86_64)
--
-- Host: 192.168.2.201    Database: demopmsd
-- ------------------------------------------------------
-- Server version	5.7.23-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `blood_drug`
--

DROP TABLE IF EXISTS `blood_drug`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blood_drug` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `patient_id` int(10) NOT NULL COMMENT '患者编号',
  `deli_time` varchar(16) DEFAULT NULL COMMENT '给药时间(time/h)',
  `blood_conc` varchar(24) DEFAULT NULL COMMENT '血药浓度',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blood_drug`
--

LOCK TABLES `blood_drug` WRITE;
/*!40000 ALTER TABLE `blood_drug` DISABLE KEYS */;
/*!40000 ALTER TABLE `blood_drug` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `decision_proc`
--

DROP TABLE IF EXISTS `decision_proc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `decision_proc` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `out_num` varchar(16) NOT NULL COMMENT '门诊号',
  `deci_img_path` varchar(128) DEFAULT NULL COMMENT '决策流程图路径',
  `deci_desc` varchar(256) DEFAULT NULL COMMENT '决策说明',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `decision_proc`
--

LOCK TABLES `decision_proc` WRITE;
/*!40000 ALTER TABLE `decision_proc` DISABLE KEYS */;
INSERT INTO `decision_proc` VALUES (1,'9546228F','../static/img/a1.png','决策说明'),(2,'9546245F','../static/img/a2.png','决策说明'),(3,'9546252F','../static/img/a3.png','决策说明'),(4,'9546261F','../static/img/a4.png','决策说明');
/*!40000 ALTER TABLE `decision_proc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `decision_rule`
--

DROP TABLE IF EXISTS `decision_rule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `decision_rule` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `out_num` varchar(16) NOT NULL COMMENT '门诊号',
  `rule_num` int(10) NOT NULL COMMENT '规则编号',
  `deci_rule` varchar(256) DEFAULT NULL COMMENT '决策规则',
  `lite_path` varchar(128) DEFAULT NULL COMMENT '文献路径',
  `lite_desc` varchar(255) DEFAULT NULL COMMENT '文献描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `decision_rule`
--

LOCK TABLES `decision_rule` WRITE;
/*!40000 ALTER TABLE `decision_rule` DISABLE KEYS */;
INSERT INTO `decision_rule` VALUES (1,'9546228F',1,'患者年龄51，年龄对万古霉素的目标浓度有显著影响。','../static/pdf/万古霉素血药浓度的影响因素分析.pdf','参考文献：万古霉素血药浓度的影响因素分析[J]. 中国抗生素杂志, 2017, 42(5):429-434.'),(2,'9546228F',2,'患者肌酐清除率为64.8ml/min，当病人肌酐清除率为55-75ml/min时，专家推荐万古霉素日剂量1.5g。','../static/pdf/万古霉素临床应用剂量中国专家共识.pdf','参考文献：万古霉素临床应用剂量中国专家共识[J]. 中华传染病杂志, 2012, 30(11):641-646.'),(3,'9546228F',3,'推荐用药两天后检查肌酐水平，根据血药浓度及时调整给药方案。','',''),(4,'9546245F',1,'患者年龄76，年龄对万古霉素的目标浓度有显著影响。','../static/pdf/万古霉素血药浓度的影响因素分析.pdf','参考文献：万古霉素血药浓度的影响因素分析[J]. 中国抗生素杂志, 2017, 42(5):429-434.'),(5,'9546245F',2,'患者肌酐清除率为57.6ml/min，当病人肌酐清除率为55-75ml/min时，专家推荐万古霉素日剂量1.5g。患者为严重感染，推荐使用负荷剂量。','../static/pdf/万古霉素临床应用剂量中国专家共识.pdf','参考文献：万古霉素临床应用剂量中国专家共识[J]. 中华传染病杂志, 2012, 30(11):641-646.'),(6,'9546245F',3,'患者为老人，肝肾功能可能有所下降，给药时应防止产生肾毒性。','../static/pdf/万古霉素在特殊机体状态下PK_PD及给药方案研究进展_张露.pdf','参考文献：万古霉素在特殊机体状态下PK/PD及给药方案研究进展[J]. 中外医学研究, 2017(35):159-162.'),(7,'9546252F',1,'患者年龄58，年龄对万古霉素的目标浓度有显著影响。','../static/pdf/万古霉素血药浓度的影响因素分析.pdf','参考文献：万古霉素血药浓度的影响因素分析[J]. 中国抗生素杂志, 2017, 42(5):429-434.'),(8,'9546252F',2,'患者肌酐清除率为97.8ml/min，当病人肌酐清除率为90-110ml/min时，专家推荐万古霉素日剂量2.5g。','../static/pdf/万古霉素临床应用剂量中国专家共识.pdf','参考文献：万古霉素临床应用剂量中国专家共识[J]. 中华传染病杂志, 2012, 30(11):641-646.'),(9,'9546252F',3,'患者为颅内感染，受血脑屏障影响，推荐较大剂量，但应注意肾毒性。','',''),(10,'9546261F',1,'患者年龄23，年龄对万古霉素的目标浓度有显著影响。','../static/pdf/万古霉素血药浓度的影响因素分析.pdf','参考文献：万古霉素血药浓度的影响因素分析[J]. 中国抗生素杂志, 2017, 42(5):429-434.'),(11,'9546261F',2,'患者肌酐清除率为146.7ml/min，当病人肌酐清除率>110ml/min时，专家推荐万古霉素日剂量3g。','../static/pdf/万古霉素临床应用剂量中国专家共识.pdf','参考文献：万古霉素临床应用剂量中国专家共识[J]. 中华传染病杂志, 2012, 30(11):641-646.'),(12,'9546261F',3,'患者为轻度感染，推荐可以少量给药。','','');
/*!40000 ALTER TABLE `decision_rule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drug_case`
--

DROP TABLE IF EXISTS `drug_case`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `drug_case` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `out_num` varchar(16) NOT NULL COMMENT '门诊号',
  `drug_name` varchar(32) DEFAULT NULL COMMENT '药物名称',
  `deli_way` varchar(32) DEFAULT NULL COMMENT '给药方式',
  `load_dose` varchar(24) DEFAULT NULL COMMENT '负荷剂量',
  `main_dose` varchar(24) DEFAULT NULL COMMENT '维持剂量',
  `inte_deli` varchar(16) DEFAULT NULL COMMENT '给药间隔',
  `cont_deli` varchar(16) DEFAULT NULL COMMENT '用药持续时间',
  `bl_img_path` varchar(128) DEFAULT NULL COMMENT '药时曲线图路径',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drug_case`
--

LOCK TABLES `drug_case` WRITE;
/*!40000 ALTER TABLE `drug_case` DISABLE KEYS */;
INSERT INTO `drug_case` VALUES (1,'9546228F','注射用盐酸万古霉素','静脉滴注','无','500mg','q12h','2d','../static/img/b1.png'),(2,'9546245F','注射用盐酸万古霉素','静脉滴注','1500mg','500mg','q8h','2d','../static/img/b2.png'),(3,'9546252F','注射用盐酸万古霉素','静脉滴注','无','1000mg','q8h','2d','../static/img/b3.png'),(4,'9546261F','注射用盐酸万古霉素','静脉滴注','无','1000mg','q12h','2d','../static/img/b4.png');
/*!40000 ALTER TABLE `drug_case` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_inf`
--

DROP TABLE IF EXISTS `patient_inf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient_inf` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `out_num` varchar(16) NOT NULL COMMENT '门诊号',
  `name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(4) DEFAULT NULL COMMENT '性别',
  `age` varchar(4) DEFAULT NULL COMMENT '年龄',
  `weight` varchar(12) DEFAULT NULL COMMENT '体重',
  `nation` varchar(32) DEFAULT NULL COMMENT '民族',
  `infe_type` varchar(40) DEFAULT NULL COMMENT '感染类型',
  `infe_part` varchar(40) DEFAULT NULL COMMENT '感染部位',
  `diag_info` varchar(256) DEFAULT NULL COMMENT '诊断',
  `apa_score` varchar(16) DEFAULT NULL COMMENT 'APACHE II评分',
  `dis_outline` varchar(256) DEFAULT NULL COMMENT '病史概要',
  `crcl_rate` varchar(24) DEFAULT NULL COMMENT '肌酐清除率',
  `wgms_chkm` varchar(64) DEFAULT NULL COMMENT '万古霉素测定方法',
  `tempe` varchar(24) DEFAULT NULL COMMENT '体温',
  `calci` varchar(24) DEFAULT NULL COMMENT '降钙素原',
  `c_react_po` varchar(24) DEFAULT NULL COMMENT 'C反应蛋白',
  `granu_num` varchar(24) DEFAULT NULL COMMENT '中性粒细胞绝对数',
  `w_blood_ce` varchar(24) DEFAULT NULL COMMENT '白细胞计数',
  `glucose` varchar(24) DEFAULT NULL COMMENT '葡萄糖',
  `serum_cte` varchar(24) DEFAULT NULL COMMENT '血肌酐',
  `bl_uric_ac` varchar(24) DEFAULT NULL COMMENT '血尿酸',
  `bl_urea_ni` varchar(24) DEFAULT NULL COMMENT '血尿素氮',
  `systatin_c` varchar(24) DEFAULT NULL COMMENT '胱抑素C',
  `beta2_mglob` varchar(24) DEFAULT NULL COMMENT 'beta2微球蛋白',
  `total_po` varchar(24) DEFAULT NULL COMMENT '总蛋白',
  `albumin` varchar(24) DEFAULT NULL COMMENT '白蛋白',
  `globulin` varchar(24) DEFAULT NULL COMMENT '球蛋白',
  `direct_bi` varchar(24) DEFAULT NULL COMMENT '直接胆红素',
  `indirect_bi` varchar(24) DEFAULT NULL COMMENT '间接胆红素',
  `total_bi` varchar(24) DEFAULT NULL COMMENT '总胆红素',
  `ast` varchar(24) DEFAULT NULL COMMENT '谷丙转氨酶',
  `alt` varchar(24) DEFAULT NULL COMMENT '谷草转氨酶',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_inf`
--

LOCK TABLES `patient_inf` WRITE;
/*!40000 ALTER TABLE `patient_inf` DISABLE KEYS */;
INSERT INTO `patient_inf` VALUES (1,'9546228F','张富兴','男','51岁','60kg','汉','肠球菌感染','腹部感染','重症脓毒血症，细菌性肠道感染，多器官功能障碍综合征','无','细菌性肠道感染，多器官功能障碍综合征','64ml/min','免疫检测法','39.2℃','0.17ug/ml','74.80mg/L','12.33*10E9/L','14.21*10E9/L','5.3mmol/L','101umol/L','337μmol/L','6.6mmol/L','0.97mg/L','2.4mg/L','71.8g/L','52.3g/L','19.5g/L','4.6umol/L','11.6umol/L','16.2umol/l','28.7u/L','26.1u/L'),(2,'9546245F','陈建设','男','76岁','65kg','汉','大肠杆菌感染','胆总管感染','急性化脓性胆管炎，胆总管结石伴急性化脓性胆管炎，严重感染，代谢酸中毒','无','胆总管结石伴急性化脓性胆管炎，严重感染，代谢酸中毒','57ml/min','免疫检测法','39.7℃','4.43ug/ml','93.24mg/L','21.17*10E9/L','23.56*10E9/L','4.6mmol/L','88.92μmol/L','436μmol/L','6.4mmol/L','0.82mg/L','1.68mg/L','75.2g/L','42.6g/L','32.6g/L','6.3umol/L','17.4umol/L','23.7umol/L','11.3u/L','17.6u/L'),(3,'9546252F','李明达','女','58岁','47kg','汉','','脑部','右侧开颅肿瘤切除术后发热','无','术后第三题出现反复发热，最高体温39℃，查脑脊液显示：蛋白963.5mg/L','97.8ml/min','免疫检测法','39℃','0.96ng/ml','83.27mg/L','10.36*10E9/L','13.51*10E9/L','4.8mmol/L','47.24μmol/L','256μmol/L','3.4mmol/L','0.75mg/L','1.34mg/L','64.3g/L','41.5g/L','12.8g/L','5.2μmol/L','16.1μmol/L','21.3μmol/L','31.5u/L','28.9u/L'),(4,'9546261F','赵晓红','男','23岁','85kg','汉','','血流','右髋关节移植感染','无','行右髋关节病损切除术，术后第二天患者出现低热','146.67ml/min','免疫检测法','38.5℃','0.83ng/ml','20mg/L','11.2*10E9/L','11.46*10E9/L','5.1mmol/L','84.5μmol/L','316μmol/L','4.2mmol/L','0.92mg/L','2.21mg/L','73.8g/L','46.4g/L','27.4g/L','6.4μmol/L','12.1μmol/L','18.5μmol/L','27.6u/L','26.4u/L');
/*!40000 ALTER TABLE `patient_inf` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-09-26 18:16:53
