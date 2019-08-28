	import org.openqa.selenium.By;		
	import org.openqa.selenium.WebDriver;		
	import org.openqa.selenium.chrome.ChromeDriver;		
	import org.openqa.selenium.*;
public class TooltipEx {

		
		public static void main(String[] args) {									
	     
	        String baseUrl = "http://demo.guru99.com/test/social-icon.html";					
	        System.setProperty("webdriver.chrome.driver","D:\\selenium_Id_demo\\chromedriver_win32\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();					
	        driver.get(baseUrl);					
	        String expectedTooltip = "Github";	
	        
	        // Find the Github icon at the top right of the header		
	        WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));	
	        
	        //get the value of the "title" attribute of the github icon		
	        String actualTooltip = github.getAttribute("title");	
	        
	        //Assert the tooltip's value is as expected 		
	        System.out.println("Actual Title of Tool Tip"+actualTooltip);							
	        if(actualTooltip.equals(expectedTooltip)) {							
	            System.out.println("Test Case Passed");					
	        }	
	        //driver.get
	        
	      String name=  driver.getTitle();
	      System.out.println("Title of url is:"+name);
	        driver.get("http://demo.guru99.com/test/guru99home/");
	      //  driver.switchTo()actualTooltip.("http://demo.guru99.com/test/guru99home/");
	         		       // navigates to the page consisting an iframe

	        		       driver.manage().window().maximize();
	        		       driver.switchTo().frame("a077aa5e"); //switching the frame by ID

	        				System.out.println("We are switch to the iframe");
	        	     		driver.findElement(By.xpath("html/body/a/img")).click();
	        	     	//	input[@class='']
	        	  		    //Clicks the iframe
	        	       
	        	  			System.out.println("switching of iframe is done ");
	        	  			
	        	      }
	        		
	     			
	   }		
	

