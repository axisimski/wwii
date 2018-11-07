import java.util.Scanner;

public class WWII {
	
	
	public void Simulate() {
		
		char c='a';
		while(c!='q') {
						
			Scanner reader = new Scanner(System.in);
		    c = reader.next(".").charAt(0); 
		    
		    System.out.println("Pick a Country to lead, press g for Germany, u for the Soviet Union, u for the US");
		    
		    if(c=='p') {		    	
		    	Poland poland=new Poland();
		    	poland.run();	    	
		    	
		    }
		    
		    if(c=='g') {		    	
		    	Germany germany=new Germany();
		    	germany.run();	    	
		    	
		    }
		    
		    if(c=='u') {		    	
		    	USSR ussr=new USSR();
		    	ussr.run();    	
		    	
		    }
		    
		    
		    
		   		    
		    
		    
		}
		
		
		
		
	}
	
	

}
