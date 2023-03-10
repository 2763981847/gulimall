package com.oreki.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oreki.common.utils.PageUtils;
import com.oreki.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author oreki
 * @email 2763981847@qq.com
 * @date 2023-02-21 13:46:01
 */
public interface CategoryService extends IService<CategoryEntity> {


    /**
     * 查出所有分类及其子分类，并以树形结构组装起来
     *
     * @return
     */
    List<CategoryEntity> listByTree();

    /**
     * 删除分类
     * @param catIds
     */
    void deleteByIds(List<Long> catIds);
}

