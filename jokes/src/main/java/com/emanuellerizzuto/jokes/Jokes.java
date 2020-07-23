package com.emanuellerizzuto.jokes;

import java.util.ArrayList;
import java.util.Random;

public class Jokes {
    public String getJoke() {
        ArrayList<String> jokes = new ArrayList<String>();
        jokes.add("Joke 1");
        jokes.add("Joke 2");
        jokes.add("Joke 3");

        Random random = new Random();
        int index = random.nextInt(jokes.size());
        return jokes.get(index);
    }
}