package shreeTestNG;

import org.testng.annotations.Test;

public class TestInvocationCount {
	
  @Test(invocationCount = 10)
  public void sum() {
	  int a =10,b=20;
	  int c = a + b;
	  System.out.println("sum is =="+c);
  }
}
