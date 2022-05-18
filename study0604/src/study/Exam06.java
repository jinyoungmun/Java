package study;

public class Exam06 {

	public static void main(String[] args) {
		int[][] array = {{95,96},{83,92,96},{78,83,93,87,88}};
		
		int sum = 0;
		
		for(int i = 0 ; i< array[0].length; i++) {
			sum+=array[0][i];
}
		System.out.println(sum);
}
}
