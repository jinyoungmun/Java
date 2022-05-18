package study;
import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int min = a;
		if(b<min) {
			min = b;
		}
		if(c<min) {
			min = c;
		}
		System.out.println("ÃÖ¼Ú°ª="+min);
	}

}
