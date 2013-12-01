package com.springapp.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String showIndex(ModelMap model){
        return "index";
    }

    @RequestMapping(value = "projects/previous", method = RequestMethod.GET)
    public String showPreviousProjects(ModelMap model){
        return "previousprojects";
    }

    @RequestMapping(value = "projects", method = RequestMethod.GET)
    public String showProjects(ModelMap model){
        return "projects";
    }

    @RequestMapping(value = "charities", method = RequestMethod.GET)
    public String showCharities(ModelMap model){
        return "charities";
    }


}
