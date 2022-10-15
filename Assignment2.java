package week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

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
		 WebElement fName = driver.findElement(By.id("ext-gen248"));
		 fName.sendKeys("Kesav");
		 WebElement findLeads = driver.findElement(By.xpath("//button[@id='ext-gen334']"));
		 findLeads.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebElement searchLead = driver.findElement(By.linkText("10706"));
		 searchLead.click();
		 System.out.println(driver.getTitle());
		 WebElement edit = driver.findElement(By.linkText("Edit"));
		 edit.click();
		 WebElement upd = driver.findElement(By.xpath("//input[@id= 'updateLeadForm_companyName']"));
		 upd.clear();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 upd.sendKeys("Cognizant Technology Solutions");
		 WebElement updateClick = driver.findElement(By.className("smallSubmit"));
		 updateClick.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 driver.close();

	}

}
