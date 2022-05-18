package study05;

public class Song {
	
	private String title;
	
	Song(String t){
		title = t;
	}
	
	String get_title(){
		return title;
	}

	public static void main(String[] args) {
		
		Song S1 = new Song("awme to wastu");
		Song S2 = new Song ("tukishime");
		
		System.out.println(S1.title);
		System.out.println(S2.title);
		System.out.println();
	}

}
