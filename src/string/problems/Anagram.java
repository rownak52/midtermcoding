package string.problems;
import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type in a word for anagram comparison");
    	        String phrase1 = sc.nextLine();
    	        phrase1 = (phrase1.toLowerCase()).trim();
    	        char[] phrase1Arr = phrase1.toCharArray();

    	        System.out.println("Please type the second word for anagram comparison");
    	        String phrase2 = sc.nextLine();
    	        phrase2 = (phrase2.toLowerCase()).trim();
    	        ArrayList<Character> phrase2ArrList = convertStringToArraylist(phrase2);

    	        if (phrase1.length() != phrase2.length()) {
    	            System.out.print("There is no anagram present.");
    	        } else {
    	            boolean isFound = true;
    	            for (int i = 0; i < phrase1Arr.length; i++) {
    	                for (int j = 0; j < phrase2ArrList.size(); j++) {
    	                    if (phrase1Arr[i] == phrase2ArrList.get(j)) {
    	                        System.out.print("There is a common element.\n");
    	                        isFound = true;
    	                        phrase2ArrList.remove(j);
    	                    }
    	                }
    	                if (isFound == false) {
    	                    System.out.print("There are no anagrams present.");
    	                    return;
    	                }
    	            }
    	            System.out.printf("%s is an anagram of %s", phrase1, phrase2);
    	        }
    	    }

	public static ArrayList<Character> convertStringToArraylist(String str) {
		ArrayList<Character> charList = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			charList.add(str.charAt(i));
		}
		return charList;
	}
}