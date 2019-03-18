package houseCostEstimator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesterforEstimation {
	HomeCostEstimator costobj;
	
	@Before
	public void setUp() throws Exception {
		costobj = new HomeCostEstimator();
		costobj.houseConstructionCost("standard", 1000, false);
	}

	
	@Test
	public void test() {
		Assert.assertEquals(1200000, costobj.houseConstructionCost("standard", 1000, false));
		
	}

}
