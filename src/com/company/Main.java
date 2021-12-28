package com.company;

import edu.duke.FileResource;

import java.io.File;

public class Main {


    public static void main(String[] args) {
	// write your code here
        //CaesarCipher c = new CaesarCipher();
        //String message = c.encryptTwoKeys("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 8, 21);
        //System.out.println(message);
        //WordLengths w = new WordLengths();
        //w.testCountWordLengths();
        CaesarBreaker cb = new CaesarBreaker();
        FileResource fr = new FileResource();
        System.out.println(cb.decryptTwoKeys(fr.asString()));
        //System.out.println(cb.decryptTwoKeys("Akag tjw Xibhr awoa aoee xakex znxag xwko"));
        //CaesarCipher c = new CaesarCipher();
        //System.out.println(c.encryptTwoKeys("Top ncmy qkff vi vguv vbg ycpx", 24, 6));

    }
}
