package shop.mtcoding.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class index {
    
    @GetMapping("/index")
    public String home(){
return "index";
    }
}
