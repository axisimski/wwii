import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		char c='a';
		while(c!='q') {
			
			
			Scanner reader = new Scanner(System.in);
		    c = reader.next(".").charAt(0); 
		    System.out.println(c);			
			
		    
		    
		    if(c=='w'){		    	
		    	WWII wwii= new WWII();
		    	wwii.Simulate();		    	
		    }
		    
		    
		    
		    
		    
			
		}
		

	}

 

}
