import java.util.Scanner;

public class WWII {
	
	
	public void Simulate() {
		
		char c='a';
		while(c!='q') {
						
			Scanner reader = new Scanner(System.in);
		    c = reader.next(".").charAt(0); 
		    
		    System.out.println("Pick a Country to lead, press g for Germany, r for the Soviet Union, u for the US");
		    
		    if(c=='g') {		    	
		    	Germany germany=new Germany();
		    	germany.run();	    	
		    	
		    }
		    
		    
		    
		    //Add countries here in if statments
		    
		    
		    
		}
		
		
		
		
	}
	
	

}
