package questions_set_1.SET_B;

import java.util.Scanner;

public class Q1 {
	public static String transformString(String str) {
		String result = "";
		String pool = "aeiouAEIOU";
		for(int i = 0;i < str.length();i++) {
			char ch = str.charAt(i);
			if(pool.indexOf(ch) == -1) {
				if(Character.isUpperCase(ch)) {
					result += (char)('A' + (ch - 'A' + 1) % 26);
				} 
				
				if(Character.isLowerCase(ch)) {
					result += (char)('A' + (ch - 'A' + 1) % 26);
				}
			
			} else {
				result += ch;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = obj.nextLine();
		
		System.out.println("Transformed String : " + transformString(str));
		obj.close();
	}
}
