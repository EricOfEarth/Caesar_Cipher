package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        CaesarCipher c = new CaesarCipher();
        String message = c.encryptTwoKeys("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 8, 21);
        System.out.println(message);
    }
}
