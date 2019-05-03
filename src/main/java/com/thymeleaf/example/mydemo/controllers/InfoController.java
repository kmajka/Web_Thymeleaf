package com.thymeleaf.example.mydemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class InfoController {

    @RequestMapping("/infom")
    public String infoMethod() {
        return "infopage.html"; //view
    }

    @RequestMapping("/infot")
    public String infoMethodThymeLeaf(Model model) {
        List<String> list = new ArrayList<String>(Arrays.asList(new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" , "..."}));
        model.addAttribute("listabc", list);
        model.addAttribute("name", "Letter:");
        return "thymeleafpage.html"; //view
    }

}
