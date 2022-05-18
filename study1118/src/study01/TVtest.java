package study01;

public class TVtest {

	public static void main(String[] args) {  // 문진영

		IPTV ipTV = new IPTV("192.1.1.2", 32, 2048);  //IP주소가 “192.1.1.2” 이고, 32인치, 2048 컬러
		ipTV.printProperty();
		
	}

}
