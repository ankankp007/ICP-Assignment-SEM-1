package questions_set_1.SET_A;

import java.util.Scanner;

public class Q1 {
	public static boolean containsSequentialNumbers(int[] numbers) {
		int N = numbers.length;
		for(int i = 0;i < N - 3;i++) { 
			if((numbers[i] + 2 == numbers[i + 1] + 1) && (numbers[i + 1] + 1 == numbers[i + 2])){
				return true;
			} 
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int N = obj.nextInt();
		int arr[] = new int[N];
		System.out.println("Enter " + N + " number : ");
		for(int i = 0;i < N;i++) { 
			arr[i] = obj.nextInt();
		}

		if(containsSequentialNumbers(arr)) { 
			System.out.println("Array contains three sequential numbers");
		} else {
			System.out.println("Array DOESN'T contains three sequential numbers\"");
		}

		obj.close();
	}
}
