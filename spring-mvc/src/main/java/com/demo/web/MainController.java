package com.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "helloworld.html";
    }

    @GetMapping("/number1")
    public String numberModel(Model model) {
        model.addAttribute("num", 3);
        return "number.html";
    }

    @GetMapping("/number2")
    public String numberModelMap(ModelMap modelMap) {
        modelMap.put("num", 3);
        return "number.html";
    }

    @GetMapping("/number3")
    public ModelAndView numberModelAndView(ModelAndView modelAndView) {
        modelAndView.addObject("num", 3);
        modelAndView.setViewName("number.html");
        return modelAndView;
    }

    // http://localhost:8080/main/number?num=27
    @GetMapping("/number")
    public String numberParam(Model model, @RequestParam("num") Integer num) {
        model.addAttribute("num", num);
        return "number.html";
    }

    // http://localhost:8080/main/number/27
    @GetMapping("/number/{id}")
    public String numberPath(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("num", id);
        return "number.html";
    }



}
