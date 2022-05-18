package study;

public class Exam03 {

	public static void main(String[] args) {
		//String[] str = {"강아지", "고양이", "송아지"};
		
		String[] str = new String[3];
		str[0] = "강아지";  // 문자열 객체는 문자열 리터럴로 생성
		str[1] = "강아지";  // 문자열 객체는 문자열 리터럴로 생성
		str[2] = new String("강아지");  // new 연산자를 이용해서 문자열 객체를 생성
		
		for(int i = 0; i < str.length; i++) {
		System.out.printf("str[%d] = %s\n", i, str[i]);
		}
		
		System.out.println(str[0] == str[1]); // str[0] 과 str[1]이 참조하는 객체 동일?
		System.out.println(str[1] == str[2]); // str[1] 과 str[2]이 참조하는 객체 동일?
		System.out.println(str[0].equals(str[2])); // str[0] 과 str[2]이 참조하는 객체의 문자열 비교?
		

	}

}
