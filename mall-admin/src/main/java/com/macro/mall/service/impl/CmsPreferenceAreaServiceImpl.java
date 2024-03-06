package com.macro.mall.service.impl;

import com.macro.mall.mapper.CmsPrefrenceAreaMapper;
import com.macro.mall.model.CmsPrefrenceArea;
import com.macro.mall.model.CmsPrefrenceAreaExample;
import com.macro.mall.service.CmsPreferenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 商品优选管理Service实现类
 * @Date: 2024/3/6 16:18
 * @Version: 1.0
 */
@Service
public class CmsPreferenceAreaServiceImpl implements CmsPreferenceAreaService {

    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
