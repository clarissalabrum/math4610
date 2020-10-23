**Routine Name:** SinglePrecision  

**Author:** Clarissa Labrum

**Language:** Java

**Description/Purpose:** This routine will approximate the single precision of the computer that it is ran on. It starts at the value 1 
and will half that value until the computer recognizes the value as zero.

**Input:** No input

**Output:** The routine will output the value that the computer will approximate to 0.

**Usage/Example:**

The routine starts with the float value of one and halves the value until it is truncated to zero. To compile and run the code you will use
the following in the terminal.

      javac SinglePrecision.java
      java SinglePrecision

Output from the lines above on my device is:

      1.1920929E-7

This is the value that was considered to be approximated zero in single precison.

**Implementation/Code:** The following is the code for SinglePrecison

      public class SinglePrecision {
          public static void main(String[] args) {
              float num = 1.0f;
              while (1 < 1 + num){
                  num = num * 0.5f;
              }
              System.out.println(num * 2);
          }
      }

**Last Modified:** October/2020
