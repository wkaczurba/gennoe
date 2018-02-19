package com.wkaczurba.text;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class CharacterSupplierImpl implements CharacterSupplier {

    private final List<Character> characters = new ArrayList<>();

    public CharacterSupplierImpl(Collection<Character> characters) {
        this.characters.addAll(characters);
    }

    /**
     * @return character as char or -1 when no character is available;
     */
    @Override
    public char getCharacter() {
        ThreadLocalRandom tlc = ThreadLocalRandom.current();

        if (characters.size() == 0) {
            throw new IllegalStateException("No characters set.");
        }

        Optional<Character> characterOptional = characters.stream()
                .skip(tlc.nextInt(0, characters.size()))
                .findFirst();

        if (characterOptional.isPresent()) {
            return characterOptional.get();
        }
        throw new IllegalStateException("No characters");
    }

    public Collection<Character> getCharacters() {
        return Collections.unmodifiableList(new ArrayList<>(this.characters));
    }
}