**Routine Name:** AbsoluteError  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Takes two values and returns the absolute error between the two

**Input:** Any two numbers.

**Output:** The absolute error between those two numbers.

**Usage/Example:**

Two use this routine you will run it using

      javac AbsoluteError.java
      java AbsoluteError

When the code is run the program will ask for input values

      Calculating Absolute Error
      Enter x: 200
      Enter y: 503

After values are entered the program will output the absolute error.

      Absolute Error: 1.515

**Implementation/Code:** The following is the code for AbsoluteError

      import java.util.Scanner;

      public class AbsoluteError {
          public static void main(String[] args) {
              Scanner input = new Scanner(System.in);

              System.out.println("Calculating Absolute Error");

              System.out.print("Enter x: ");
              double x = input.nextDouble();
              System.out.print("Enter y: ");
              double y = input.nextDouble();

              System.out.println("Absolute Error: " + Math.abs(x - y)/Math.abs(x));
          }
      }

**Last Modified:** November/2020
