package com.wkaczurba.text;

import com.wkaczurba.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Config.class })
public class RandomTextTest {

    @Autowired
    public RandomText randomText;

    @Test
    public void randomTextTest () {
        System.out.println(String.valueOf(randomText.getRandomChars()));
    }
}
