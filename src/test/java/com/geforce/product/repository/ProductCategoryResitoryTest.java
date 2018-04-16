package com.geforce.product.repository;

import com.geforce.product.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author geforce
 * @date 2018/4/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryResitoryTest {
    @Autowired
    private ProductCategoryResitory productCategoryResitory;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = productCategoryResitory.findByCategoryTypeIn(Arrays.asList(11,22));

        Assert.assertTrue(list.size()>0);
    }
}