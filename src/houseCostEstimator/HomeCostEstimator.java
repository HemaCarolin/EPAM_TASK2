package houseCostEstimator;


public class HomeCostEstimator {
	/**
	* HouseConstructionCost method is to calculate the the cost of house construction based on various materials
	 * @param materialQuality , gives quality of material used i.e (standard, above standard, high standard)
	 * @param houseArea, gives us area of the house
	 * @param fullyAutomated , gives weather house to be constructed is fully automated or not
	 * @coder Hema
	 */
	public  long houseConstructionCost(String materialQuality, long houseArea, boolean fullyAutomated) {
		
		/**
		 * material quality is Standard
		 */
	
		if(materialQuality.equalsIgnoreCase("standard") && fullyAutomated==false) {
			
			return (1200*houseArea);
			
		}
		
		/**
		 * material quality is above standard 
		 */
		
		else if( materialQuality.equalsIgnoreCase("abovestandard") && fullyAutomated==false) {

			return (1500*houseArea);
			
		}
		
		/**
		 * fully automated home with high standard material   
		 */
		
		else if(fullyAutomated){
			
			return (2500*houseArea);
			
		}
		
		/**
		 * high standard material with not fully automation
		 */
		else {
			
			return (1800*houseArea);
		}
	}
}
