package com.wkaczurba.text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class RandomTextImpl2 implements RandomText {

    private CharacterSupplier cs;

    public RandomTextImpl2(@Autowired CharacterSupplier cs) {
        this.cs = cs;
    }

    public char[] getRandomChars(int count) {
        char[] retval = new char[count];

        for (int i=0; i < retval.length; i++) {
            retval[i] = cs.getCharacter();
        }
        return retval;
    }
}
