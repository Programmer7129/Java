package lesson1;

class StringJava {

	public static void main(String[] args) {
		String myString = "Hello World";    // Concetenate two strings.
		int myStringLength = myString.length();
		String myStringInCase = myString.toUpperCase();
		
		System.out.println(myString.indexOf('o'));
		System.out.println(myStringLength);
		System.out.println(myStringInCase);
		System.out.println(myString.replace('e' , 'a')); // "first, to be changed", "second,changed"
		          /* We can hover the word "replace" or any to see the function of the 
		           word.
		           
		           After putting the dot "myString." we may get different options.
		           */

	}

}
