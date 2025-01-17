package questions_set_1.SET_A;

import java.util.Scanner;

public class Q2 {
	public static String formatSentence(String sentence) {
		String result = "";
		String[] words = sentence.split(" ");
		
		for(String word: words) { 
			result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
		}
		
		return result;
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = obj.nextLine();
		
		System.out.println("Formatted String : " + formatSentence(str));
		obj.close();
	}
}
