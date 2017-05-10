package com.mkyong.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getdata() {
        List<String> namesInJava = getList();
        ModelAndView model = new ModelAndView("index");
        model.addObject("names", namesInJava);
        return model;
    }

    private List<String> getList() {

        List<String> list = new ArrayList<String>();
        list.add("Maliheh");
        list.add("List B");
        list.add("List C");
        list.add("List D");
        list.add("List 1");
        list.add("List 2");
        list.add("List 3");

        return list;

    }

}
