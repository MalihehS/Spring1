package com.mkyong.web.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;

@Controller
public class AnimalController {

    @RequestMapping(value = "/animaltest", method = RequestMethod.GET)
    public ModelAndView getAnimals() {
        List<String> namesInJava = getAnimalsTesting();
        ModelAndView model = new ModelAndView("Animals");
        model.addObject("animals", namesInJava);
        return model;
    }

    private List<String> getAnimalsTesting() {
        List<String> list = new ArrayList<String>();
        list.add("wolf");
        list.add("Baboon");
        list.add("Bat");

        return list;
    }
}
