package lesson1;

public class Static {
//What does static keyword do in class?
	public static void main(String[] args) {
		//static members belong to the class instead of a specific instance.
		HelloStatic hello = new HelloStatic();    // Static method can be accessedc through class.
		HelloStatic.age = 10;
		System.out.println(HelloStatic.age);
		HelloStatic.DoSomething("Hi Youtube");// Unstatic method cannot be accessed directly through class.
		hello.DoSomethingElse("hello world");// this is a unstatic method Cteated in helloStatic class.
		
		HelloStatic hello1 = new HelloStatic();
		HelloStatic.age = 50;
		System.out.println(HelloStatic.age);

	}
}
