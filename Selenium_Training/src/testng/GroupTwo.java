package testng;

import org.testng.annotations.Test;

public class GroupTwo {
	  @Test(groups="regression")
	  public void fun1() {
		  System.out.println("Funtion runnning from GroupSecond fun1 via GroupTestSuite");
	  }
	  
	  @Test(groups="functional",priority=3)
	  public void fun2() {
		  System.out.println("Funtion runnning from GroupSecond fun2 via GroupTestSuite");
	  }
	  
	  @Test(groups="functional",priority=1)
	  public void fun3() {
		  System.out.println("Funtion runnning from GroupSecond fun3 via GroupTestSuite");
	  }
}
