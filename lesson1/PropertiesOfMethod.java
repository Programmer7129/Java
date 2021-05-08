package lesson1;

class PropertiesOfMethod {

	public static void main(String[] args) {
		sayHello("John");
		sayHello("Nick");
		sayHello("Rohan");
		Add(100,201,345);
		Add(543,876,345);
		int sum = Add(100,100,100);
		int result = sum * 15;
		System.out.println(result);

	}
	
	public static void sayHello(String name) {
		System.out.println("Hello" + name);
	}
	
	public static int Add (int a,int b,int c) {
		//System.out.println(a+b+c);
		return (a+b+c);
	}

}
