package com.example.modules.patient.service.impl;

import com.example.modules.patient.DTO.PlanDTO;
import com.example.modules.patient.dao.PatientInfMapper;
import com.example.modules.patient.domain.PatientInf;
import com.example.modules.patient.service.PatientInfService;
import com.example.common.core.AbstractService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
*
* @author CodeGenerator
* @date 2018-08-07 05:49:18
*
*/
@Slf4j
@Service
@Transactional
public class PatientInfServiceImpl extends AbstractService<PatientInf> implements PatientInfService {
    @Resource
    private PatientInfMapper patientInfMapper;

    /**
     * 获取方案信息
     *
     * @param id
     */
    @Override
    public PlanDTO getPlanDTO(Integer id) {
        return patientInfMapper.getPlanDTO(id);
    }
}
