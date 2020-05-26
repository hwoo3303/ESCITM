package com.escitm.demo.index;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {

    @GetMapping("/index")
    public String index() {
        return "index page";
    }
}
