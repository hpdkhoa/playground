package com.example.htmlDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class ApiController {
    private int count =0;

    @RequestMapping("/count")
    public int incrCount(){
        count++;
        return count;
    }
}
