package junitexample;

import org.testng.Assert;

public class DemoAssert {
	public static void main(String arg[]) {
		 int age = 14;
	      assert age <= 18 : "Cannot Vote";
	      System.out.println("The voter's age is " + age);
	}

}
