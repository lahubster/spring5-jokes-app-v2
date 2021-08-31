package com.vandermeulen.spring5jokesappv2.controllers;

import com.vandermeulen.spring5jokesappv2.services.JokesService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    
    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    // Create Jokes Controller with one method mapped to context root - (“/“, “”)
    // To the model being returned, add a property of “joke” with value of Chuck Norris quote from service
    // Return view name of “index”
    @RequestMapping({"/", ""})
    public String showQuote (Model model){
        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }

}
