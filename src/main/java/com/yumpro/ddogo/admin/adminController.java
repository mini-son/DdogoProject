package com.yumpro.ddogo.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class adminController {

    @GetMapping("/go")
    public String ss(){
        return "/admin2/adminForm";

    }
}
