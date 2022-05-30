package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("caculator")
    public String caculator(@RequestParam double nb1, double nb2, String sl, Model model) {
        double rs = 0;

        switch (sl) {
            case "addition":
                rs = nb1 + nb2;
                break;
            case "multiplication":
                rs = nb1 - nb2;
                break;
            case "subtraction":
                rs = nb1 * nb2;
                break;
            case "division":
                rs = nb1 / nb2;
                break;

        }
        model.addAttribute("result", rs);
        model.addAttribute("select", sl);
        model.addAttribute("n1", nb1);
        model.addAttribute("n2", nb2);
        return "caculator";
    }
}
