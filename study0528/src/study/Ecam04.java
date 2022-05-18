package study;

public class Ecam04 {

	public static void main(String[] args) {
		
		int[] array = {100,200,300}; // 400 500
		int[] newArray = new int[array.length+2];
		
		int[] array2 = newArray;
		
		System.arraycopy(array, 0, newArray, 0, array.length);
		
		newArray[array.length] = 600;
		newArray[array.length+1] = 500;
		
		for(int i =0 ; i<newArray.length; i++) {
			System.out.printf("newArray[%d] = %d\n", i, newArray[i]);
		}
		System.out.println("------------------------");
		
		for(int i = 0; i<array2.length; i++) {
			System.out.printf("array2[%d] = %d\n", i, array2[i]);
		}

	}

}
