package study;
import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�.>>");
		int num = scan.nextInt();
		if(num > 0) {
			System.out.println(num+"�� ���밪 :"+ num);
		}
		else {
		num = -num;
			System.out.println(num+"�� ���밪 :"+ num);
		}
	}

}
