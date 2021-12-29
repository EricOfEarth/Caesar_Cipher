package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTwoOOTest {

    @Test
    void encryptTwoKeys(){
        CaesarCipherTwoOO c = new CaesarCipherTwoOO(23,17);
        String test1 = c.encrypt("First Legion");
        assertEquals("Czojq Ivdzle", test1, "encrypt two keys should work");
    }

    @Test
    void decryptTwoKeys(){
        CaesarCipherTwoOO c = new CaesarCipherTwoOO(23,17);
        String test1 = c.decrypt("Czojq Ivdzle");
        assertEquals("First Legion", test1, "decrypt two keys should work");
    }
}