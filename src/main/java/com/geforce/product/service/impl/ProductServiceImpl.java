package com.geforce.product.service.impl;

import com.geforce.product.dataobject.ProductInfo;
import com.geforce.product.enums.ProductStatusEnum;
import com.geforce.product.repository.ProductInfoRepsitory;
import com.geforce.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author geforce
 * @date 2018/4/16
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepsitory productInfoRepsitory;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepsitory.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
