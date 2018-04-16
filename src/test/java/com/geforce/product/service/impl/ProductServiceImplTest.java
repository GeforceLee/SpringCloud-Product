package com.geforce.product.service.impl;

import com.geforce.product.ProductApplicationTests;
import com.geforce.product.dataobject.ProductInfo;
import com.geforce.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author geforce
 * @date 2018/4/16
 */


public class ProductServiceImplTest extends ProductApplicationTests {
    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> list =  productService.findUpAll();


        Assert.assertTrue(list.size()>0);
    }
}