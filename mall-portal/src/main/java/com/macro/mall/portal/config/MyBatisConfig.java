package com.macro.mall.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: Jacob
 * @Description: TODO MyBatis相关配置
 * @Date: 2024/2/28 10:42
 * @Version: 1.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.macro.mall.mapper","com.macro.mall.portal.dao"})
public class MyBatisConfig {
}
