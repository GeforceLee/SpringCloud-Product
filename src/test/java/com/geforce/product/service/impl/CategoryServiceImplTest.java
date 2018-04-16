package com.geforce.product.service.impl;

import com.geforce.product.ProductApplicationTests;
import com.geforce.product.dataobject.ProductCategory;
import com.geforce.product.service.CategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author geforce
 * @date 2018/4/16
 */
public class CategoryServiceImplTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {

        List<ProductCategory>list = categoryService.findByCategoryTypeIn(Arrays.asList(11,22));

        Assert.assertTrue(list.size()>0);

    }
}