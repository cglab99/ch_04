package condition;

import java.io.IOException;

public class Condition {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		char i;
		
		i = (char)System.in.read();

		
		switch(i) {
		
		case 'G': case 'g': 
			System.out.println("금메달");
			break;
		case 'S': case 's':
			System.out.println("은메달"); 
			break;
		case 'B': case 'b':
			System.out.println("동메달");
			break;
		default: 
			System.out.println("노메달");
			break;
		
		
		}
		
		
	}

}
