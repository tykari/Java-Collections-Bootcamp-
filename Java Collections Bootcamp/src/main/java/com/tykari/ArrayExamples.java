package com.tykari;

import java.util.Arrays;
import java.util.List;

public class ArrayExamples {

    public static void main (String args []){

        List wordlist = Arrays.asList("hello","my","i","am","a","list");
        System.out.println(wordlist);

        String[] words = {"hello", "my", "i", "am", "a", "list"};
        System.out.println(words);
    }
}
