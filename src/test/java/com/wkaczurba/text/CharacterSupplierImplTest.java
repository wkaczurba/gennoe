package com.wkaczurba.text;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.function.Supplier;
import java.util.stream.Stream;

// FIXME: Rework this stuff.
public class CharacterSupplierImplTest {

    CharacterSupplierImpl ch;

//    @Before
//    public void setUp() {
//        ch = new CharacterSupplierImpl();
//    }


//    @Test
//    public void addGetTest() {
//
//        ch.addCharacters(CharacterTypes.BIG_LETTERS.set);
//        ch.addCharacters(CharacterTypes.SMALL_LETTERS.set);
//        ch.addCharacters(CharacterTypes.DIGITS.set);
//
//        for (int i = 0; i < 512; i++) {
//            char c = ch.getCharacter();
//
//            Assert.assertFalse(c < 33 || c > 126);
//        }
//    }

//    @Test(expected = IllegalStateException.class)
//    public void clearAndGetTest() {
//        ch.setCharacters(Collections.emptyList());
//
//        // The one below will throw IllegalStateException;
//        ch.getCharacter();
//    }


//    // TODO: Remove.
//    @Test
//    public void dev() {
//        ch.addCharacters(CharacterTypes.SPECIAL.set);
//
//        Supplier<Character> sup = () -> (char) ch.getCharacter();
//
//        Stream.generate(sup).limit(10).forEach(System.out::print);
//    }
}
