package lesson1;

public class StaticExample {

	public static void main(String[] args) {
		StudentStatic Mark = new StudentStatic();
		System.out.println(Mark.getNoOfStudents());
		StudentStatic Tom = new StudentStatic();
		System.out.println(Tom.getNoOfStudents());
		
		System.out.println(StudentStatic.getNoOfStudents());

	}

}
