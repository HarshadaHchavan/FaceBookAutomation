package org.test;

import org.openqa.selenium.By;

public class IFrame_demo {

}
public class IFrames_demo {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();    
	    options.addArguments("--remote-allow-origins=*");
	    //creating object for chrome driver 
	    WebDriver driver = new ChromeDriver(options);
	    driver.get("https://demoqa.com/frames");
	    //Iframe By Index
	    //int size = driver.findElements(By.xpath("//div[@class='container']")).size();
	    //System.out.println(size);
	    //frame by index
	      //driver.switchTo().frame(0);
	    
	    //driver.findElement(By.xpath("//div[@class='container']//input[@type='text']")).sendKeys("Meena");
	    //Iframe By value
	    ///driver.switchTo().frame("IF1");
	    //driver.findElement(By.name("firstname")).sendKeys("vengat");
	    
	    //switching the frame by webelement
	    /*WebElement w=driver.findElement(By.xpath("(//div[@id='frame1Wrapper']/iframe)"));
	    driver.switchTo().frame(w);
	    System.out.println(driver.findElement(By.xpath("//h1")).getText());*/
	    
	    //switching the frame by id
	    driver.switchTo().frame("frame1");
	    System.out.println(driver.findElement(By.xpath("//h1")).getText());
	    
	    
	    
	    
	  }

	}