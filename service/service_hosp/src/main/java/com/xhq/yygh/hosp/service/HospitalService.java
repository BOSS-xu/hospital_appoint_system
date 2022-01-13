package com.xhq.yygh.hosp.service;

import com.xhq.yygh.model.hosp.Hospital;
import com.xhq.yygh.vo.hosp.HospitalQueryVo;
import org.springframework.data.domain.Page;

import java.util.Map;

public interface HospitalService {
    /**
     * 上传医院信息
     * @param paramMap
     */
    void save(Map<String, Object> paramMap);

    Object getByHoscode(String hoscode);

    /**
     * 分页查询
     * @param page 当前页码
     * @param limit 每页记录数
     * @param hospitalQueryVo 查询条件
     * @return
     */
    Page<Hospital> selectPage(Integer page, Integer limit, HospitalQueryVo hospitalQueryVo);

    /**
     * 更新上线状态
     */
    void updateStatus(String id, Integer status);
    /**
     * 医院详情
     * @param id
     * @return
     */
    Map<String, Object> show(String id);

    /**
     * 根据医院编号获取医院名称接口
     * @param hoscode
     * @return
     */
    String getHospName(String hoscode);
}
