package com.km.jokeapplication.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ChuckNorrisQuotes {

    private static List<String> quotes = new ArrayList<>();

    static {
        quotes.add("Chuck Norris doesn’t read books. He stares them down until he gets the information he wants.");
        quotes.add("Time waits for no man. Unless that man is Chuck Norris.");
        quotes.add("If you spell Chuck Norris in Scrabble, you win. Forever.");
        quotes.add("Chuck Norris breathes air … five times a day.");
        quotes.add("In the Beginning there was nothing … then Chuck Norris roundhouse kicked nothing and told it to get a job.");
        quotes.add("When God said, “Let there be light!” Chuck said, “Say Please.");
        quotes.add("Chuck Norris has a mug of nails instead of coffee in the morning.");
        quotes.add("If Chuck Norris were to travel to an alternate dimension in which there was another Chuck Norris and they both fought, they would both win.");
        quotes.add("The dinosaurs looked at Chuck Norris the wrong way once. You know what happened to them.");
        quotes.add("Chuck Norris’ tears cure cancer. Too bad he has never cried.");
        quotes.add("Chuck Norris once roundhouse kicked someone so hard that his foot broke the speed of light.");
        quotes.add("If you ask Chuck Norris what time it is, he always says, ‘Two seconds till.’ After you ask, ‘Two seconds to what?’ he roundhouse kicks you in the face.");
        quotes.add("Chuck Norris once won a game of Connect Four in three moves.");
        quotes.add("Champions are the breakfast of Chuck Norris.");
        quotes.add("When the Boogeyman goes to sleep every night he checks his closet for Chuck Norris.");
        quotes.add("Chuck Norris can slam revolving doors.");
        quotes.add("Chuck Norris does not hunt because the word hunting implies the possibility of failure. Chuck Norris goes killing.");
        quotes.add("The dark is afraid of Chuck Norris.");
        quotes.add("Chuck Norris can kill two stones with one bird.");
        quotes.add("Chuck Norris can play the violin with a piano.");
        quotes.add("Chuck Norris makes onions cry.");
        quotes.add("Death once had a near-Chuck-Norris experience.");
        quotes.add("When Chuck Norris writes, he makes paper bleed.");
        quotes.add("Chuck Norris can strangle you with a cordless phone.");
        quotes.add("Chuck Norris never retreats; He just attacks in the opposite direction.");
        quotes.add("Chuck Norris can build a snowman out of rain.");
        quotes.add("Chuck Norris once punched a man in the soul.");
        quotes.add("Chuck Norris can drown a fish.");
        quotes.add("Chuck Norris once had a heart attack. His heart lost.");
    }

    public String getRandomQuote() {
        int randomQuoteIndex = getRandomQuoteIndex(quotes.size());
        return quotes.get(randomQuoteIndex);
    }

    private int getRandomQuoteIndex(int quotesSize) {
        return ThreadLocalRandom.current().nextInt(1, quotesSize + 1);
    }
}
