package com.macro.mall.service;

import com.macro.mall.dto.PmsBrandParam;
import com.macro.mall.model.PmsBrand;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO 商品品牌管理Service
 * @Date: 2024/2/27 19:31
 * @Version: 1.0
 */
public interface PmsBrandService {
    /**
     * 获取所有品牌
     */
    List<PmsBrand> listAllBrand();

    /**
     * 创建品牌
     */
    int create(PmsBrandParam pmsBrandParam);

    /**
     * 修改品牌
     */
    int update(Long id, PmsBrandParam pmsBrandParam);

    /**
     * 删除品牌
     */
    int delete(Long id);

    /**
     * 批量删除品牌
     */
    int deleteBrand(List<Long> ids);

    /**
     * 分页查询品牌
     */
    List<PmsBrand> listBrand(String keyword, Integer showStatus, Integer pageSize, Integer pageNum);

    /**
     * 获取品牌详情
     */
    PmsBrand getBrand(Long id);

    /**
     * 修改显示状态
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 修改厂家制造商状态
     */
    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);
}
