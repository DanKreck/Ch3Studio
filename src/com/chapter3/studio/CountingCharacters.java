package com.chapter3.studio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) throws FileNotFoundException {

        File fileText = new File("string.txt");
        Scanner sc = new Scanner(fileText);
        String str = sc.nextLine();
        sc.close();

        char[] charactersInString = str.toCharArray();
        HashMap<Character,Integer> characterCounts = new HashMap<>();

        for (char c : charactersInString) {
            if (characterCounts.containsKey(c)) {
                int count = characterCounts.get(c);
                characterCounts.put(c, ++count);
            } else {
                characterCounts.put(c, 1);
            }

            for (Character ch : characterCounts.keySet()) {
                System.out.println(ch + ": " + characterCounts.get(ch));
            }
        }
    }
}
