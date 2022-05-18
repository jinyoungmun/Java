package study03;

public class Student extends People {

	int stuNum;
	
	Student(String n, String sn,int s){
		super(n, sn);
		stuNum = s;
	}
	
	void showStudent(){
		showPeople();
		System.out.println("ÇÐ¹ø : "+stuNum);
	}
	
	}
