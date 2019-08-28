	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
public class SelectSelDemo {
	

	 public static void main(String[] args) { 
			System.setProperty("webdriver.chrome.driver","D:\\selenium_Id_demo\\chromedriver_win32\\chromedriver.exe");
		
		    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		    WebDriver driver = new FirefoxDriver();
			driver.get(baseURL);

			Select drpCountry = new Select(driver.findElement(By.name("country")));
			drpCountry.selectByVisibleText("ANTARCTICA");

			//Selecting Items in a Multiple SELECT elements
			driver.get("http://jsbin.com/osebed/2");
			Select fruits = new Select(driver.findElement(By.id("fruits")));
			fruits.selectByVisibleText("Banana");
			//WebElement w=driver.findElement(By.xpath("//input[@class='xAvst']"));
		//	driver.get
			//*[@id="g-mainbar"]/div[1]/div/div/div/div/div/ul
			
		
			fruits.selectByIndex(1);
	 }
	
}
