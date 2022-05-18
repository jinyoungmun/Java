package study;

public class Exam02 {

	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		
		int max_array = array[0];
		int min_array = array[0];
		
		for(int i = 0; i< array.length; i++) {
			if(max_array <= array[i]) { // 생각을 해보니까 '='는 안붙여도 됨.
				max_array = array[i];
			}
			if(min_array >= array[i]) { // 생각을 해보니까 '='는 안붙여도 됨.
				min_array = array[i];
			}
		}
		System.out.println(max_array);
		System.out.println(min_array);
		

	}

}
