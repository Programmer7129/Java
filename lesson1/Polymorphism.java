package lesson1;

public class Polymorphism {

	public static void main(String[] args) {  // We canot use here. i.e,
		Poly_Class abc  = new Poly_ABC();
		Poly_Class def  = new Poly_DEF();
		Poly_Class xyz  = new Poly_XYZ();
		
		// Poly_Class gh = new Poly_Class(); Like this. It is wrong (Abstract Method)
		
		System.out.println(abc.getInterestRate());
		System.out.println(def.getInterestRate());
		System.out.println(xyz.getInterestRate());

	}

}
