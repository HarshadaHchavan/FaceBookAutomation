package org.test;

import java.util.Set;

import org.openqa.selenium.By;

public class MouseHover {

}
public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub
    //To load your driver file
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
        //To establish network connection from remote
        ChromeOptions options = new ChromeOptions();    
        options.addArguments("--remote-allow-origins=*");
        //creating object for chrome driver 
        WebDriver driver = new ChromeDriver(options);
        //To open  and maximise the window
        driver.manage().window().maximize();
        driver.get("https://nxtgenaiacademy.com/multiplewindows/");
        
          
        
        String parentWindowId = driver.getWindowHandle();
        
        
        System.out.println("Parent Window ID:" + parentWindowId);
        
        
        driver.findElement(By.xpath("//button[@id='button1']")).click();
        
        
    Set<String> allWindowId = driver.getWindowHandles();
        for(String x: allWindowId)
        {
          System.out.println(x);
        
      if (!parentWindowId.equals(x)) {
          System.out.println("Child Window ID:" + x);
          driver.switchTo().window(x);
          
          driver.findElement(By.xpath("//span[text()='Download Course Brochure']")).click();
          driver.manage().window().maximize();
          Thread.sleep(2000);
          driver.switchTo().defaultContent();
        }
        }
  }