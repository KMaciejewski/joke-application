package com.km.jokeapplication.service;

import com.km.jokeapplication.model.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    @Override
    public String getRandomJoke() {
        return ChuckNorrisQuotes.getRandomQuote();
    }
}
