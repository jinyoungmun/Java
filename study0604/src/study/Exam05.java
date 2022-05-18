package study;

public class Exam05 {

	public static void main(String[] args) {
		int[][] array = {{1,2},{3,4,5},{6,7,8,9,10}};
		
		int sum = 0;
		
		for(int i = 0 ; i< array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				sum+= array[i][j];
			}
			System.out.printf("array[%d]의 항목 합 : %d\n",i,sum);
			sum = 0;
		}
		
			

	}

}
