package lab5;

import java.util.Scanner;

public class Main  {
	
	
	public static void main (String[] args) {
		
		// Skapa en tom ordlista på ngt sätt och fyll den med ord. 
		// Dictionary
		
		//sweng = ...;
		Dictionary sweng = new Dictionary();
		sweng.add("hej", "hello");
		sweng.add("hej", "hi");
		sweng.add("hej", "hey");
		sweng.add("godnatt", "goodnight");
		sweng.add("nattinatti", "good night");
		sweng.add("Scanner", "scan");
		sweng.add("hund", "dog");
		sweng.add("katt", "cat");
		WordQuiz quiz = new WordQuiz(sweng);
		quiz.runQuiz();
		
	}
	
	
	
} 