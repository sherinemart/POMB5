package testcase;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactory.PageObj;

public class Logintestcase {
	WebDriver d;
  @Test
  public void login() {
	    System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver109\\chromedriver.exe");
		d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://phptravels.net/login");
		
		PageFactory.initElements(d, PageObj.class);
		
		PageObj.user.sendKeys("user@phptravels.com");
        PageObj.pswd.sendKeys("demouser");
        PageObj.submit.click();
		/*
		PageObj.user(d).sendKeys("user@phptravels.com");
		PageObj.pswd(d).sendKeys("demouser");
		PageObj.submit(d).click();
		*/
		
		/*
		d.findElement(By.name("email")).sendKeys("user@phptravels.com");
		
		d.findElement(By.name("password")).sendKeys("demouser");
		
		d.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button")).click();
		*/
  }
}
