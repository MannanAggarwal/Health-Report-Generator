/**
 * This is test 2 of MyHealthData class and will test getBMI() method.
 * This test would fail because using the 70 inches height
 * and 197 pounds weight the BMI is 28.2634693877551 but I am using 24.5545 as expected output
 * by getBMI method.
 * 
 * <pre>Class: CST8284_313_310</pre>
 * <pre>Professor: Fedor Ilitchev</pre>
 * <pre>Demo: 9 November, 2022</pre>
 * 
 * @author Mannan Aggarwal
 * @version 1.0
 * @since 11.0.15
 */

import org.junit.Assert;
import org.junit.Test;

public class MyHealthDataTest2 {
	
	private static final double EPSILON = 1E-12;

	//This test would Fail.
	
	@Test public void myhealthdata()
	   {
		MyHealthData data = new MyHealthData();
	      data.setHeight(70);
	      data.setWeight(197);
	      double expected = 24.5545;
	      Assert.assertEquals(expected, data.getBMI(), EPSILON);
	    }

}