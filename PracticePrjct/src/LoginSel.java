import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginSel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\95\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		//System.out.println(wd);
		
		wd.manage().window().maximize();
		
		wd.get("https://www.google.in/");
		System.out.println(wd.getTitle());
		
		
		wd.get("https://www.w3schools.com/html/html_urlencode.asp");
	
		System.out.println(wd.getTitle());
		System.out.println(wd.getCurrentUrl());
		String expectedUrl= wd.getCurrentUrl();	
		
		
		wd.findElement(By.linkText("Log in")).click();
	
	
		wd.findElement(By.name("email")).sendKeys("mirudularavi@gmail.com");
		wd.findElement(By.name("current-password")).sendKeys("Password#123");
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button")).sendKeys(Keys.ENTER);
		
		
		String actualUrl="https://www.w3schools.com/html/html_urlencode.asp";
		
		Assert.assertEquals(actualUrl, expectedUrl);
	
	}

}
