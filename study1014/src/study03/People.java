package study03;

public class People {
	
	private String name;
	private String ssn;
	
	People(String n, String sn){
		name = n;
		ssn = sn;
	}
	
	void showPeople(){
		System.out.println("�̸� : "+name);
		System.out.println("�ֹι�ȣ : "+ssn);
	}
}
