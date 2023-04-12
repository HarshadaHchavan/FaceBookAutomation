 package TestCase;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccount;
import TestBaseCase.WebTestBase;

public class TC01 extends WebTestBase {
 MyAccount myAccount;
 HomePage homePage;
 LoginPage loginPage;
 
 public TC01()
 {
  super();
 }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccount = new MyAccount();
    }
//for testing the login credential()
    @Test(priority = 0)
    public void verifyLoginWithValidCredential(){
      SoftAssert softAssert=new SoftAssert();
        homePage.userSearchClick();
        loginPage.login(prop.getProperty("mobile"), prop.getProperty("password"));
        softAssert.assertEquals(myAccount.getTextOFMYAccountPage(), "My Account", "My Account text should be match");
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void verifySearchBar(){
        SoftAssert softAssert = new SoftAssert();
        myAccount.search();
        System.out.println(myAccount.getTextOfSearch());
        softAssert.assertEquals(myAccount.getTextOfSearch(), "Showing results for \"the power of your subconscious mind\"\n" +
                "254 results found","Showing results for \"the power of your subconscious mind\"\n" +
        "254 results found text should be match");
        myAccount.selectDropDown("byVisibleText", "Best Seller");
        softAssert.assertAll();
    }
    
 

    @Test(priority = 3)
	public void verifyScrollDown() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
	}
	
	@Test(priority = 4)
	public void verifyScrollUp() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		js.executeScript("window.scrollBy(0,-800)");
		
	}
    @Test(priority = 5)
    public void verifyGetWindowHandle(){
        SoftAssert softAssert = new SoftAssert();
        myAccount.windowHandle();
        softAssert.assertAll();
    }
    public void verifyMouseHover(){
	     SoftAssert softAssert = new SoftAssert();
	     
	     softAssert.assertAll();
	 }
    @Test(priority = 6)
    public void verifyCookiesHandle(){
        SoftAssert softAssert = new SoftAssert();
        myAccount.getCookiesHandle();
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

}
