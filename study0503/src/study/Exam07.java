package study;

public class Exam07 {

	public static void main(String[] args) {
		UPPER: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower == 'g') {
					System.out.println("프로그램을 종료합니다.");
					break UPPER;
				}
			}
		}
	}

}
