package study;

public class Calcu {

	int add(int[]num){
		int sum = 0;
		for(int i = 0; i<num.length; i++) {
			sum+=num[i];
		}
		return sum;
	}
	
	int sum(int ... num) {
		int sum1 = 0;
		for(int i = 0; i<num.length; i++) {
			sum1+=num[i];
		}
		return sum1;
	}
}
