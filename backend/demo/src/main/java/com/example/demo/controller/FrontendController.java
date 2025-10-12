package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {

    // Captura todas as rotas que não têm ponto (ex: .css, .js, .png)
    @GetMapping(value = {"/{path:[^\\.]*}", "/{path:^(?!api$).*$}/**"})
    public String forward() {
        return "forward:/index.html";
    }
}
