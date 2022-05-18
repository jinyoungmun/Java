package sec01.exam01;

public class Exam02 {

	public static void main(String[] args) {

		String str = "100";
		byte b1 = Byte.parseByte(str);
		byte b2 = 10;
		int i1 = Integer.parseInt(str);
		double d1 = Double.parseDouble(str);
		
		double r1 = i1 + d1;
		int e1 = b1 + b2;
		
		System.out.println(b1);
		System.out.println(e1);
		System.out.println(r1);
		
		int i2 = 200;
		String str2 = String.valueOf(i2);
		String str3 = i1 + str2;
		System.out.println(str);
	}

}
