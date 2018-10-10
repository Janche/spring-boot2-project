package com.example.modules.patient.service;

import com.example.modules.patient.DTO.PlanDTO;
import com.example.modules.patient.domain.PatientInf;
import com.example.common.core.Service;


/**
*
* @author CodeGenerator
* @date 2018-08-07 05:49:18
*
*/
public interface PatientInfService extends Service<PatientInf> {

    /**
     * 获取方案信息
     */
    PlanDTO getPlanDTO(Integer id);
}
