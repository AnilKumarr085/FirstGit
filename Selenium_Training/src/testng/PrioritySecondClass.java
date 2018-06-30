package testng;

import org.testng.annotations.Test;

public class PrioritySecondClass {
	@Test(priority=3)
	  public void fun1() {
	   System.out.println("Running form Second fun1 testNG via xml");
	  }
	  
	  @Test(priority=2)
	  public void fun2() {
	   System.out.println("Running form Second fun2 testNG via xml");
	  }
	  
	  
	  @Test(priority=1)
	  public void fun3() {
	   System.out.println("Running form Second fun3 testNG via xml");
	  }
}
