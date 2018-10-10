package com.example.modules.patient.controller;

import com.example.common.utils.restResult.RestResult;
import com.example.common.utils.restResult.ResultGenerator;
import com.example.modules.patient.DTO.PlanDTO;
import com.example.modules.patient.domain.PatientInf;
import com.example.modules.patient.service.PatientInfService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.annotation.Resource;
import java.util.List;


/**
* @author CodeGenerator
* @date 2018-08-07 05:49:18
*/
@Slf4j
@Controller
@RequestMapping("/")
public class PatientInfController {
    @Resource
    private PatientInfService patientInfService;

    @PostMapping("/add")
    public RestResult add(PatientInf patientInf) {
        patientInfService.save(patientInf);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public RestResult delete(@RequestParam String id) {
        patientInfService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public RestResult update(PatientInf patientInf) {
        patientInfService.update(patientInf);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public RestResult detail(@RequestParam Integer id) {
        PatientInf patientInf = patientInfService.findById(id);
        return ResultGenerator.genSuccessResult(patientInf);
    }

    @RequestMapping("/")
    public ModelAndView toIndex(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("name", "赵医生");

        mav.setViewName("index");
        return mav;
    }

    @PostMapping("/pat/list")
    @ResponseBody
    public RestResult getPatList() {
        List<PatientInf> list = patientInfService.findAll();
        return ResultGenerator.genSuccessResult().setData(list);
    }

    @GetMapping("/pat/info")
    public ModelAndView getPatInfo(Integer id) {
        ModelAndView mav = new ModelAndView();
        PatientInf patientInf = patientInfService.findById(id);
        mav.addObject("pat", patientInf);
        mav.setViewName("pat_info");
        return mav;
    }

    @RequestMapping("/pat/plan")
    public ModelAndView toPlan(Integer id){
        ModelAndView mav = new ModelAndView();
        PlanDTO dto = patientInfService.getPlanDTO(id);
        mav.addObject("plan", dto);
        mav.setViewName("drug_plan");
        return mav;
    }
}
