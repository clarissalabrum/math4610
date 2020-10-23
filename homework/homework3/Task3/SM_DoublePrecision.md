**Routine Name:** DoublePrecision  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** This routine will approximate the double precision of the computer that it is ran on. It starts at the value 1 
and will half that value until the computer recognizes the value as zero.

**Input:** No input

**Output:** The routine will output the value that the computer will approximate to 0.

**Usage/Example:**

The routine starts with the double value of 1 and halves the value until it is truncated to zero. To compile and run the code you will use
the following in the terminal.

      javac DoublePrecision.java
      java DoublePrecision

Output from the lines above on my device is:

      2.220446049250313E-16

This is the value that was considered to be approximated zero in double precison.

**Implementation/Code:** The following is the code for DoublePrecision

      public class DoublePrecision {
          public static void main(String[] args) {
              double num = 1.0;
              while (1 < 1 + num){
                  num = num * 0.5;
              }
              System.out.println(num * 2);
          }
      }

**Last Modified:** October/2020
