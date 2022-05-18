package study;

public class IntArrayExam01 {

	public static void main(String[] args) {
		
		/*int[] num = new int[4];
		
		num[0]=70;
		num[1]=80;
		num[2]=90;
		num[3]=100;
		
		int[] num = {70, 80, 90, 100};
		
		int[]num = new int[] {70,80,90,100};*/
		
		int sum = 0;
		int[] num;
		num= new int[] {1,2,3,4};
		
		for(int i=0; i<num.length; i++) {
			sum+=num[i];
			System.out.println(num[i]);
		}
		System.out.println(sum);

		String[] str = new String[5];
		System.out.println(str[1]);
		 
		double[] d= new double[6];
		System.out.println(d[5]);
		
		double avg;
		
		for(int i = 0; i<num.length; i++) {
			sum+=num[i];
		}
		avg = (double)sum/num.length;
		System.out.println(avg);
		
		
	}

}
