package com.wkaczurba.text;

import com.wkaczurba.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Config.class })
public class RandomTextTest {

    @Autowired
    public RandomText randomText;

    @Autowired
    public RandomText randomText2;


    // FIXME:
    @Test
    public void randomTextTest () {
        System.out.println(String.valueOf(randomText.getRandomChars(10) ));
    }

    @Test
    public void variableLengthRandomTextTest () {

        // TODO: Add assertions
        char[] cs1 = randomText2.getRandomChars(10 );

        Assert.assertTrue(cs1.length == 10);
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + cs1[i]);
            Assert.assertTrue(cs1[i] > 32 && cs1[i] < 127 &&
                    (cs1[i] < '0' || cs1[i] > '9') &&
                    (cs1[i] < 'a' || cs1[i] > 'z') &&
                    (cs1[i] < 'A' || cs1[i] > 'Z'));
        }

        char[] cs2 = randomText2.getRandomChars(8);
        Assert.assertTrue(cs2.length == 8);

    }
}
