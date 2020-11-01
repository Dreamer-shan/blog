package com.shy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2020/11/01/20:45
 * @Description:
 */
@Controller
public class MusicShowController {
    @GetMapping("/music")
    public String music(){
        return "music";
    }
}
