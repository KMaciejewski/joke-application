package com.km.jokeapplication.controller;

import com.km.jokeapplication.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getRandomJoke());
        return "chucknorris";
    }
}
