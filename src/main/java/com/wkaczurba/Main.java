package com.wkaczurba;

import com.wkaczurba.text.RandomText;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        RandomText randomText = (RandomText) context.getBean("randomText");
        System.out.println(randomText.getRandomChars());

    }
}
