package study;

import java.util.Scanner;
import java.util.Random;

public class Exam18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		
		System.out.print("�迭�� ��� �� : ");
		
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
		
		System.out.print("�Էµ� ����ŭ ����  ������ �ִ� �迭�� ã�� ���� ���� �Է��Ͻÿ� : ");
		
		int num = scan.nextInt();
		int plus = 0;
		
		for(int i = 0; i<a.length; i++) {
			if(a[i]==num) {
				plus++;
			}
			
		}
		System.out.print("�Էµ� ���� ���� ������ �ִ� �迭�� ���� : "+ plus);
	}

}
