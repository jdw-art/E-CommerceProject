package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.MemberProductCollection;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 会员商品收藏管理Service
 * @Date: 2024/3/4 21:11
 * @Version: 1.0
 */
public interface MemberCollectionService {

    /**
     * 添加收藏
     */
    int add(MemberProductCollection productCollection);

    /**
     * 删除收藏
     */
    int delete(long productId);

    /**
     * 分页查询收藏
     */
    Page<MemberProductCollection> list(Integer pageNum, Integer pageSize);

    /**
     * 查看收藏详情
     */
    MemberProductCollection detail(Long productId);

    /**
     * 清空收藏
     */
    void clear();
}
