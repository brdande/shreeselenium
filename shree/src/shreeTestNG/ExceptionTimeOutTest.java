package shreeTestNG;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
 
	/*@Test(invocationTimeOut = 2)
  public void infiniteLoopTest() {
	  int i =1;
	  while(i==1) {
		  System.out.println("i = "+i);
	  }
  }*/
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1() {
		String s = "100A";
		Integer.parseInt(s);
	}
}
