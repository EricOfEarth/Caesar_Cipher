package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarBreakerTest {

    @Test
    void testDecrypt(){
        CaesarCipher c = new CaesarCipher();
        String originalMessage = "Just a test string with lots of eeeeeeeeeeeeeeeees";
        String encrypted = c.encrypt(originalMessage, 23);
        CaesarBreaker cb = new CaesarBreaker();
        String message = cb.decrypt(encrypted);
        assertEquals(originalMessage, message, "Decrypt should work");
    }

    @Test
    void testHalfOfString(){
        CaesarBreaker cb = new CaesarBreaker();
        String input = "Qbkm Zgis";
        String firstHalf = cb.halfOfString(input,0);
        assertEquals("Qk gs", firstHalf,"first half should work");
        String secondHalf = cb.halfOfString(input, 1);
        assertEquals("bmZi", secondHalf, "Second half should work");
    }

    @Test
    void testDecryptTwoKeys(){
        CaesarBreaker cb = new CaesarBreaker();
        String input = "Gwpv c vbuq pvokki yfve iqqu qc bgbgbgbgbgbgbgbgbu";
        String originalMessage = "Just a test string with lots of eeeeeeeeeeeeeeeees";
        String output = cb.decryptTwoKeys(input);
        assertEquals(originalMessage,output,"decrypt two keys should work");
    }

}