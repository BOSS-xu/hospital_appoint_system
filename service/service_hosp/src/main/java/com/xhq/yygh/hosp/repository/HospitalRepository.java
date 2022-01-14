package com.xhq.yygh.hosp.repository;

import com.xhq.yygh.model.hosp.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HospitalRepository extends MongoRepository<Hospital,String> {
    // 判断是否存在数据
    Hospital getHospitalByHoscode(String hoscode);

    Hospital getById(String id);

    List<Hospital> findHospitalByHosnameLike(String hosname);
}
