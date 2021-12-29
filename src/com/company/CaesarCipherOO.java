package com.company;

public class CaesarCipherOO {

    private final String alphabet;
    private final String shiftedAlphabet;
    int mainKey;

    public CaesarCipherOO(int key){
        alphabet = "abcdefghijklmnopqrstuvwxyz";
        shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);
        mainKey = key;
    }

    public String encrypt(String input){
        StringBuilder encryptedMsg = new StringBuilder(input);
        for (int i = 0; i < encryptedMsg.length(); i++){
            char currChar = encryptedMsg.charAt(i);
            int index = alphabet.indexOf(currChar);
            //check if character is lowercase
            if (index != -1){
                char newChar = shiftedAlphabet.charAt(index);
                encryptedMsg.setCharAt(i,newChar);
            }
            else{
                index = alphabet.indexOf(Character.toLowerCase(currChar));
                //check if character is uppercase
                if (index != -1){
                    char newChar = Character.toUpperCase(shiftedAlphabet.charAt(index));
                    encryptedMsg.setCharAt(i,newChar);
                }
            }
        }
        return encryptedMsg.toString();
    }

    public String decrypt(String input){
        CaesarCipherOO c = new CaesarCipherOO(26 - mainKey);
        return c.encrypt(input);
    }



}
