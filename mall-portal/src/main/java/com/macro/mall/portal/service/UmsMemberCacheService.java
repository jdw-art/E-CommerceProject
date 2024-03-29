package com.macro.mall.portal.service;

import com.macro.mall.model.UmsMember;

/**
 * @Author: Jacob
 * @Description: TODO 会员信息缓存业务类
 * @Date: 2024/2/27 21:22
 * @Version: 1.0
 */
public interface UmsMemberCacheService {

    /**
     * 删除会员用户缓存
     */
    void delMember(Long memberId);

    /**
     * 获取会员用户缓存
     */
    UmsMember getMember(String username);

    /**
     * 设置会员用户缓存
     */
    void setMember(UmsMember member);

    /**
     * 设置验证码
     */
    void setAuthCode(String telephone, String authCode);

    /**
     * 获取验证码
     */
    String getAuthCode(String telephone);
}
