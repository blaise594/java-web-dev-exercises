package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import  java.util.Map;
import java.util.Scanner;


// Write a program to count the number of times each character occurs in a string
// and then print the results to the console.
// Ways to approach problem
//  1. Loop through the string one character at a time,
//  2. Store and/or update the count for a given character using an appropriate data structure.
//  3. Loop through the data structure to print the results (one character and its count per line).
public class CountChar {
    public static void main (String[] args) {
        // Initialize a hashmap
        HashMap<Character, Integer> charCount = new HashMap<>();
        //create new scanner
        Scanner input = new Scanner(System.in);
        //get user input
        System.out.println("Enter characters to count: ");
        //store input in a string
        String stringOfCharacters = input.nextLine();

        //convert to a character array
        char[] charsInString = stringOfCharacters.toCharArray();
        //loop through character array
        //for each character in the text iterate
        for(char character : charsInString){
            if(charCount.containsKey(character)){
                charCount.put(character, charCount.get(character) + 1);
            }
            else{
                charCount.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> eachChar : charCount.entrySet()){
            System.out.println(eachChar.getKey() + ": " + eachChar.getValue());
        }
    }
}
