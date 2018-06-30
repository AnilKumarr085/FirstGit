package testng;

import org.testng.annotations.Test;

public class PriorityFirstClass {
	@Test(priority=5)
	  public void fun1() {
	   System.out.println("Running form first fun1 testNG via xml");
	  }
	  
	  @Test(priority=6)
	  public void fun2() {
	   System.out.println("Running form first fun2 testNG via xml");
	  }
	  
	  
	  @Test(priority=1)
	  public void fun3() {
	   System.out.println("Running form first fun3 testNG via xml");
	  }
}
