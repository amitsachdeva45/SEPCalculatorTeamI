/*
 * author : Mahshad Saghaleini
 * Version : 1.0.0
 * Class Name : TestSuitClass
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
	
	@RunWith(Suite.class)
	@Suite.SuiteClasses({TestCalculator.class,TestFunction.class})
	public class TestSuitClass {
	  
	}
