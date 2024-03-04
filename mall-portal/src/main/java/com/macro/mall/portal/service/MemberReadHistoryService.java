package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.MemberReadHistory;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 会员浏览记录管理Service
 * @Date: 2024/3/4 18:53
 * @Version: 1.0
 */
public interface MemberReadHistoryService {

    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除商品记录
     */
    int delete(List<String> ids);

    /**
     * 分页获取用户浏览历史记录
     */
    Page<MemberReadHistory> list(Integer pageSize, Integer pageNum);

    /**
     * 清空浏览记录
     */
    void clear();
}
