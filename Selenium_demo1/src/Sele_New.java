import java.util.concurrent.TimeUnit;

import org.jboss.netty.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.interactions.touch.MoveAction;

public class Sele_New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium_Id_demo\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");//https
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("amazon india",Keys.ENTER);
	//	element.sendKeys()
		
		//To click on Online shopping site
		driver.findElement(By.className("ellip")).click();
		
		//Mouse scroll on Accounts & Sign In element
		driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		
		
		//To Click on Sign In element 
		driver.findElement(By.name("nav-action-inner")).click();
	//	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[4]/div[3]/div[2]/div/div[1]/div/a/span")).click();
		//To enter email id
		driver.findElement(By.id("ap_email")).sendKeys("ramaspol11@gmail.com",Keys.ENTER);
	
		//To continue
		driver.findElement(By.id("continue")).click();
		//To Enter Password
		driver.findElement(By.id("ap_password")).sendKeys("shalivu",Keys.ENTER);
		//To click on Login
		driver.findElement(By.id("signInSubmit")).click();
		
		//WebElement webElement=driver.findElement();
		driver.close();

		
	
		
		
		
	
		
		
		Timeout t;
		
		
	}

}
