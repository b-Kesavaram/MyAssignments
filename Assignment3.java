package week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 WebElement elementLogin = driver.findElement(By.id("username"));
		 elementLogin.sendKeys("Demosalesmanager");
		 WebElement elementPassword = driver.findElement(By.id("password"));
		 elementPassword.sendKeys("crmsfa");
		 WebElement elementEnter = driver.findElement(By.className("decorativeSubmit"));
		 elementEnter.click();
		 WebElement elementCrmsfa = driver.findElement(By.linkText("CRM/SFA"));
		 elementCrmsfa.click();
		 WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		 elementLeads.click();
		 WebElement elementFindLeads = driver.findElement(By.linkText("Find Leads"));
		 elementFindLeads.click();
		 WebElement elementPhoneSearch = driver.findElement(By.linkText("Phone"));
		 elementPhoneSearch.click();
		 WebElement phoneArea = driver.findElement(By.xpath("//input[@name='phoneAreaCode']"));
		 phoneArea.sendKeys("222");
		 WebElement findPhoneLeads = driver.findElement(By.xpath("//button[@id='ext-gen334']"));
		 findPhoneLeads.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebElement elementPhoneLink = driver.findElement(By.linkText("11627"));
		 elementPhoneLink.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 WebElement elementPhoneDelete = driver.findElement(By.linkText("Delete"));
		 elementPhoneDelete.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 WebElement elementFindLeadss = driver.findElement(By.linkText("Find Leads"));
		 elementFindLeadss.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 WebElement elementPhoneSearchh = driver.findElement(By.linkText("Phone"));
		 elementPhoneSearchh.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 WebElement phoneAreaa = driver.findElement(By.xpath("//input[@name='phoneAreaCode']"));
		 phoneAreaa.sendKeys("222");
		 WebElement findPhoneLeadss = driver.findElement(By.xpath("//button[@id='ext-gen334']"));
		 findPhoneLeadss.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 driver.close();
		 
		 

	}

}
