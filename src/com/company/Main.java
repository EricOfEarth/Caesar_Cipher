package com.company;

public class Main {

    public boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public String replaceVowels(String phrase, char ch){
        StringBuilder newPhrase = new StringBuilder(phrase);
        for(int i = 0; i < phrase.length(); i++) {
            if (newPhrase.charAt(i) != ' ' && isVowel(newPhrase.charAt(i))){
                newPhrase.setCharAt(i,ch);
            }
        }
        return newPhrase.toString();
    }

    public String emphasize(String phrase, char ch){
        StringBuilder newPhrase = new StringBuilder(phrase);
        for(int i = 0; i < phrase.length(); i++) {
            char currentChar = Character.toLowerCase(newPhrase.charAt(i));
            if (currentChar == ch){
                if(i % 2 == 0){
                    newPhrase.setCharAt(i,'*');
                }
                else {
                    newPhrase.setCharAt(i,'+');
                }
            }
        }
        return newPhrase.toString();
    }

    public static void main(String[] args) {
	// write your code here
    }
}
