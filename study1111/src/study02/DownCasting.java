package study02;

public class DownCasting {

	public static void main(String[] args) {

		Person p = new Student("���ϴ�");
		System.out.println("�л��̸� : " + p.name);
		
		if(p instanceof Student) {
			System.out.println("���� p�� �����ϰ� �ִ� ��ü�� Student ��ü�Դϴ�.");
			System.out.println("p�� Student Ÿ������ ���� Ÿ�Ժ�ȯ�� �����մϴ�.");
			
			Student s = (Student)p;
			s.department = "������Ű�";
			s.grade = "2�г�";
			s.classroom = "��";
			
			System.out.println("�а� : " + s.department);
			System.out.println("�г� : " + s.grade);
			System.out.println("�а� : " + s.department);
		}
	}

}
