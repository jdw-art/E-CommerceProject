package com.macro.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: Jacob
 * @Description: TODO MyBatis相关配置
 * @Date: 2024/2/21 16:04
 * @Version: 1.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.macro.mall.mapper", "com.macro.mall.dao"})
public class MyBatisConfig {
}
