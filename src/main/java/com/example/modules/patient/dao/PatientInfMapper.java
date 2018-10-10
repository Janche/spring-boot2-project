package com.example.modules.patient.dao;

import com.example.common.core.Mapper;
import com.example.modules.patient.DTO.PlanDTO;
import com.example.modules.patient.domain.PatientInf;
import org.apache.ibatis.annotations.Param;

public interface PatientInfMapper extends Mapper<PatientInf> {
    PlanDTO getPlanDTO(@Param("id") Integer id);
}