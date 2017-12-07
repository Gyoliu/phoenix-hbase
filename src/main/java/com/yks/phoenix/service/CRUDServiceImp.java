package com.yks.phoenix.service;

import com.yks.phoenix.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by cgt on 17-12-7.
 */
@Service
public class CRUDServiceImp implements CRUDService {

    @Autowired
    @Qualifier("phoenixJdbcTemplate")
    JdbcTemplate phoenixJdbcTemplate;

    public Result add(){

        return null;
    }

    public Result update(){
        return null;

    }

    public Result delete(){
        return null;

    }


    public List<Map<String, Object>> query(){
        return phoenixJdbcTemplate.queryForList("select * from mytry.company");

    }
}
