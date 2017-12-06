package com.cl.po;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by cl on 2017/12/2.
 * 从配置文件中获取前缀为 ${prefix} 的值 ： @ConfigurationProperties(prefix = "girl")
 *
 * 使当前类能够通过@Autowired自动注入：@Component
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private String cupSize;
    private Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
