package study;

public class Exam01 {

	public static void main(String[] args) {
		
		int array[][] = { {95,86}, {83,92,96}, {78,83,93,87,88} };
		
		System.out.println("array.length = " +array.length);
		for(int i = 0; i<array.length; i++) {
			System.out.printf("array[%d].length = %d\n",i,array[i].length);
		}
		
	}

}
