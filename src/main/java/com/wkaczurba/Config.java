package com.wkaczurba;

import com.wkaczurba.text.RandomText;
import com.wkaczurba.text.RandomTextImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public RandomText randomText() {
        return new RandomTextImpl();
    }
}
