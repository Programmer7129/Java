package lesson1;

class LogicalOperatorsWithIfStatement {

	public static void main(String[] args) {
		int subject1 = 20;
		int subject2 = 25;
		// && -> And ; ||  -> OR
		if ((subject1 >=35) || (subject2 >= 35)) {  /* && evaluates all the conditions in the if statement.
			                                           || evaluates any condition in the if statement.
			                                           */
		    System.out.println("the condotion is true");
		}
		else {
			System.out.println("the condition is false");
		}

	}

}
