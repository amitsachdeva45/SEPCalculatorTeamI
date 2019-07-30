import org.junit.Assert;
import org.junit.Test;

public class LogarithmCalculationTest {
  LogarithmCalculation log  =  new LogarithmCalculation();
  static final float INVALID_UNDEFINED  =  -9997.0f;
  static final float INVALID_BASE = -9998.0f;
  static final float INVALID_ARG = -9999.0f;
  static final float INVALID_FIRST_INPUT = -7776.0f;
  static final float INVALID_SECOND_INPUT = -7777.0f;
  static final float BASES_NOT_EQUAL = -7778.0f;
  static final String MESSAGE = "Please enter valid numbers.";


  @Test
  public void testReq1() {
    double actual = Math.log(5) / Math.log(4);
    double expected = log.logCalculation(4, 5);
    Assert.assertEquals(expected,actual,0.5f);
  }

  @Test
  public void testReq2() {
    double actual = log.logCalculation(5, 0);
    double expected = INVALID_UNDEFINED;
    Assert.assertEquals(expected,actual,0.0f);
  }

  @Test
  public void testReq3() {
    double actual = log.logCalculation(2, 1);
    double expected = 0.0f;
    Assert.assertEquals(expected,actual,0.0f);
  }

  @Test
  public void testLogCalculation() {
    double actual = log.logCalculation(2, 3);
    double expected = Math.log(3) / Math.log(2);
    Assert.assertEquals(expected,actual,0.5f);

    actual = log.logCalculation(0.5f, 2);
    expected = Math.log(0.5) / Math.log(2);
    Assert.assertEquals(expected, actual,0.5f);

    actual = log.logCalculation(2,0.5f);
    expected = Math.log(2) / Math.log(0.5);
    Assert.assertEquals(expected, actual,0.5f);

    actual = log.logCalculation(1, 1);
    expected = 1.0;
    Assert.assertEquals(expected, actual,0.5f);

    actual = log.logCalculation(1, 4);
    expected = INVALID_UNDEFINED;
    Assert.assertEquals(expected, actual,0.5f);

    actual = log.logCalculation(1, 0.5f);
    expected = INVALID_UNDEFINED;
    Assert.assertEquals(expected, actual,0.5f);
  }

  @Test
  public void testBaseReq() {
    double actual = log.logCalculation(0,1);
    double expected = INVALID_BASE;
    Assert.assertEquals(expected,actual,0.0f);
  }
  
  @Test
  public void testArgumentReq() {
    double actual = log.logCalculation(1,0);
    double expected = INVALID_UNDEFINED;
    Assert.assertEquals(expected,actual,0.0f);
  }

  // REQUIREMENT 4: LOGARITHM ADDITION
  @Test
  public void testForAddition() {
    //Testing valid addition
    double actual = log.logAddition(2, 2, 2, 4);
    double expected = Math.log(8) / Math.log(2);
    Assert.assertEquals(expected,actual,0.5f);

    //Test for invalid first base
    actual = log.logAddition(0,1,2,2);
    expected = INVALID_FIRST_INPUT;
    Assert.assertEquals(expected,actual,0.0f);

    //Test for invalid first argument
    actual = log.logAddition(1,0,2,2);
    expected = INVALID_FIRST_INPUT;
    Assert.assertEquals(expected,actual,0.0f);

    //Test for invalid second base
    actual = log.logAddition(5,1,0,2);
    expected = INVALID_SECOND_INPUT;
    Assert.assertEquals(expected,actual,0.0f);

    //Test for invalid second argument
    actual = log.logAddition(5,1,2,0);
    expected = INVALID_SECOND_INPUT;
    Assert.assertEquals(expected,actual,0.0f);

    //Test for bases not equal
    actual = log.logAddition(5,1,2,6);
    expected = BASES_NOT_EQUAL;
    Assert.assertEquals(expected,actual,0.0f);

  }

  // REQUIREMENT 5: LOGARITHM SUBTRACTION
  @Test
  public void testForSubtraction() {
    //Testing valid subtraction
    double actual = log.logSubtraction(2, 4, 2, 2);
    double expected = Math.log(2);
    Assert.assertEquals(expected,actual,0.5f);

    //Test for invalid first base
    actual = log.logSubtraction(0,1,2,2);
    expected = INVALID_FIRST_INPUT;
    Assert.assertEquals(expected,actual,0.0f);

    //Test for invalid first argument
    actual = log.logSubtraction(1,0,2,2);
    expected = INVALID_FIRST_INPUT;
    Assert.assertEquals(expected,actual,0.0f);

    //Test for invalid second base
    actual = log.logSubtraction(5,1,0,2);
    expected = INVALID_SECOND_INPUT;
    Assert.assertEquals(expected,actual,0.0f);

    //Test for invalid second argument
    actual = log.logSubtraction(5,1,2,0);
    expected = INVALID_SECOND_INPUT;
    Assert.assertEquals(expected,actual,0.0f);

    //Test for bases not equal
    actual = log.logSubtraction(5,1,2,6);
    expected = BASES_NOT_EQUAL;
    Assert.assertEquals(expected,actual,0.0f);
  }
  
//REQUIREMENT 8: LOGARITHM MULTIPLICATION
  @Test
  public void testForMultiplication() {
    //Test for valid division
    double actual = log.logMultiplication(2, 4, 2, 3);
    double expected = log.logCalculation(2, 4)*log.logCalculation(2, 3);
    Assert.assertEquals(expected,actual,0.5f);

    //Test for invalid first base
    actual = log.logMultiplication(0,1,2,2);
    expected = INVALID_FIRST_INPUT;
    Assert.assertEquals(expected,actual,0.0f);

    //Test for invalid first argument
    actual = log.logMultiplication(1,0,2,2);
    expected = INVALID_FIRST_INPUT;
    Assert.assertEquals(expected,actual,0.0f);

    //Test for invalid second base
    actual = log.logMultiplication(5,1,0,2);
    expected = INVALID_SECOND_INPUT;
    Assert.assertEquals(expected,actual,0.0f);

    //Test for invalid second argument
    actual = log.logMultiplication(5,1,2,0);
    expected = INVALID_SECOND_INPUT;
    Assert.assertEquals(expected,actual,0.0f);
  }

  //REQUIREMENT 9: LOGARITHM DIVISION
  @Test
  public void testForDivison() {
    //Test for valid division
    double actual = log.logDivision(2, 4, 2, 3);
    double expected = log.logCalculation(2, 4)/log.logCalculation(2, 3);
    Assert.assertEquals(expected,actual,0.5f);

    //Test for invalid first base
    actual = log.logDivision(0,1,2,2);
    expected = INVALID_FIRST_INPUT;
    Assert.assertEquals(expected,actual,0.0f);

    //Test for invalid first argument
    actual = log.logDivision(1,0,2,2);
    expected = INVALID_FIRST_INPUT;
    Assert.assertEquals(expected,actual,0.0f);

    //Test for invalid second base
    actual = log.logDivision(5,1,0,2);
    expected = INVALID_SECOND_INPUT;
    Assert.assertEquals(expected,actual,0.0f);

    //Test for invalid second argument
    actual = log.logDivision(5,1,2,0);
    expected = INVALID_SECOND_INPUT;
    Assert.assertEquals(expected,actual,0.0f);
    
  //Test for undefined
    actual = log.logDivision(5,2,2,1);
    expected = INVALID_UNDEFINED;
    Assert.assertEquals(expected,actual,0.0f);
  }


}
