package lesson1;

class ForLoops {

	public static void main(String[] args) {
		int[] myintarray = {1,2,3,4,5};
		
		for (int index = 0 ; index < 5 ; index++) // (initialization ; expression ; increment);
		{
			System.out.println(myintarray[index]);
		} 
		
		for (int element : myintarray)                //Intelligent way for "for loop".
		{                          //By this way we can print all the values declared in an array.
			System.out.println(element);
		}
	}

}
