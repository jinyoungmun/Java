package study;

public class Exam07 {

	public static void main(String[] args) {
		UPPER: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower == 'g') {
					System.out.println("���α׷��� �����մϴ�.");
					break UPPER;
				}
			}
		}
	}

}
