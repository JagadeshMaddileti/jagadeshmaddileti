package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/display")
public class FormController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "show-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "process-form";
    }

    @RequestMapping("/processFormV02")
    public String processFormV02(HttpServletRequest request, Model model){
        String name=request.getParameter("name");
        name=name.toUpperCase();
        String result="Hai "+name;
        model.addAttribute("message",result);
        return "process-form";

    }
    @RequestMapping("/processFormV03")
    public String processFormV03(@RequestParam("name") String name, Model model){
        name=name.toUpperCase();
        String result="Hai from v3 "+name;
        model.addAttribute("message",result);
        return "process-form";

    }
}
