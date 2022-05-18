package study01;

public class Test {

	public static void main(String[] args) {
		String str = new String("자바 너무 좋아요 !!!");
		String s = new String("  자바 !!  ");
		
		System.out.println(str.length()); // 공백 포함 
		System.out.println(str.charAt(3));  // 3번 인덱스 0 1 2 3 , 너 출력
		System.out.println(str.equals(s));  // 문자 s가 있나
		int i  = 100;
		String s2 = String.valueOf(i);
		System.out.println(s2+100);
		
		System.out.println(str.substring(3)); //3 부터 끝까지 출력
		System.out.println(str.substring(3,5)); // 3부터 5-1=4까지 출력
		System.out.println(str.trim());
		
	}

}
