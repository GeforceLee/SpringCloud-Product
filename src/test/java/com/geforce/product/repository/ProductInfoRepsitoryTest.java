package com.geforce.product.repository;

import com.geforce.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @author geforce
 * @date 2018/4/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepsitoryTest {

    @Autowired
    private ProductInfoRepsitory productInfoRepsitory;
    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfos = productInfoRepsitory.findByProductStatus(0);
        Assert.assertTrue(productInfos.size() > 0);
    }
}