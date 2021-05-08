package lesson1;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(Add(1,34));
		System.out.println(Add(1.98,34.87));
		System.out.println(Add("hello"," world"));
	}
	
	public static int Add(int a,int b) {
		return(a + b);
	}
	
	public static double Add(double a,double b) {
		return(a + b);
	}
	
	public static String Add(String a,String b) {
		return(a + b);
	}

}
