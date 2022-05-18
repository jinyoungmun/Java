package study0409;

public class Exam04 {

	public static void main(String[] args) {

		int pencils = 534;
		int student = 30;
		
		int pencilsPerStudent = (pencils/student);
		System.out.println("학생 1명이 가지는 연필의 개수 : " + pencilsPerStudent);
		
		int pencilsLeft = (pencils%student);
		System.out.println("남은 연필의 개수 : " + pencilsLeft);
	}

}
