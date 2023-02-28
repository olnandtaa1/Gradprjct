package com.example.graduationproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {
    @GetMapping("/")
    public String index () {

        return  "index";
    }

    @GetMapping("/news")
    public String news() {

        return "news";
    }
}
