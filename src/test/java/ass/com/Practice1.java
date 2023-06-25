package ass.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://auth.dev.vntech.io/");
	driver.findElement(By.xpath("//button[text()='Accept All']")).click();
	String id=driver.getWindowHandle();

	//clicking on continue with google
	Thread.sleep(3000);
	driver.findElement(By.id("google-div")).click();
	Thread.sleep(6000);
	driver.switchTo().window(id);
	
	//clicking on continue with facebook
	driver.findElement(By.className("jss13")).click();
	Thread.sleep(6000);
	driver.switchTo().window(id);
	 
	//clicking on continue with Apple
	driver.findElement(By.xpath("//button[@buttontext='Continue with Apple']")).click();
	Thread.sleep(6000);
	driver.switchTo().window(id);
	
	//clicking on continue with microsoft
	driver.findElement(By.id("microsoft-div")).click();
	Thread.sleep(6000);
	driver.switchTo().window(id);

	//creating account
	driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	driver.findElement(By.xpath("//p[text()='Other']")).click();	
	
	driver.findElement(By.xpath("(//input[contains(@class,'css-qyehkn')])[1]")).sendKeys("Firstnam",Keys.TAB,"Lastnam",Keys.TAB,"sanmegha1026@gmail.com",Keys.TAB,Keys.ENTER);
	driver.findElement(By.linkText("Sign in")).click();
	//performing login
	driver.findElement(By.xpath("//p[text()='Other']")).click();
	driver.findElement(By.id("email")).sendKeys("sanmegha1026@gmail.com",Keys.TAB,"User@1234");
	driver.findElement(By.id("signin")).click();
	
	Thread.sleep(10000);
	driver.quit();

}
	
}
