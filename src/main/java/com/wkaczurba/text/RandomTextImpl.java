package com.wkaczurba.text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
@Scope(scopeName = "prototype")
public class RandomTextImpl implements RandomText {

    @Override
    public char[] getRandomChars(int count) {

        char[] retval = new char[count];
        ThreadLocalRandom tlc = ThreadLocalRandom.current();

        for (int i=0; i < count; i++) {
            int result = tlc.nextInt('0', 'z'); // TODO: Modify or inject algorithms.
            retval[i] = (char) result;
        }
        return retval;
    }
}
