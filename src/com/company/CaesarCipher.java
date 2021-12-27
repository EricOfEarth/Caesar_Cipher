package com.company;

public class CaesarCipher {

    public String encrypt(String input, int key){
        StringBuilder encryptedMsg = new StringBuilder(input);
        String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
        String shiftedUpper = alphabetUpper.substring(key) + alphabetUpper.substring(0,key);
        String shiftedLower = alphabetLower.substring(key) + alphabetLower.substring(0,key);
        for (int i = 0; i < encryptedMsg.length(); i++){
            char currChar = encryptedMsg.charAt(i);
            int indexUpper = alphabetUpper.indexOf(currChar);
            if (indexUpper != -1){
                char newChar = shiftedUpper.charAt(indexUpper);
                encryptedMsg.setCharAt(i,newChar);
            }
            int indexLower = alphabetLower.indexOf(currChar);
            if (indexLower != -1){
                char newChar = shiftedLower.charAt(indexLower);
                encryptedMsg.setCharAt(i,newChar);
            }
        }
        return encryptedMsg.toString();

    }

    public String encryptTwoKeys(String input, int key1, int key2){
        StringBuilder encryptedMsg = new StringBuilder(input);
        String oddMsg = encrypt(input, key1);
        String evenMsg = encrypt(input, key2);
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
}
