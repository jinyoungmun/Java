package study01;


	public class KumhooTire extends Tire { 
	
	
	public KumhooTire(String location, int maxRotation){  
	   super(location, maxRotation);
	}
	public boolean roll(){ 
	++accumRotation ;
	if(accumRotation < maxRotation) {
	System.out.println(location +" KumhoTire ���� :" + (maxRotation-accumRotation)+"ȸ"); 
	return true; 
	}
	else {
	System.out.println("<<<< " + location + " KumhoTire ��ũ  >>>"); 
	return false;
	}
	}
	}

