package study03;

public class People {
	
	private String name;
	private String ssn;
	
	People(String n, String sn){
		name = n;
		ssn = sn;
	}
	
	void showPeople(){
		System.out.println("이름 : "+name);
		System.out.println("주민번호 : "+ssn);
	}
}
