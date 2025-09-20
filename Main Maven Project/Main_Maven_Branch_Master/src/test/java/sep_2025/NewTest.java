package sep_2025;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
 
  @BeforeTest
  public void beforeTest() {
	    System.out.println("Kiranok");
  }
  @Test
  public void f() {
	  System.out.println("Kiran");
  }

  @AfterTest
  public void afterTest() {
	    System.out.println("Kiran");
  }

}
