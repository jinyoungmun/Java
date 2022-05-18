package study;

import java.util.Scanner;
import java.util.Random;

public class Exam18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		
		System.out.print("배열의 요소 수 : ");
		
		int [] a = new int[scan.nextInt()];
		
		for(int i = 0 ; i<a.length; i++) { 
			a[i] = rand.nextInt(10)+1;
			for(int j = 10; j>0 ;j--) {
				if(a[i] >= j) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(i);
			System.out.println();
		}
		System.out.println("---------------------");
		
		for(int i = 0 ; i<a.length; i ++) {
			System.out.printf("a[%d] = %d\n",i,a[i]);
		}
		
		System.out.print("입력된 수만큼 별을  가지고 있는 배열을 찾기 위한 수를 입력하시오 : ");
		
		int num = scan.nextInt();
		int plus = 0;
		
		for(int i = 0; i<a.length; i++) {
			if(a[i]==num) {
				plus++;
			}
			
		}
		System.out.print("입력된 별의 수를 가지고 있는 배열의 수는 : "+ plus);
	}

}
