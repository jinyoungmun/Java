package study;

public class MemberService {

	boolean login(String a, String b){
		boolean result = false;
		if(a.equals("hong")) {
			if(b.equals("12345")) {
				
			result = true;
		}
		}
		return result;
	}
	void logout(){
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	

}
