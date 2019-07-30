/*
 * author : Mahshad Saghaleini
 * Version : 1.0.0
 * Class Name : Exponential
 */

import java.util.*;

/*
 * @param : a and b are parameter
 *  The exponential Class starts with the scanner that reads 
 * inputs from the console
 */

public class Exponential {
	Scanner scanner = new Scanner (System.in);
 
	public float Addition(float a,float b) {
	    float c=0;
	    c=a+b;
	    System.out.println("Result :"+ a +"and" +b +"is"+ c );
	    return c;
	  }
	  public float subtraction(float a,float b) {
	    float c=0;
	    c=a-b;
	    System.out.println("Result"+ a +"and" +b +"is"+ c );
	    return c;
	  }
	  public float multiplication(float a,float b) {
	    float c=0;
	    c=a*b;
	    System.out.println("Result"+ a +"and" +b +"is"+ c );
	    return c;
	  }
	  public float division(float a,float b) {
	    if(b==0) {
	      System.out.println(a+"Could Not be Devided by Zero, Please Enter Non-Zero Number");
	      return 1;
	    }
	    float c=0;
	    c=a/b;
	    System.out.println("Result"+ a +"and" +b +"is"+ c );
	    return c;
	  }
	  /*
	   *  In the main function of the source code, different 
	   * functions have been called four computing Addition or 
	   * subtraction or multiplication or division or computing 
	   * the result of exponential function of numbers
	   * base on the user preference and inputs
	   */

	 public static void main(String[] args) {
		float n1,n2;
		System.out.println("This Is a Calculator For 4 Main Operators and EXPONENTIAL function");
		System.out.println("Please Follow the below structure to do the calculation.");
		System.out.println("Enter the related value for each Operator");
		System.out.println("For Addition:1    ,Subtraction:2    ,Multiplication:3     ,Division:4    ,Exponential 5");
		Exponential ex =new Exponential();
		Scanner scanner1 = new Scanner (System.in);
		int UserValueInput  = (int) scanner1.nextFloat();
		
		switch(UserValueInput) {
		case 1:
		  System.out.println("Please Enter two Real Number");
		  n1=scanner1.nextFloat();
		  n2=scanner1.nextFloat();
		  ex.Addition(n1, n2);
		// if the user input a unreal number the program will throw an exception
		  try{   
			  n1=scanner1.nextFloat();
			  n2=scanner1.nextFloat();
			  ex.Addition(n1, n2);
			} 
		  // a clear message for s an error message for user input
		  catch (Exception e) { 
			  System.err.println("Please Enter a Real Number");
			}
		  break;
		case 2:  
		  System.out.println("Please Enter two Real Number");
		  n1=scanner1.nextFloat();
		  n2=scanner1.nextFloat();
		  ex.subtraction(n1, n2);
		  try{
			  n1=scanner1.nextFloat();
			  n2=scanner1.nextFloat();
			  ex.subtraction(n1,n2);
			} catch (Exception e) {
			  System.err.println("Please Enter a Real Number");
			}
		  break;
		case 3:  
		  System.out.println("Please Enter two Real Number");
		  n1=scanner1.nextFloat();
		  n2=scanner1.nextFloat();
		  ex.subtraction(n1, n2);
		  try {
			  n1=scanner1.nextFloat();
			  n2=scanner1.nextFloat();
			  ex.subtraction(n1,n2);
			  } catch (Exception e) {
			    System.err.println("Please Enter a Real Number");
			  }
		  break;
		case 4:  
		  System.out.println("Please Enter two Real Number");
		  n1=scanner1.nextFloat();
		  n2=scanner1.nextFloat();
		  ex.division(n1,n2);
		  //an exception for invalid input.
		  try{
			  n1=scanner1.nextFloat();
			  n2=scanner1.nextFloat();
			  ex.division(n1,n2);
			  } catch (Exception e) {
			    System.err.println("Please Enter a Real Number");
			  }
		  break;
		case 5:	
		  System.out.println("for compute value of this function please choose the way of calculation.");
		  System.out.println("for approximate answer please enter 1 and for exact answer enter 2");
		  int choise =(int) scanner1.nextDouble();
		  ex.ExponWays(choise);
		  break;
		}	   
	}
	public void ExponWays(int choise) {
		
		int expoWay=choise;
		if (expoWay==1) {
			System.out.println("Please Enter a , b , x Values ");
		    float na=scanner.nextFloat();
			float nb=scanner.nextFloat();
			float nx=scanner.nextFloat();
			// call exponential function based on choise.
			
			float resultPower = exponentPower(nb,nx);
			System.out.println(resultPower * na);
		}
		else if (choise==2) {
			System.out.println("Please Enter x Values ");
		 double x;
		// If the user input invalid or unreal number the program will throw an exception
		 try{ 
		    x =scanner.nextDouble();
		     System.out.println(exponential(x));
		    }
		catch(Exception e){
		System.err.print("you have to enter a double number");
		    }
		} 
	}
	// @param : b , x  are parameter
	public float Power1(float b, float x) {
		float y=1;	
		for(int i=1;i<=x;i++) {
			y=y*b ;
		}
		return y;
	}

