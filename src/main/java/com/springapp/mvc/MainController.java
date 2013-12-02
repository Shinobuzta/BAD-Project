package com.springapp.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(value = "project/{id}", method = RequestMethod.GET)
    public String showIndividualProject(@PathVariable("id") int id,ModelMap model){
        model.addAttribute("id",id);
        return "project";
    }

    @RequestMapping(value = "charities", method = RequestMethod.GET)
    public String showCharities(ModelMap model){
        return "charities";
    }

    @RequestMapping(value = "errors/404", method = RequestMethod.GET)
    public String show404Page(ModelMap model){
        return "errorpages/page404";
    }

    @RequestMapping(value = "errors/400", method = RequestMethod.GET)
    public String show400Page(ModelMap model){
        return "errorpages/page400";
    }

}
