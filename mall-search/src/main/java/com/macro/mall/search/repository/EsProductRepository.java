package com.macro.mall.search.repository;

import com.macro.mall.search.domain.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author: Jacob
 * @Description: 搜索商品ES操作类
 * @Date: 2024/3/5 20:31
 * @Version: 1.0
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {
    /**
     * 搜索查询
     * @param name          商品名称
     * @param subTitle      商品标题
     * @param keywords      商品关键字
     * @param pageable      分页信息
     * @return
     */
    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable pageable);
}
