import java.util.ArrayList;
import java.util.Scanner;

public class Germany extends Country{
	
	public int armySize=2000000;
	public int landArea=400;
	public ArrayList<String> conqured=new ArrayList<String>();
	
	
	public void run() {
		char c='a';
		while(c!='q') {
			
			@SuppressWarnings("resource")
			Scanner reader = new Scanner(System.in);
		    c = reader.next(".").charAt(0); 
		    
		    System.out.println("press i to invade a country, r to retreat");
		    
		    if(c=='i') {		    	
		    	
		    	System.out.println("press p for Poland, r for the USSR");
		    	c = reader.next(".").charAt(0); 
		    	int n=invade("Poland");
		    	
		    	System.out.println("Your landa area increased by");
		    	System.out.println(n);
		    	
		    	
		    }
		    
		 
		    
		    
		    
		}
		
		
		
		
	}
	
	public int invade(String country) {	
		
		if(country=="Poland") {
			
			return 1000;
		}
				
		return 0;
	}
	
	
	public int retreat(String country) {
		
		return 0;
	}
	
	
	public int sucrate(String country, int distance) {
		
		return 0;		
	}

	@Override
	public int landArea() {
		
		return landArea;
	}

	@Override
	public int armySize() {
		
		return armySize;
	}
	
	

}
