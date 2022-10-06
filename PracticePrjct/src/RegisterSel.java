import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterSel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\95\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		//System.out.println(wd);
		
		wd.manage().window().maximize();
		
		wd.get("https://www.google.in/");
		System.out.println(wd.getCurrentUrl());
		System.out.println(wd.getTitle());
		
		wd.get("https://profile.w3schools.com/sign-up");
		System.out.println(wd.getCurrentUrl());
		System.out.println(wd.getTitle());
		

		wd.findElement(By.name("email")).sendKeys("mirudularavi@gmail.com");
		wd.findElement(By.name("new-password")).sendKeys("Password#123");
		
		
		wd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[5]/div[1]/button")).sendKeys(Keys.ENTER);
		
	
		wd.findElement(By.id("modal_first_name")).sendKeys("Mirudula");
		wd.findElement(By.id("modal_last_name")).sendKeys("Ravi");
		
		
		wd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[3]/div/button")).sendKeys(Keys.ENTER);
		
		
			
	}

}
