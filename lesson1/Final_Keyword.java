package lesson1;

public class Final_Keyword  extends StudentStatic{  // extends keyword means inheritance and 
	
	/* final keyword cannot be subclassed
	 * final keyword cannot be overriden by subclasses
	 * final variable can only be initialized once.
	 * */
	
	public final int number ;
	
	Final_Keyword () {
		number = 10;
	}


}
