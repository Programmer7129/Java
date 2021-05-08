package lesson1;

public class Cube {
	int length;
	int breadth;
	int height;
	
	public int getCubeVolume() {
		return (length * breadth * height);
	}
	
	Cube () {                                               // To create a constructor.
		length  =  10;
		breadth =  20;
		height  =  30;
	}
	
	Cube(int l,int b,int c) {
		length = l;
		breadth = b;
		height = c;
		
	}

}
