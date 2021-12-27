package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPlayTest {

    @Test
    void isVowel() {
        WordPlay m = new WordPlay();
        boolean vowel = m.isVowel('a');
        assertTrue(vowel, "a is a vowel");
        boolean notVowel = m.isVowel('F');
        assertFalse(notVowel, "F is not a vowel");

    }

    @Test
    void replaceVowels(){
        WordPlay m = new WordPlay();
        String test1 = m.replaceVowels("Hello World",'*');
        assertEquals("H*ll* W*rld",test1, "Replace Vowels should work with vowels");
        String test2 = m.replaceVowels("qwrt yplk", '*');
        assertEquals("qwrt yplk", test2, "Replace Vowels should work with no vowels");
    }

    @Test
    void emphasize(){
        WordPlay m = new WordPlay();
        String test1 = m.emphasize("dna ctgaaactga", 'a');
        assertEquals("dn* ctg+*+ctg+", test1, "emphasize should work");
        String test2 = m.emphasize("Mary Bella Abracadabra", 'a');
        assertEquals("M+ry Bell+ +br*c*d*br+", test2, "Emphasize should work");
    }

}