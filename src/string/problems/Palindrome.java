package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please type a word you want to see Palindrome on");
String firstWord = sc.nextLine() ;
String reverseWord = "";
int wordLength = firstWord.length();
for (int i = (wordLength-1); i>=0; --i) {
	reverseWord = reverseWord + firstWord.charAt(i);
}

if (firstWord.toLowerCase().equals(reverseWord.toLowerCase())) {
	System.out.println("This is a Palindrome, yay!!");
} else {
	System.out.println("NOT a palindrome");
}

    }
}
