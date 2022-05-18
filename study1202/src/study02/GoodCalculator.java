package study02;

import java.util.Scanner;

public class GoodCalculator extends Calculator{

	@Override
	public int add() {
		return x+y;
	}
	
	@Override
	public int subtract() {
		return x-y;
	}
	@Override
	public double average() {
		double avg = 0;
		int sum = 0;
		for(int i = 0; i<z; i++){
			sum+=a[i];
			}
		avg = (double)sum/z;
		return avg;
	}
	@Override
	public int set_x() {
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		return x;
	}
	@Override
	public int set_y() {
		Scanner scan = new Scanner(System.in);
		y = scan.nextInt();
		return y;
	}
	
	public void set_z() {
		Scanner scan = new Scanner(System.in);
		z = scan.nextInt();
		a = new int[z];
	}
	
	public void set_b() {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<z; i++) {
			a[i]=scan.nextInt();
		}
	}
	
	/* public int[] array(){
	 * int a[]; 아니면 int a[] = null;도 가능
	 * 
	 * return a;
	}


*/
}
