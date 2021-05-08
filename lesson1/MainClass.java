package lesson1;

public class MainClass {

	public static void main(String[] args) {
		StudentClass Mark = new StudentClass();// Mark -> object or instance.
		
		Mark.setId(1);
		Mark.setName("Mark");
		Mark.setAge(15);
		
		System.out.println(Mark.getName()+ " is " + Mark.getAge() + " years old");

	}

}
