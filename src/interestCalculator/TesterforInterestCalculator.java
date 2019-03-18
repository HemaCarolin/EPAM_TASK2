package interestCalculator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesterforInterestCalculator {
	InterestRateCalculator intobj;
	@Before
	public void setUp() throws Exception {
		intobj= new InterestRateCalculator();
		intobj.simpleInterest(1000, 3, 4);
		intobj.compoundInterest(4000, 5, 6);
		
	}

	
	@Test
	public void test() {
		Assert.assertEquals(120, intobj.simpleInterest(1000, 3, 4),1);
		Assert.assertEquals(579.462498636394, intobj.compoundInterest(500,8,10),1);
	}

}
