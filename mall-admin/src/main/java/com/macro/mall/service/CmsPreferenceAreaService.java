package com.macro.mall.service;

import com.macro.mall.model.CmsPrefrenceArea;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 商品优选管理Service
 * @Date: 2024/3/6 16:17
 * @Version: 1.0
 */
public interface CmsPreferenceAreaService {

    /**
     * 获取所有优选专区
     */
    List<CmsPrefrenceArea> listAll();
}
