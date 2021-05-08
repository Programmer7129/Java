package lesson1;

class SwitchStatement {

	public static void main(String[] args) {
		int score = 45;
		//  byte, short, int,or char
		switch (score){
		case 100 :
		case 95 :
		case 90 :
		System.out.println("Very good");
		    break;
		case 80 :
		case 60 :
			System.out.println("Good");
			break;		
		case 45 :
		case 40 :
			System.out.println("OK");
			break;
			default :
				System.out.println("The grades are not defined");
				break;
		} 
		

	}

}
