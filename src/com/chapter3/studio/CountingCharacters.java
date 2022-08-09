package com.chapter3.studio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {

        String str = "test";
        char[] charactersInString = str.toCharArray();
        HashMap<Character,Integer> characterCounts = new HashMap<>();

        for (char c : charactersInString) {
            if (characterCounts.containsKey(c)) {
                int count = characterCounts.get(c);
                characterCounts.put(c, ++count);
            } else {
                characterCounts.put(c, 1);
            }

            System.out.println(characterCounts);
        }
    }
}
