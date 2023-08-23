package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObj {
	@FindBy(how=How.NAME,using="email")
	public static WebElement user;
	
	@FindBy(name="password")
	public static WebElement pswd;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button")
	public static WebElement submit;
	
	
	/*
	public static WebElement user(WebDriver d)
	{
		return d.findElement(By.name("email"));
	}

	public static WebElement pswd(WebDriver d)
	{
		return d.findElement(By.name("password"));
	}
	
	public static WebElement submit(WebDriver d)
	{
		return d.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));
	}

	
	*/
}
