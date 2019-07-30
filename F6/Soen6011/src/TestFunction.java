/*
 * author : Mahshad Saghaleini
 * Version : 1.0.0
 * Class Name : TestFunction
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
 /*
  * all the function that have been used in 
  * the main class are tested hear with plenty
  * of real test cases to check the behavior of
  * the function 
  * */
class TestFunction {
Exponential ex =new Exponential();

	@Test
	void testAbs() {
		// a few test cases to test the behavior of the absFunction
		assertEquals(Exponential.absFunction(-6),6);
		assertEquals(Exponential.absFunction(-3.24),3.24);
		assertEquals(Exponential.absFunction(-12),12);
	}
	void testExponential() {
		// a few test cases to test the behavior of the exponential Function
		assertEquals(Exponential.exponential(7.2),1339.430764394418);
		assertEquals(Exponential.exponential(2),7.38905609893065);
		assertEquals(Exponential.exponential(-23),1.026187963170189E-10);
		assertEquals(Exponential.exponential(-1.43),0.23930892224375455);
		assertEquals(Exponential.exponential(-34.467),1.0744150725235938E-15);
	}
	void testscale() {
		// a few test cases to test the behavior of the scale Function
	assertEquals(Exponential.scale(1.1594778054888797, 7), 148.4131591025766);
	assertEquals(Exponential.scale(-2.36, 145),-1.0525951733706454E44);
	assertEquals(Exponential.scale(-0.34,1),-0.68);
	assertEquals(Exponential.scale(2.45,0),2.45);
	}
	void testPower1() {
		// a few test cases to test the behavior of the Power1 Function
		assertEquals(ex.Power1(2,6), 64.0);
		assertEquals(ex.Power1(14,8), 1.47578906E9);
		assertEquals(ex.Power1(-2,24), 1.6777216E7);
	}
	void testexponentPower() {
		// a few test cases to test the behavior of the exponentPower Function
		assertEquals(ex.exponentPower(-2,24), 1.6777216E7);
		assertEquals(ex.exponentPower(12,4), 20736.0);
		assertEquals(ex.exponentPower(-2,-3), 1.0);
	}
}
