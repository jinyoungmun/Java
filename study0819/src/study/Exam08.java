package study;
import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("���� �Է� : ");
			num = scan.nextInt();
			
		}while(num<100 || num>999);
		
		System.out.println("�Էµ� ������ " + num + "�Դϴ�.");
			
}	
	}