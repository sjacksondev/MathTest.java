/* Page 226 Chapter Programming Exercise 7
   Filename: MathTest.java
   Author: Sabrina
   Date: 8/1/19 

An application that uses Math class to determine the answers. */

public class MathTest
{
	public static void main(String[] args) 
	{
		System.out.println("The square root of 37 is " + Math.sqrt(30) + "."); // Answer 7a
		System.out.println("The sine of 300 is " + Math.sin(300) + " and the cosine of 300 is " + Math.cos(300) + "."); // Answer 7b
		System.out.println("The floor value is " + Math.floor(22.8) + "," + " the ceiling value is " + Math.ceil(22.8) + " and the round value is " + Math.round(22.8) + " for the number 22.8" + "."); // Answer 7c
		System.out.println("The larger of the character D and the integer 71 " + "is " + (char) Math.max('D', 71) + "." + " The smaller of the character D and the integer 71 " + " is " + (char) Math.min('D', 71) + "."); // Answer 7d
		System.out.println("A random number between 0 and 20 is " + Math.round(Math.random() * 10) + "."); // Answer 7e
	}
}