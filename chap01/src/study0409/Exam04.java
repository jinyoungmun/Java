package study0409;

public class Exam04 {

	public static void main(String[] args) {

		int pencils = 534;
		int student = 30;
		
		int pencilsPerStudent = (pencils/student);
		System.out.println("�л� 1���� ������ ������ ���� : " + pencilsPerStudent);
		
		int pencilsLeft = (pencils%student);
		System.out.println("���� ������ ���� : " + pencilsLeft);
	}

}
