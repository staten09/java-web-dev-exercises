package org.launchcode.java.studios.countingcharacters;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;


public class CountingChar {

    public static void main(String[] args){
        HashMap<Character, Integer> charCount = new HashMap<>();
        String quote;
        int value = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your quote: ");
        quote = input.nextLine().toLowerCase().replace(" ","");
        char[] charactersInString = quote.toCharArray();

        for(char character : charactersInString) {
            if (charCount.containsKey(character)) {
                charCount.put(character, charCount.get(character) + 1);
            } else {
                charCount.put(character, 1);
            }
        }
        System.out.println(charCount);
    }



}
