package study;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int []scores = null;
	
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.print("����>> ");
			int select = scan.nextInt();
			
			
			switch(select) {
			
			case 1:
			System.out.print("�л���>> ");
			int student = scan.nextInt();
			scores = new int[student];
			break;
			
			case 2:
				for(int i = 0 ; i< scores.length ; i++) { //�л� ���� �ȵǸ� �迭�� ũ���? scores.length?
					System.out.printf("scroes[%d] >", i);
					scores[i] = scan.nextInt();
				}
				break;
			case 3:
				for(int i = 0; i< scores.length; i++) {
					System.out.printf("scores[%d] >%d\n",i,scores[i]);
				}
				break;
			case 4:
				int sum = 0, max_score = scores[0];
				double avg;
				for(int i = 0; i< scores.length; i++) {
					sum+=scores[i];
					if(max_score < scores[i]) { // <=�� <�� �װ� �װ���;
						max_score = scores[i];
					}
				}
				avg = sum/scores.length;
				System.out.printf("�ְ� ���� : %d\n", max_score);
				System.out.printf("��� ���� : %f\n", avg);
				break;
				
			default:
				run = false;
				
			}
		}
		System.out.println("���α׷� ����");

	}

}
