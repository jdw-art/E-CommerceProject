package com.macro.mall.portal.config;

import com.macro.mall.portal.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @Author: Jacob
 * @Description: TODO mall-security相关配置
 * @Date: 2024/2/27 21:11
 * @Version: 1.0
 */
@Configuration
public class MallSecurityConfig {

    @Autowired
    private UmsMemberService memberService;

    @Bean
    public UserDetailsService userDetailsService() {
        // 获取登录用户信息
        return username -> memberService.loadUserByUsername(username);
    }
}
