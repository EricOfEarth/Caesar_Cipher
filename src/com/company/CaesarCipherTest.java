package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    @Test
    void encrypt(){
        CaesarCipher c = new CaesarCipher();
        String test1 = c.encrypt("FIRST LEGION ATTACK EAST FLANK!", 23);
        assertEquals("CFOPQ IBDFLK XQQXZH BXPQ CIXKH!", test1, "Encrypt should work");
        String test2 = c.encrypt("First Legion", 17);
        assertEquals("Wzijk Cvxzfe", test2, "encrypt should work");
        String test3 = c.encrypt("First Legion", 23);
        assertEquals("Cfopq Ibdflk", test3, "encrypt should work");
    }

}