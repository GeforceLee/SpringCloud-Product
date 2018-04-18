package com.geforce.product.repository;

import com.geforce.product.dataobject.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


/**
 * @author geforce
 * @date 2018/4/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoRepsitoryTest {

    @Autowired
    private ProductInfoRepsitory productInfoRepsitory;
    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfos = productInfoRepsitory.findByProductStatus(0);
        Assert.assertTrue(productInfos.size() > 0);
    }

    @Test
    public void findByProductIdIn() {
        List<ProductInfo> productInfoList = productInfoRepsitory.findByProductIdIn(Arrays.asList("157875196366160022","157875227953464068"));
        log.info(productInfoList.toString());
    }
}