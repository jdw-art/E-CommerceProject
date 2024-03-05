package com.macro.mall.portal.repository;

import com.macro.mall.portal.domain.MemberProductCollection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author: Jacob
 * @Description: 会员商品收藏repository
 * @Date: 2024/3/4 22:05
 * @Version: 1.0
 */
public interface MemberProductCollectionRepository extends MongoRepository<MemberProductCollection, String> {

    /**
     * 根据会员id和商品id查找记录
     */
    MemberProductCollection findByMemberIdAndProductId(Long memberId, Long productId);

    /**
     * 根据会员id和商品id删除记录
     */
    int deleteByMemberIdAndProductId(Long memberId, Long productId);

    /**
     * 根据会员id分页查询记录
     */
    Page<MemberProductCollection> findByMemberId(Long memberId, Pageable pageable);

    /**
     * 根据会员ID删除记录
     */
    void deleteAllByMemberId(Long memberId);

}
