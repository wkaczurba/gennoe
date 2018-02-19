package com.wkaczurba.text;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum CharacterTypes {
        SMALL_LETTERS(IntStream.rangeClosed((int) 'a', (int) 'z') ),
        BIG_LETTERS(IntStream.rangeClosed((int) 'A', (int) 'Z')),
        DIGITS(IntStream.rangeClosed( (int) '0', (int) '9')),
        SPECIAL(IntStream.rangeClosed( 33, 126 )
                .filter( x -> (x < '0' || x > '9') && (x < 'A' || x > 'Z') && ( x < 'a' || x > 'z') )),
        ALL(IntStream.rangeClosed(33, 126));

        public Set<Character> set;

        CharacterTypes(IntStream is) {
            Set<Character> s = is.mapToObj(x -> (char) x)
                    .collect(Collectors.toSet());
            this.set = Collections.unmodifiableSet(s);
        }
    }