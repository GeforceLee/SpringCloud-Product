package com.geforce.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author geforce
 * @date 2018/4/16
 */
@RestController
public class ServerController {

    @GetMapping("msg")
    public String msg() {
        return "this is product server msg";
    }
}
