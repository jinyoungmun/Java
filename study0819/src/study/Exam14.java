package study;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� ���� ������ ���ұ��? ");

		int num = scan.nextInt();
		int sum = 0;
		int count = 0;
		double avg;
		for(int i =1; i<=num; i++) {
			System.out.print("���� �Է� : ");
			int temp = scan.nextInt();
			if(temp<0) {
				System.out.println("�Էµ� ������ �����Դϴ�. ������ ������ �ʽ��ϴ�.");
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
		System.out.println("�Էµ� ���� ������ �� = "+sum);
		System.out.println("�Էµ� ���� ������ ��� = "+avg);
	}

}
