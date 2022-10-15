package week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebElement create = driver.findElement(By.linkText("Create New Account"));
		 create.click();
		 WebElement firstName =driver.findElement(By.xpath("//input[@name ='firstname']"));
		 firstName.sendKeys("Kesav");
		 WebElement lastName =driver.findElement(By.xpath("//input[@name ='lastname']"));
		 lastName.sendKeys("RamB");
		 WebElement mobileNumber =driver.findElement(By.xpath("//input[@name ='reg_email__']"));
		 mobileNumber.sendKeys("1234567");
		 WebElement password =driver.findElement(By.xpath("//input[@id ='password_step_input']"));
		 password.sendKeys("Ram");
		 WebElement date = driver.findElement(By.id("day"));
		 Select obj1 = new Select(date);
		 obj1.selectByValue("27");
		 WebElement month = driver.findElement(By.id("month"));
		 Select obj2 = new Select(month);
		 obj2.selectByVisibleText("Aug");
		 WebElement year = driver.findElement(By.id("year"));
		 Select obj3 = new Select(year);
		 obj3.selectByIndex(33);
		 WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
		 gender.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 driver.close();
		 
	}

}
