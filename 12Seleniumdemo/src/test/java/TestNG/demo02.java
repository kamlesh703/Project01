package TestNG;

import org.testng.annotations.Test;

public class demo02 {
  @Test(priority =-1)
  public void signup() {
	  System.out.println("signup Page");
  }
  @Test(priority =1)
  public void login() {
	  System.out.println("login Page");
  }
  
  @Test
  public void addtocart() {
	  System.out.println("addtocart Page");
  }
  
  @Test(priority =3)
  public void payment() {
	  System.out.println("payment Page");
  }
}