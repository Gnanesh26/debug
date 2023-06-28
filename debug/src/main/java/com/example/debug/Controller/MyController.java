package com.example.debug.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hi")
    public String getAbout(){
        String str = "Debug";
        str = str.toLowerCase();
        str = str.toUpperCase();
        return str;
    }

}
