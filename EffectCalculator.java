
public class EffectCalculator {
	
	
	public int retreatArmySize(Country invader, Country invaded) {
		int ratio=invader.armySize()/invaded.armySize();
		int loss=0;
		
		if(ratio<1) {
			loss=10;			
		}
		if(ratio>1) {
			loss=10;			
		}

		return loss;
	}

	public int retreatArea(Country invader, Country invaded) {
		int ratio=invader.armySize()/invaded.armySize();
		int loss=0;
		
		 /*implement calculations*/

		return loss;
	}
	
	
	public int invadeArmySize(Country invader, Country invaded) {
	
		int ratio=invader.armySize()/invaded.armySize();
		int loss=0;
		
		 /*implement calculations*/

		
		
		return loss;
	}
	
	
	public int invadeArea(Country invader, Country invaded) {
		
		int ratio=invader.armySize()/invaded.armySize();
		int loss=0;
		
	     /*implement calculations*/

		
		
		return loss;
	}
	
	

}
