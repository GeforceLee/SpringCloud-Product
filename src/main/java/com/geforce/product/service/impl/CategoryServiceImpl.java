package com.geforce.product.service.impl;

import com.geforce.product.dataobject.ProductCategory;
import com.geforce.product.repository.ProductCategoryResitory;
import com.geforce.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author geforce
 * @date 2018/4/16
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryResitory productCategoryResitory;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryResitory.findByCategoryTypeIn(categoryTypeList);
    }
}
