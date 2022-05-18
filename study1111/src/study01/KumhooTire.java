package study01;


	public class KumhooTire extends Tire { 
	
	
	public KumhooTire(String location, int maxRotation){  
	   super(location, maxRotation);
	}
	public boolean roll(){ 
	++accumRotation ;
	if(accumRotation < maxRotation) {
	System.out.println(location +" KumhoTire ¼ö¸í :" + (maxRotation-accumRotation)+"È¸"); 
	return true; 
	}
	else {
	System.out.println("<<<< " + location + " KumhoTire ÆãÅ©  >>>"); 
	return false;
	}
	}
	}

