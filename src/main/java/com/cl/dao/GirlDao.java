package com.cl.dao;

import com.cl.po.GirlPo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by cl on 2017/12/4.
 */
public interface GirlDao extends JpaRepository<GirlPo, Integer> {

    List<GirlPo> findByAge(Integer age);

}