	/*
	 * @param : b , x  are parameter
	 *  a function to compute the power of number
	 * by noticing different fact about exponents
	 * which is x as our exponent value can be odd
	 * or even we implement a recursive function to compute the result  */
	
	public  float exponentPower(float b , float x) {
		float z=1;
		float w=1;
		float q=1;
		
	 if (x == 0) {
			 return 1;
		 }
		 else if (x % 2 == 0) {
			  z=Power1(b, 2);
			  q=Power1(z, x/2);
		 }
		 else if (x % 2 == 1) {
			
			  z=Power1(b, 2);
			  w=Power1(z, (x-1)/2);
			  q=w*b;
			 
					 }
		return q;	
	}
	
	/* @param :  , w and q are parameter
	 * in the few lines below all the variable that been used 
	 * in exponential function are initialized */
    private static final double
            TWO1 = 0x10000000, // Long bits 0x41b0000000000000L.
            TWO2 = 0x40000000000000L; // Long bits 0x4350000000000000L.

    private static final double
             limHigh = 709.782712893384,   // Long bits 0x40862e42fefa39efL.
            limLow = -745.1332191019411,   // Long bits 0xc0874910d52d3051L.
             Ln2 = 0.6931471805599453,     // Long bits 0x3fe62e42fefa39efL.
            Ln2High = 0.6931471803691238,  // Long bits 0x3fe62e42fee00000L.
            Ln2Low = 1.9082149292705877e-10,// Long bits 0x3dea39ef35793c76L. 
            invLn2 = 1.4426950408889634;   // Long bits 0x3ff71547652b82feL.

    private static final double
            P1 = 0.16666666666666602,    // Long bits 0x3fc555555555553eL.
            P2 = -2.7777777777015593e-3, // Long bits 0xbf66c16c16bebd93L.
            P3 = 6.613756321437934e-5,    // Long bits 0x3f11566aaf25de2cL.
            P4 = -1.6533902205465252e-6,  // Long bits 0xbebbbd41c5d26bf1L.
            P5 = 4.1381367970572385e-8;   // Long bits 0x3e66376972bea4d0L.
    
    
  /* 
   * @param : x is a parameter
   * exponential function to compute the exact value for answer
   * depends on the value of x as an input the function compute the result.
   * in the exponential function two other function have been called
   * abs function and scale function and both function also has been implemented below
   */
   
    public static double exponential(double x) {
        if (x != x)
            return x;
        if (x > limHigh)
            return Double.POSITIVE_INFINITY;
        if (x < limLow)
            return 0;

        double hi;
        double lo;
        int k;
        double t = absFunction(x);
        if (t > 0.5 * Ln2) {
            if (t < 1.5 * Ln2) {
                hi = t - Ln2High;
                lo = Ln2Low;
                k = 1;
            } else {
                k = (int) (invLn2 * t + 0.5);
                hi = t - k * Ln2High;
                lo = k * Ln2Low;
            }
            if (x < 0) {
                hi = -hi;
                lo = -lo;
                k = -k;
            }
            x = hi - lo;
        } else if (t < 1 / TWO1)
            return 1;
        else
            lo = hi = k = 0;

        
        t = x * x;
        double c = x - t * (P1 + t * (P2 + t * (P3 + t * (P4 + t * P5))));
        if (k == 0)
            return 1 - (x * c / (c - 2) - x);
        double y = 1 - (lo - x * c / (2 - c) - hi);
        return scale(y, k);
    }
    
    /*
     *  @param : d is a parameter
     * the abs function which has been called in the exponential function
     */
    public static double absFunction(double d) {
        return (d <= 0) ? 0 - d : d;
    } 
    
   /* @param : n , x  are parameter
    * the scale function which has been called in exponential function
    *  */
    public static double scale(double x, int n) {

        if (x == 0 || x == Double.NEGATIVE_INFINITY
                || !(x < Double.POSITIVE_INFINITY) || n == 0)
            return x;
        long bits = Double.doubleToLongBits(x);
        int exp = (int) (bits >> 52) & 0x7ff;
        if (exp == 0) 
        {
            x *= TWO2;
            exp = ((int) (Double.doubleToLongBits(x) >> 52) & 0x7ff) - 54;
        }
        exp += n;
        if (exp > 0x7fe) 
            return Double.POSITIVE_INFINITY * x;
        if (exp > 0) 
            return Double.longBitsToDouble((bits & 0x800fffffffffffffL)
                    | ((long) exp << 52));
        if (exp <= -54)
            return 0 * x; 
        exp += 54; 
        x = Double.longBitsToDouble((bits & 0x800fffffffffffffL)
                | ((long) exp << 52));
        return x * (1 / TWO2);
        
    }       
}
