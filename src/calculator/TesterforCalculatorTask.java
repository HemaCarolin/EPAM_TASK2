package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesterforCalculatorTask {
	CalculatorTask calobj;
	@Before
	public void setUp() throws Exception {
	   calobj=new CalculatorTask();
		calobj.addition(2, 3);
		calobj.product(3, 4);
		calobj.divison(10, 5);
	
	
	}

	@Test
	public void test() {
		Assert.assertEquals(5, calobj.addition(2,3));
		Assert.assertEquals(12, calobj.product(3,4));
		Assert.assertEquals(2, calobj.divison(10,5));
	}

}
