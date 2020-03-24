package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Geonguk Han
 * @since 2020-03-24
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String hello() {
        return "index";
    }

}
