package labPackageExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenCart {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\Software-Workspace\\Selenium Data\\chromedriver-win64\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			 d.manage().window().maximize();
			d.get("https://www.opencart.com/index.php?route=account/register");
			
			d.findElement(By.xpath("//input[@id='input-username']")).sendKeys("Rohit123");
			d.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Rohit");
			d.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("gupta");
			d.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Rohit@gmail.com");
			d.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Rohit123");
			Select county = new Select(d.findElement(By.xpath("//select[@id='input-country']")));
			county.selectByIndex(4);
			county.selectByVisibleText("India");
			d.findElement(By.xpath("d.findElement(By.xpath(\"//input[@id='input-password']\")).sendKeys(\"Rohit123\");")).click();
			
			Thread.sleep(5000);
			
			d.switchTo().newWindow(WindowType.TAB);
			d.get("https://www.opencart.com/index.php?route=account/login");
			
			d.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Rohit123");
			d.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Rohit123");
			d.findElement(By.xpath("//body/div[@id='account-login']/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/button[1]")).click();
			
			WebElement messInput = d.findElement(By.xpath("//input[@id='input-email']"));
			messInput.click();
			String userName = messInput.getAttribute("value");
			WebElement messPass = d.findElement(By.xpath("//input[@id='input-password']"));
			messPass.click();
			String userPass = messPass.getAttribute("value");
			
			//UserName And Password Print In Console
			System.out.println("UserName : " + userName +" And Password : "+ messPass);
			
			//Link To Print In Console
			System.out.println(d.getCurrentUrl());
			
			d.manage().window().minimize();
	}

}
