package lesson1;

class DoWhile_Loop {

	public static void main(String[] args) {
        int a = 0;
		
		while (a <= 10)
		{
			System.out.println(a);
			a++;
		}
		
		System.out.println("-------------------------------");     //Do while loop first executes the statement and then checks the condition.
		int b = 0;
		do {
			System.out.println(b);
			b++;
		} while(b <= 10);

	}

}
