package interestCalculator;

public class InterestRateCalculator {
	/**
	 This class provides methods to calculate Simple and Compound Interest
	 * @coder Hema
	 * @param rate
     * @param principle
	 * @param time
	 */
	 // calculates Simple interest

public  double simpleInterest(double principle,double rate,int time) {
		
		return  (double)(principle*rate*time)/100;
		
	}
	
	
	 // calculates compound interest

	
	public double compoundInterest(double principle,double rate,int time) {
		
		return (double) ((principle*(Math.pow(1+(rate/100), time)))-principle);
		
	}
	
}
