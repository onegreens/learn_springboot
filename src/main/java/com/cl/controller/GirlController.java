package com.cl.controller;

import com.cl.dao.GirlDao;
import com.cl.po.GirlPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by cl on 2017/12/4.
 */
@RestController
public class GirlController {

    @Autowired
    GirlDao girlDao;

    /**
     * 获取所有
     *
     * @return
     */
    @GetMapping(value = "queryAllGirls")
    public List<GirlPo> queryAllGirls() {
        return girlDao.findAll();
    }

    /**
     * 添加
     * @param name
     * @param age
     * @return
     */
    @PostMapping(value = "addGirl")
    public GirlPo addGirl(@RequestParam String name, @RequestParam Integer age) {
        return girlDao.save(new GirlPo(name, age));
    }
}
