import java.util.Scanner;

public class LogarithmCalculation {

  static final int INVALID_ARGUMENT = -9999;
  static final int INVALID_BASE = -9998;
  static final int INVALID_UNDEFINED = -9997;
  static final float INVALID_SECOND_LOG=-7777.0f;
  static final float INVALID_FIRST_LOG=-7776.0f;
  static final float BASE_NOT_SAME=-7778.0f;

  /**
   * Main method of the program.
   * 
   * @param args main program argument if any
   */
  public static void main(String args[]) {
    int option = 0;
    Boolean loop = true;
    boolean addLoop = true;
    try {
      Scanner sc = new Scanner(System.in);
      do {
        System.out.println("\n=== MENU FOR LOGARITHM CALCULATIONS ===\n"
            + "1.Log calculation"
            + "\n2.Addition"
            + "\n3.Subtraction"
            + "\n4.Multiplication"
            + "\n5.Division"
            + "\n6.Exit");
        option = sc.nextInt();

        switch (option) {
        case 1:
          Scanner sc1 = new Scanner(System.in);
          addLoop = true;
          do {
            System.out.println("Enter base: ");
            float base = sc1.nextFloat();
            System.out.println("Enter argument: ");
            float argument = sc1.nextFloat();
            float answer = logCalculation(base, argument);
            if (answer != INVALID_ARGUMENT 
                && answer != INVALID_BASE 
                && answer != INVALID_UNDEFINED) {
              System.out.println("Result is: " + answer);
              addLoop = false;
            } 
            else if(answer == INVALID_UNDEFINED)
            {
              System.out.println("Result: Undefined or infinity.");
              addLoop=false;
            }
            else {
              System.out.println("Please try again. Acceptable values:" + ""
                  + "\nbases>=1, arguments>=1\n");
            }
          } while (addLoop);
          break;

        case 2:
          Scanner add = new Scanner(System.in);
          addLoop = true;
          do {
            System.out.println("Enter first base: ");
            float base1 = add.nextFloat();
            System.out.println("Enter first argument: ");
            float argument1 = add.nextFloat();
            System.out.println("Enter second base: ");
            float base2 = add.nextFloat();
            System.out.println("Enter second argument: ");
            float argument2 = add.nextFloat();
            float answer=0.0f;
            if (base1 != base2) {
              System.out.println("For log addition the bases need to be same. Please try again...\n");
            }
            else {
              answer = logAddition(base1, argument1, base2, argument2);
              if (answer != INVALID_SECOND_LOG && answer != BASE_NOT_SAME) {
                System.out.println("Result of the addition is: " + answer);
                addLoop = false;
              } else {
                System.out.println("Please try again. Acceptable values:" 
                    + "\nbases>=1, arguments>=1\n");
              }
            }
          } while (addLoop);
          break;

        case 3:
          Scanner subtract = new Scanner(System.in);
          addLoop = true;
          do {
            System.out.println("Enter first base: ");
            float base1 = subtract.nextFloat();
            System.out.println("Enter first argument: ");
            float argument1 = subtract.nextFloat();
            System.out.println("Enter second base: ");
            float base2 = subtract.nextFloat();
            System.out.println("Enter second argument: ");
            float argument2 = subtract.nextFloat();
            float answer=0.0f;
            if (base1 != base2) {
              System.out.println("For log subtraction the bases need to be same. Please try again...\n");
            }
            else {
              answer = logSubtraction(base1, argument1, base2, argument2);
              if (answer != INVALID_SECOND_LOG && answer != BASE_NOT_SAME) {
                System.out.println("Result of the subtraction is: " + answer);
                addLoop = false;
              } else {
                System.out.println("Please try again. Acceptable values:" 
                    + "\nbases>=1, arguments>=1\n");
              }
            }
          } while (addLoop);
          break;
        case 4:
          Scanner multiply = new Scanner(System.in);
          addLoop = true;
          do {
            System.out.println("Enter base: ");
            float base1 = multiply.nextFloat();
            System.out.println("Enter first argument: ");
            float argument1 = multiply.nextFloat();
            System.out.println("Enter second base: ");
            float base2 = multiply.nextFloat();
            System.out.println("Enter second argument: ");
            float argument2 = multiply.nextFloat();
            float answer=0.0f;
            answer = logMultiplication(base1, argument1, base2, argument2);
            if (answer != INVALID_SECOND_LOG && answer != BASE_NOT_SAME) {
              System.out.println("Result of the multiplication is: " + answer);
              addLoop = false;
            } else if(answer == -9997.0)
            {
              System.out.println("Result: Undefined.");
            }
            else {
              System.out.println("Please try again. Acceptable values:" 
                  + "\nbases>=1, arguments>=1\n");
            }

          } while (addLoop);
          break;
        case 5:
          Scanner division = new Scanner(System.in);
          addLoop = true;
          do {
            System.out.println("Enter first base: ");
            float base1 = division.nextFloat();
            System.out.println("Enter first argument: ");
            float argument1 = division.nextFloat();
            System.out.println("Enter second base: ");
            float base2 = division.nextFloat();
            System.out.println("Enter second argument: ");
            float argument2 = division.nextFloat();
            float answer=0.0f;
            answer = logDivision(base1, argument1, base2, argument2);
            if(answer == -9997.0f)
            {
              System.out.println("Result: Undefined.");
            } else if (answer != INVALID_SECOND_LOG && answer != BASE_NOT_SAME && answer != INVALID_FIRST_LOG) {
              System.out.println("Result of the division is: " + answer);
              addLoop = false;
            }
            else {
              System.out.println("Please try again. Acceptable values:" 
                  + "\nbases>=1, arguments>=1\n");
            }

          } while (addLoop);
          break;
        case 6:
          loop = false;
          break;
        default:
          System.out.println("Please enter a valid input number between 1 to 5.");
        }

      } while (loop);
    } catch (Exception e) {
      System.out.println("An error was encountered. Please try again");
    }
  }

