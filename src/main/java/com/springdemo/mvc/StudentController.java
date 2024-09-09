package com.springdemo.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor trimmerEditor=new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,trimmerEditor);
    }
    @RequestMapping("/showForm")
    public String showForm(Model model){
        Student theStudent= new Student();
        model.addAttribute("student",theStudent);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(
            @Valid @ModelAttribute("student") Student theStudent,
            BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "student-form";
        }
        else {
            return "student-confirmation";
        }
    }
}
