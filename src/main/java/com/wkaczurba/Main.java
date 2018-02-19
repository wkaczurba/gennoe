package com.wkaczurba;

import com.wkaczurba.text.RandomText;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// TODO: Try the following: https://stackoverflow.com/questions/14013644/hosting-a-maven-repository-on-github

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        RandomText randomText = (RandomText) context.getBean("randomText");
        System.out.println(randomText.getRandomChars(20));

    }
}
