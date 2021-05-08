package lesson1;

class Arrays {

	public static void main(String[] args) {
		int[] myintarray = {1,2,3,4,5};               //First and most preferred method.
		/*
		  int[] myintarray = new int{1};          
		  int[] myintarray = {1,2,3};
		  int[] myintarray = new int[]{1,2,3};				
		 */
		int index=0;
		while (index < 5) {
		System.out.println(myintarray[index]); // The "3" is the index and it always starts from 0
		index++;
		}
	}

}
