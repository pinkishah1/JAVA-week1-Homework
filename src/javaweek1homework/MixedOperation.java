package javaweek1homework;

/**
 * 9.Write a Java program to print the result of the following operation.
 * Test Date:
 * a. -5 + 8 * 6
 * b. (55+9)%9
 * c. 20 + -3 * 5 /8
 * Expected Output : 43
 * 1
 * 19
 * 13
 */
public class MixedOperation {
    public static void main (String [] args) {
    //Mixed operation declaration
         int a = -5 + 8 * 6;
         int b = ( 55 + 9) & 9;
         int c = 20 + -3 * 5 / 8;
         int d = 5 + 15 / 3 * 2 - 8 % 3 ;
         //output
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        }
}

