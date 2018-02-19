package com.wkaczurba;

import com.wkaczurba.text.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public RandomText randomText() {
        return new RandomTextImpl();
    }

    @Bean
    public RandomText randomText2(@Autowired CharacterSupplier characterSupplier) {
        return new RandomTextImpl2(characterSupplier());
    }

    @Bean
    public CharacterSupplier characterSupplier() {
        return new CharacterSupplierImpl(CharacterTypes.SPECIAL.set);
    }
}
