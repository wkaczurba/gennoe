package com.wkaczurba.text;

import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class RandomTextImpl implements RandomText {

    // TODO: Set lengths and other stuff.

    @Override
    public char[] getRandomChars() {
        char[] retval = new char[8];
        ThreadLocalRandom tlc = ThreadLocalRandom.current();

        for (int i=0; i < retval.length; i++) {
            int result = tlc.nextInt('0', 'z'); // TODO: Modify or inject algorithms.
            retval[i] = (char) result;
        }
        return retval;
    }
}
