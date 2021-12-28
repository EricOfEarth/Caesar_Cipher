package com.company;

public class CaesarBreaker {

    public int[] countLetters(String message){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int [] counts = new int[26];
        for(int k = 0; k < message.length(); k++){
            char ch = Character.toLowerCase(message.charAt(k));
            int index = alphabet.indexOf(ch);
            if(index != -1){
                counts[index] += 1;
            }
        }
        return counts;
    }

    public int maxIndex(int [] values){
        int maxIndex = -1;
        int currMax = 0;
        for(int i = 0; i < values.length; i++){
            if(values[i] > currMax){
                currMax = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public String decrypt(String encrypted){
        CaesarCipher c = new CaesarCipher();
        int key = getKey(encrypted);
        return c.encrypt(encrypted, 26-key);
    }

    public String decryptTwoKeys(String encrypted){
        CaesarCipher c = new CaesarCipher();
        int key1 = getKey(halfOfString(encrypted,0));
        int key2 = getKey(halfOfString(encrypted,1));
        System.out.println("Key 1: " + key1 + " Key 2: " + key2);
        return c.encryptTwoKeys(encrypted,26-key1, 26-key2);
    }

    public String halfOfString(String message, int start){
        StringBuilder half = new StringBuilder();
        for(int i = start; i < message.length(); i = i+2){
            half.append(message.charAt(i));
        }
        return half.toString();
    }

    public int getKey(String s){
        int max = maxIndex(countLetters(s));
        int key = max - 4;
        if (max < 4){
            key = 26 - (4-max);
        }
        return key;
    }
}
