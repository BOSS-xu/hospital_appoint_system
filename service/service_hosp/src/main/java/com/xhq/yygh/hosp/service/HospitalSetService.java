package com.xhq.yygh.hosp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhq.yygh.model.hosp.HospitalSet;

public interface HospitalSetService extends IService<HospitalSet> {

    /**
     * 获取签名key
     * @param hoscode
     * @return
     */
    String getSignKey(String hoscode);
}
