package com.shy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: shy
 * @Date: 2020/10/26/19:29
 * @Description:
 */
@Controller
public class MessageShowController {
    @GetMapping("/message")
    public String message(){
        return "message";
    }
}
