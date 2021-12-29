package com.company;

public class CaesarCipherTwoOO {

    private final String alphabet;
    private final String shiftedAlphabet1;
    private final String shiftedAlphabet2;
    int mainKey1;
    int mainKey2;

    public CaesarCipherTwoOO(int key1, int key2){
        alphabet = "abcdefghijklmnopqrstuvwxyz";
        shiftedAlphabet1 = alphabet.substring(key1) + alphabet.substring(0,key1);
        shiftedAlphabet2 = alphabet.substring(key2) + alphabet.substring(0,key2);
        mainKey1 = key1;
        mainKey2 = key2;
    }

    public String encrypt(String input){
        StringBuilder encryptedMsg = new StringBuilder(input);
        CaesarCipherOO c1 = new CaesarCipherOO(mainKey1);
        String oddMsg = c1.encrypt(input);
        CaesarCipherOO c2 = new CaesarCipherOO(mainKey2);
        String evenMsg = c2.encrypt(input);
        for(int i = 0; i < encryptedMsg.length(); i++)
        {
            if (i % 2 == 0){
                encryptedMsg.setCharAt(i,oddMsg.charAt(i));
            }
            else{
                encryptedMsg.setCharAt(i,evenMsg.charAt(i));
            }
        }
        return encryptedMsg.toString();
    }

    public String decrypt(String input){
        CaesarCipherTwoOO c = new CaesarCipherTwoOO(26 - mainKey1, 26 - mainKey2);
        return c.encrypt(input);

    }
}
