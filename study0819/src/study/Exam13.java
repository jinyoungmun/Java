package study;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); //������
		int month;
		int retry;
		do {
			do {
				System.out.print("1 ~ 12������ ���ڸ� �Է��ϼ���.>> ");
				month = scan.nextInt();
			}while(month <1 || month >12);
			
			if(month>=3 && month<=5) {
				System.out.printf("%d���� \"��\" �Դϴ�.",month);
			}else if(month >= 6 && month<=8) {
				System.out.printf("%d���� \"����\" �Դϴ�.",month);
			}else if(month >=9 && month<=10){
				System.out.printf("%d���� \"����\" �Դϴ�.",month);
			}else {
				System.out.printf("%d���� \"�ܿ�\" �Դϴ�.",month);
			}
			
			System.out.println("\n ------------------------");
			System.out.print("�ٽ� �Ϸ��� \"1\", �����Ϸ��� \"0\"�� �Է��Ͻÿ�.>> ");
			retry = scan.nextInt();
	}while(retry == 1);
		System.out.println("���α׷��� ����Ǿ����ϴ�.");

	}
}
