package seleniumClass1;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task04 {
	WebDriver driver;

    @Test
	public void test()
	{
	String Url="https://www.amazon.in/";
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\neha.bani\\Downloads\\Software\\chromedriver_win32 (1)\\chromedriver.exe");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\neha.bani\\Downloads\\chromedriver_win32\\chromedriver.exe") ;
	driver=new ChromeDriver();

	driver.get(Url);
	driver.findElement(By.id("nav-hamburger-menu")).click();
	driver.findElement(By.linkText("Amazon Prime Video")).click();
	driver.findElement(By.linkText("Kids Shows")).click();


	
	}

	
	

}
