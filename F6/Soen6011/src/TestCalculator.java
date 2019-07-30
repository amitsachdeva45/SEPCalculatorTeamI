/*
 * author : Mahshad Saghaleini
 * Version : 1.0.0
 * Class Name : TestCalculator
 */
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
 /* 
  * in this class we have tested all the main 
  * operators for a calculator and there are a
  * few test cases for each of them 
  * */
public class TestCalculator {
	 
	  Exponential expo=new Exponential();
	  

	  @Test
	  // a function to test the behavior of the add function 
	  void testAddAssertEquals() {
	    assertEquals(expo.Addition(2, 3), 5);
	    assertEquals(expo.Addition(87345, 2131), 89476.0);
	  }
	// a function to test the behavior of the subtraction function
	  void tesSubAssertEquals() {
	    assertEquals(expo.subtraction(20, 3), 17);
	    assertEquals(expo.subtraction(982734, 1234),981500.0);
	  }
	// a function to test the behavior of the multiplication function
	  void testMultAssertEquals() {
	    assertEquals(expo.multiplication(4, 5),20);
	    assertEquals(expo.multiplication(-2345345, 345),-8.09144E8);
	  }
	// a function to test the behavior of the division function
	  void testDividAssertEquals() {
	    assertEquals(expo.division(80, 10),8);
	    assertEquals(expo.division(345345, 353),978.31445);
	  }
	  //*********
	  float AddResult=194;
	  float SubResult=-114;
	  float MultResult=201348;
	  float DividResult=5;
	  
	  void testAddAssertTrue() {
	    assertTrue(AddResult == expo.Addition(152, 42));
	  }
	  void tesSubAssertTrue() {
	    assertTrue(AddResult ==  expo.Addition(528, 662));
	    }
	  void testMultAssertTrue() {
	    assertTrue(AddResult == expo.Addition(846, 238));
	    }
	  void testDividAssertTrue() {
	    assertTrue(AddResult == expo.Addition(250, 50));
	    }

	}

