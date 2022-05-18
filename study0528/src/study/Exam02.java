package study;

public class Exam02 {

	public static void main(String[] args) {
		
		// int[] src = {1,2,3};
		
		int sum1 = 0;
		int sum2 = 0;
		int[][] sc = new int[][] {{1,2,3},{4,5}};
		
		System.out.println("sc.length = "+ sc.length);
		System.out.println("sc[0].length = "+ sc[0].length);
		System.out.println("sc[1].length = "+ sc[1].length);
		
		for(int i = 0; i< sc.length; i++) {
			for(int j=0; j<sc[i].length; j++) {
				System.out.printf("sc[%d][%d] = %d\n", i, j, sc[i][j]);
				if(i==0) {
					sum1+= sc[i][j];
				}
				else {
					sum2+= sc[i][j];
				}
			}
			
		}
		System.out.println("sc[0]가 참조하는 베열의 항목 총합 = "+ sum1);
		System.out.println("sc[1]가 참조하는 베열의 항목 총합 = "+ sum2);
	}

}
