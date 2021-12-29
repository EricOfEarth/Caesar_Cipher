package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherOOTest {

    @Test
    void encrypt(){
        CaesarCipherOO c = new CaesarCipherOO(23);
        String test1 = c.encrypt("FIRST LEGION ATTACK EAST FLANK!");
        assertEquals("CFOPQ IBDFLK XQQXZH BXPQ CIXKH!", test1, "Encrypt should work");
        CaesarCipherOO c2 = new CaesarCipherOO(17);
        String test2 = c2.encrypt("First Legion");
        assertEquals("Wzijk Cvxzfe", test2, "encrypt should work");
        CaesarCipherOO c3 = new CaesarCipherOO(23);
        String test3 = c3.encrypt("First Legion");
        assertEquals("Cfopq Ibdflk", test3, "encrypt should work");
    }

    @Test
    void decrypt(){
        CaesarCipherOO c = new CaesarCipherOO(23);
        String test1 = c.decrypt("CFOPQ IBDFLK XQQXZH BXPQ CIXKH!");
        assertEquals("FIRST LEGION ATTACK EAST FLANK!", test1, "Decrypt should work");
        CaesarCipherOO c2 = new CaesarCipherOO(17);
        String test2 = c2.decrypt("Wzijk Cvxzfe");
        assertEquals("First Legion", test2, "decrypt should work");
        CaesarCipherOO c3 = new CaesarCipherOO(23);
        String test3 = c3.decrypt("Cfopq Ibdflk");
        assertEquals("First Legion", test3, "decrypt should work");
    }

}