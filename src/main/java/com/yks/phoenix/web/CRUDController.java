package com.yks.phoenix.web;

import com.yks.phoenix.service.CRUDService;
import com.yks.phoenix.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cgt on 17-12-7.
 */
@Controller
@RequestMapping("/crud")
class CRUDController {

    @Autowired
    CRUDService crudService;

    /**
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result add(){
        return crudService.add();
    }


    /**
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Result update(){
        return crudService.update();
    }

    /**

     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public Result delete(){
        return crudService.delete();
    }


    /**
     * 查询

     */
    @ResponseBody
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Object query(){
        return crudService.query();
    }
}
