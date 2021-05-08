package lesson1;

public class StudentStatic {
	String Name;
	int age;
	static int NoOfStudents = 0;
	
	StudentStatic (){
		NoOfStudents++;
	}
	public static int getNoOfStudents() {
		return NoOfStudents;
	}
	 
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;               // this. means that the variable is class variable
	}                                   // and herever this. is not there it is a local variable. 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
