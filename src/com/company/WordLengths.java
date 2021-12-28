package com.company;

import edu.duke.FileResource;

public class WordLengths {

    int indexOfMax(int[] values){
        int index = -1;
        int currMax = 0;
        for(int i = 0; i < values.length; i++){
            if(values[i] > currMax){
                currMax = values[i];
                index = i;
            }
        }
        return index;
    }

    void countWordLengths(FileResource fr, int [] counts){
        int currCount;
        for(String word : fr.words())
        {
            currCount = word.length();
            if(!Character.isLetter(word.charAt(word.length()-1))){
                currCount--;
            }
            if(!Character.isLetter((word.charAt(0)))){
                currCount--;
            }
            System.out.println(word + " " + currCount);
            if(currCount >= counts.length){
                counts[counts.length - 1] += 1;
            }
            else {
                counts[currCount] +=1;
            }
        }
    }

    public void testCountWordLengths(){
        FileResource fr = new FileResource();
        int [] counts = new int[31];
        countWordLengths(fr, counts);
        for(int i = 0; i < counts.length; i++){
            System.out.println("Length " + i + " Count " + counts[i]);
        }
        System.out.println("Avg " + indexOfMax(counts));
    }
}
