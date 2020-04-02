package program;
/*This test cases for verify Url*/ 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_home_p4//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        //driver.navigate().to("https://www.expedia.com");
		String url="https://www.expedia.com/";
		driver.get(url);
		String current_url=driver.getCurrentUrl();
		System.out.println(current_url);
        System.out.println("Web browser open successfully");
       if(current_url.equalsIgnoreCase(url)) {
    	   System.out.println("The web browser url match");
       }
       else {
    	   System.out.println("The web browser url  is not match");
       }
        driver.close();
	}

}
