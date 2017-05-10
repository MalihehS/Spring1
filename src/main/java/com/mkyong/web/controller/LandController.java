
package com.mkyong.web.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LandController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView getTest() {
        List<String> namesInJava = getTesting();
        ModelAndView model = new ModelAndView("index");
        model.addObject("testing", namesInJava);
        return model;
    }

    private List<String> getTesting() {

        List<String> list = new ArrayList<String>();
        list.add("Iceland");
        list.add("Sweden");
        list.add("Iran");

        return list;

    }

}
