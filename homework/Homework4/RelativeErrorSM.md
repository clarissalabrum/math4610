**Routine Name:** RelativeError  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** Takes two values and returns the relative error between the two

**Input:** Any two numbers.

**Output:** The relative error between those two numbers.

**Usage/Example:**

Two use this routine you will run it using

      javac RelativeError.java
      java RelativeError

When the code is run the program will ask for input values

      Calculating Relative Error
      Enter x: .000045
      Enter y: .0000327

After values are entered the program will output the relative error.

      Relative Error: 1.23E-5

**Implementation/Code:** The following is the code for RelativeError

      import java.util.Scanner;

      public class RelativeError {
          public static void main(String[] args) {
              Scanner input = new Scanner(System.in);

              System.out.println("Calculating Relative Error");

              System.out.print("Enter x: ");
              double x = input.nextDouble();
              System.out.print("Enter y: ");
              double y = input.nextDouble();

              System.out.println("Relative Error: " + Math.abs(x - y));
          }
      }

**Last Modified:** November/2020
