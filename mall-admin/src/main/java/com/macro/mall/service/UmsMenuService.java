package com.macro.mall.service;

import com.macro.mall.dto.UmsMenuNode;
import com.macro.mall.model.UmsMenu;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: TODO 后台菜单管理Service
 * @Date: 2024/2/22 15:27
 * @Version: 1.0
 */
public interface UmsMenuService {
    /**
     * 创建后台菜单
     */
    int create(UmsMenu umsMenu);

    /**
     * 修改后台菜单
     */
    int updateMenu(Long id, UmsMenu umsMenu);

    /**
     * 根据ID获取菜单详情
     */
    UmsMenu getItem(Long id);

    /**
     * 根据ID删除菜单
     */
    int delete(Long id);

    /**
     * 分页查询后台菜单
     */
    List<UmsMenu> list(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * 树形结构返回所有菜单列表
     */
    List<UmsMenuNode> treeList();

    /**
     * 修改菜单显示状态
     */
    int updateHidden(Long id, Integer hidden);
}
