package com.geforce.product.util;

import com.geforce.product.vo.ProductVO;
import com.geforce.product.vo.ResultVO;

import java.util.List;

/**
 * @author geforce
 * @date 2018/4/16
 */
public class ResultVOUtil {

    public static <T> ResultVO<T> success(T obj) {
        ResultVO<T> resultVO = new ResultVO();
        resultVO.setData(obj);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

}
