package com.xhq.yygh.hosp.controller;

import com.xhq.yygh.hosp.service.HospitalSetService;
import com.xhq.yygh.model.hosp.HospitalSet;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(tags = "医院设置管理")
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {

    @Autowired
    HospitalSetService hospitalSetService;

    @ApiOperation("获取所有医院设置")
    @GetMapping("/findAll")
    public List<HospitalSet> findAll() {
        return hospitalSetService.list();

    }

    @ApiOperation("逻辑删除医院设置")
    @DeleteMapping("{id}")
    public boolean removeHospSet(@PathVariable Long id) {
        return hospitalSetService.removeById(id);
    }


}

