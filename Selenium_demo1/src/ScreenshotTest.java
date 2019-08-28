import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotTest {
	
	  @Test

	    public void fun() throws Exception{

			WebDriver driver ;
	    	System.setProperty("webdriver.chrome.driver","D:\\selenium_Id_demo\\chromedriver_win32\\chromedriver.exe");
	    	driver = new ChromeDriver();
	        driver.get("http://demo.guru99.com/V4/");

	        //Call take screenshot function

	        this.takeSnapShot(driver, "c://test.png");
	    //    ScreenshotTest.takeSnapShot(driver, "c://test.png") ;     

	    }

	  
	  
	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) {
		// TODO Auto-generated method stub
		  
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
      
        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                try {
					FileUtils.copyFile(SrcFile, DestFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                //FileUtils.copyDirectory(srcDir, destDir, preserveFileDate);
              //  FileUtils.copyFile(SrcFile, DestFile);

		
	}
	

	

}