  /**
   * Method to calculate the log.
   * @param base base of the log
   * @param argument argument of the log
   * @return the result of the log calculation.
   */
  public static float logCalculation(float base, float argument) {
    float sign = 1;
    float number = 0;
    float count = 0;

    // Check for values of base and argument.
    if(base>0.0 && argument<=0.0)
    {
      return INVALID_UNDEFINED;
    }

    if (argument <= 1.0 || base <= 1.0) {
      if (base <= 0.0) {
        return INVALID_BASE;
      }
      if (argument <= 0.0) {
        return INVALID_UNDEFINED;
      }

      if (base < 1.0) {
        sign *= -1.0;
        base = 1 / base;
      }
      if (argument < 1.0) {
        sign *= -1.0;
        argument = 1 / argument;
      }
      if (argument == 1) {
        if (base == 1) {
          return 1;
        }
        if (base != 1) {
          return 0;
        }
      }
      if (base == 1) {
        if (argument > 0) {
          return INVALID_UNDEFINED;
        }
      }

    }

    // If argument is 1 and base is 1 then answer is 1; else answer is 0.
    number = argument;
    while (number >= base) {
      count++;
      number = number / base;
    }
    if (number == 1) {
      return (sign * count);
    }

    float answer = (count + (1 / logCalculation(number, base)));

    return sign * answer;
  }

  /**
   * Method to calculate the addition of two logarithms.
   * 
   * @param base1 base of the first log
   * @param argument1 argument of the first log
   * @param base2 base of the second log
   * @param argument2 argument of the second log
   * @return The addition of the log
   */
  public static float logAddition(float base1, float argument1, float base2, float argument2) {

    float firstLogValue = logCalculation(base1, argument1);

    if (firstLogValue != INVALID_ARGUMENT 
        && firstLogValue != INVALID_BASE 
        && firstLogValue != INVALID_UNDEFINED) {
      float secondLogValue = logCalculation(base2, argument2);
      if (secondLogValue == INVALID_ARGUMENT || secondLogValue == INVALID_BASE
          || secondLogValue == INVALID_UNDEFINED) {
        return INVALID_SECOND_LOG;
      }
      else if (base1 != base2) {
        System.out.println("For log addition the bases need to be same. Please try again...\n");
        return BASE_NOT_SAME;
      }
    } else {
      return INVALID_FIRST_LOG;
    }

    return logCalculation(base1, argument1 * argument2);
  }

  /**
   * Method to calculate the subtraction of two logarithms.
   * 
   * @param base1 base of first log
   * @param argument1 argument of first log
   * @param base2 base of second log
   * @param argument2 argument of second log
   * @return The subtraction of the logs
   */
  public static float logSubtraction(float base1, float argument1, float base2, float argument2) {

    float firstLogValue = logCalculation(base1, argument1);

    if (firstLogValue != INVALID_ARGUMENT 
        && firstLogValue != INVALID_BASE 
        && firstLogValue != INVALID_UNDEFINED) {
      float secondLogValue = logCalculation(base2, argument2);
      if (secondLogValue == INVALID_ARGUMENT || secondLogValue == INVALID_BASE
          || secondLogValue == INVALID_UNDEFINED) {
        return INVALID_SECOND_LOG;
      }
      else if (base1 != base2) {
        System.out.println("For log subtraction the bases need to be same. Please try again...\n");
        return BASE_NOT_SAME;
      }
    } else {
      return INVALID_FIRST_LOG;
    }
    return logCalculation(base1, argument1 / argument2);
  }

  /**
   * Method to calculate the multiplication of two logarithms.
   * 
   * @param base1 base of first log
   * @param argument1 argument of first log
   * @param base2 base of second log
   * @param argument2 argument of second log
   * @return The multiplication of the logs
   */
  public static float logMultiplication(float base1, float argument1, float base2, float argument2) {

    float firstLogValue = logCalculation(base1, argument1);

    if (firstLogValue != INVALID_ARGUMENT 
        && firstLogValue != INVALID_BASE 
        && firstLogValue != INVALID_UNDEFINED) {
      float secondLogValue = logCalculation(base2, argument2);
      if (secondLogValue == INVALID_ARGUMENT || secondLogValue == INVALID_BASE
          || secondLogValue == INVALID_UNDEFINED) {
        return INVALID_SECOND_LOG;
      }
    } else {
      return INVALID_FIRST_LOG;
    }
    return logCalculation(base1, argument1)*logCalculation(base2,argument2);
  }

 /**
  * Method to calculate the division of two logarithms.
   * 
   * @param base1 base of first log
   * @param argument1 argument of first log
   * @param base2 base of second log
   * @param argument2 argument of second log
   * @return The division of the logs
   */
  public static float logDivision(float base1, float argument1, float base2, float argument2) {

    float firstLogValue = logCalculation(base1, argument1);

    if (firstLogValue != INVALID_ARGUMENT 
        && firstLogValue != INVALID_BASE 
        && firstLogValue != INVALID_UNDEFINED) {
      float secondLogValue = logCalculation(base2, argument2);
      if (secondLogValue == INVALID_ARGUMENT || secondLogValue == INVALID_BASE
          || secondLogValue == INVALID_UNDEFINED) {
        return INVALID_SECOND_LOG;
      }
    } else {
      return INVALID_FIRST_LOG;
    }
    if(logCalculation(base2,argument2)==0.0)
      return INVALID_UNDEFINED;
    return logCalculation(base1,argument1)/logCalculation(base2,argument2);
  }

}
