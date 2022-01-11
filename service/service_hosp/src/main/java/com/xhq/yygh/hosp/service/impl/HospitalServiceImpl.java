package com.xhq.yygh.hosp.service.impl;

import com.xhq.yygh.hosp.repository.HospitalRepository;
import com.xhq.yygh.hosp.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;
}
