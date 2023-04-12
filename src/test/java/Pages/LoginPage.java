package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBaseCase.WebTestBase;

public class LoginPage extends WebTestBase {

@FindBy(name = "email")
WebElement enteremail   ;

@FindBy(name = "pass")
WebElement  passwordTextBox;

@FindBy(name = "login")
WebElement  loginbtn;
public LoginPage() {
	PageFactory.initElements(driver,this);
}
//sending the mobileno and password to login
      public void login(String email,String password) {
    enteremail.sendKeys(email);
    	  passwordTextBox.sendKeys();
    	  loginbtn.click();
}
}