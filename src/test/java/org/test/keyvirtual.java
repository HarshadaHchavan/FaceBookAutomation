package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class keyvirtual {

public static void main(String[] args)
{
  
  
    
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
  ChromeOptions options = new ChromeOptions();    
  options.addArguments("--remote-allow-origins=*");
  //creating object for chrome driver 
  WebDriver driver = new ChromeDriver(options);

driver.get("https://adactin.com/HotelApp/index.php");
driver.manage().window().maximize();
WebElement x = driver.findElement(By.id("username"));
x.sendKeys("vengatram");
WebElement x1 = driver.findElement(By.name("password"));
x.sendKeys(Keys.CONTROL,"ac");
x1.sendKeys(Keys.CONTROL,"v");

}