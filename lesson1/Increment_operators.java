package lesson1;

public class Increment_operators {

	public static void main(String[] args) {
		int x = 10;
		x +=5; //x = x+5;
		System.out.println(++x);// or x++;(Post incrementation)
		System.out.println(x);  // Here the value of x will be the one after calculation,i.e. 16
		
		System.out.println(x++);
		System.out.println(x);  // Here the value of x will be the one after calculation,i.e. 17

	}
	/*
	 x++; or x = x+1;
	 x*= a; or x = x*a;
	 x -= a; or x - x-a; 
	 */

}
