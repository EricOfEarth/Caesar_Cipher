package com.company;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void isVowel() {
        Main m = new Main();
        boolean vowel = m.isVowel('a');
        assertEquals(true,vowel, "a is a vowel");
        boolean notVowel = m.isVowel('F');
        assertEquals(false, notVowel, "F is not a vowel");

    }

    @Test
    void replaceVowels(){
        Main m = new Main();
        String test1 = m.replaceVowels("Hello World",'*');
        assertEquals("H*ll* W*rld",test1, "Replace Vowels should work with vowels");
        String test2 = m.replaceVowels("qwrt yplk", '*');
        assertEquals("qwrt yplk", test2, "Replace Vowels should work with no vowels");
    }

    @Test
    void emphasize(){
        Main m = new Main();
        String test1 = m.emphasize("dna ctgaaactga", 'a');
        assertEquals("dn* ctg+*+ctg+", test1, "emphasize should work");
        String test2 = m.emphasize("Mary Bella Abracadabra", 'a');
        assertEquals("M+ry Bell+ +br*c*d*br+", test2, "Emphasize should work");
    }
}