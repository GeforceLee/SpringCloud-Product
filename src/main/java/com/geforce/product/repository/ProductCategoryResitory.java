package com.geforce.product.repository;

import com.geforce.product.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author geforce
 * @date 2018/4/16
 */
public interface ProductCategoryResitory extends JpaRepository<ProductCategory,Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
