package study;

import java.util.Scanner;
import java.util.Random;

public class Exam17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		
		System.out.print("배열의 크기를 입력 : ");
		
		int []num = new int[scan.nextInt()];
		
		for(int i = 0 ; i<num.length; i++) {
			num[i] = rand.nextInt(10)+1;
			System.out.printf("num[%d] = %d\n", i, num[i]);
		}
	}

}
