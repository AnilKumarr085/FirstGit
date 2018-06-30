package testng;

import org.testng.annotations.Test;

public class GroupOne {
  @Test(groups="regression")
  public void fun1() {
	  System.out.println("Funtion runnning from GroupOne fun1 via GroupTestSuite");
  }
  
  @Test(groups="functional",priority=1)
  public void fun2() {
	  System.out.println("Funtion runnning from GroupOne fun2 via GroupTestSuite");
  }
  
  @Test(groups="regression")
  public void fun3() {
	  System.out.println("Funtion runnning from GroupOne fun3 via GroupTestSuite");
  }
}
