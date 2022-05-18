package study;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몇 개의 정수를 더할까요? ");

		int num = scan.nextInt();
		int sum = 0;
		int count = 0;
		double avg;
		for(int i =1; i<=num; i++) {
			System.out.print("정수 입력 : ");
			int temp = scan.nextInt();
			if(temp<0) {
				System.out.println("입력된 정수는 음수입니다. 음수는 더하지 않습니다.");
				continue;
			}
			sum+=temp;
			count++;
			
			/* if(temp > 0 ){
			 sum+=temp;
			 count++;
			 }
			 */
		}
		avg = (double)sum/count;
		System.out.println("입력된 양의 정수의 합 = "+sum);
		System.out.println("입력된 양의 정수의 평균 = "+avg);
	}

}
