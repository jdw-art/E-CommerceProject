package com.macro.mall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Jacob
 * @Description: MyBatis配置类
 * @Date: 2024/2/28 11:15
 * @Version: 1.0
 */
@Configuration@MapperScan({"com.macro.mall.mapper", "com.macro.mall.search.dao"})
public class MyBatisConfig {
}
