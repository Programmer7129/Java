package lesson1;

class IfStatement {
	/*
	 if (boolean_expression)
	 {
	 execute if the boolean expression is true
	 }
	 */
	
	/*
	 ==  is equal to
	 !=  is not equal to
	 >   is greatr than
	 <   is less than 
	 >=  is greater than or equal to  
	 <=  is less than or equal to
	 */

	public static void main(String[] args) {
		int x = 10;
		
		if (x == 10){                        // "==" Checks equality
			System.out.println("Yes x is equal to 10");
		}
		else {
			System.out.println("No x != 10");             // "!=" not equal to
		}

	}

}
