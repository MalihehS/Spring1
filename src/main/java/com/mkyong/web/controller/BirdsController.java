
package com.mkyong.web.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author malisaad
 */
@Controller
public class BirdsController {
    @RequestMapping(value = "/birdslist", method = RequestMethod.GET)
    public ModelAndView getbirds() {
        List<String> namesInJava = getbirdTesting();
        ModelAndView model = new ModelAndView("Birds");
        model.addObject("bitdtesting", namesInJava);
        return model;
    }
private List<String> getbirdTesting() {

        List<String> list = new ArrayList<String>();
        list.add("Eagle");
        list.add("Crow");
        list.add("Sparrow");

        return list;

    }
}
