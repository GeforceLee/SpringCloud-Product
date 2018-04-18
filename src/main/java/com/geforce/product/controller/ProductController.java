package com.geforce.product.controller;

import com.geforce.product.dataobject.ProductCategory;
import com.geforce.product.dataobject.ProductInfo;
import com.geforce.product.service.CategoryService;
import com.geforce.product.service.ProductService;
import com.geforce.product.util.ResultVOUtil;
import com.geforce.product.vo.ProductInfoVo;
import com.geforce.product.vo.ProductVO;
import com.geforce.product.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author geforce
 * @date 2018/4/16
 */
@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductService productService;


    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO<List<ProductVO>> list() {
        List<ProductInfo> productInfoList = productService.findUpAll();

        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());


        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        List<ProductVO> productVOList = new ArrayList<>();

        for (ProductCategory productCategory : categoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());
            List<ProductInfoVo> productInfoVoList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVo productInfoVo = new ProductInfoVo();

                    BeanUtils.copyProperties(productInfo, productInfoVo);
                    productInfoVoList.add(productInfoVo);
                }

            }
            productVO.setProductInfoVoList(productInfoVoList);
            productVOList.add(productVO);
        }

        ResultVO<List<ProductVO>> resultVO = ResultVOUtil.success(productVOList);
        return resultVO;
    }


    @PostMapping("/listForOrder")
    public List<ProductInfo> listForOrder(@RequestBody List<String> productIds) {
        return productService.findList(productIds);
    }

}
