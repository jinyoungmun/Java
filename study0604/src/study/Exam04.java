package study;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int []scores = null;
	
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택>> ");
			int select = scan.nextInt();
			
			
			switch(select) {
			
			case 1:
			System.out.print("학생수>> ");
			int student = scan.nextInt();
			scores = new int[student];
			break;
			
			case 2:
				for(int i = 0 ; i< scores.length ; i++) { //학생 수가 안되면 배열의 크기로? scores.length?
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
					if(max_score < scores[i]) { // <=나 <나 그게 그거임;
						max_score = scores[i];
					}
				}
				avg = sum/scores.length;
				System.out.printf("최고 점수 : %d\n", max_score);
				System.out.printf("평균 점수 : %f\n", avg);
				break;
				
			default:
				run = false;
				
			}
		}
		System.out.println("프로그램 종료");

	}

}
