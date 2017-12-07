package com.yks.phoenix.service;

import com.yks.phoenix.vo.Result;

import java.util.List;
import java.util.Map;

/**
 * Created by cgt on 17-12-7.
 */
public interface CRUDService {

    Result add();

    Result update();

    Result delete();


    List<Map<String, Object>> query();

}
