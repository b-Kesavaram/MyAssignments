package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeads {

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
		 WebElement elementCreateLeads = driver.findElement(By.linkText("Create Lead"));
		 elementCreateLeads.click();
		 WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		 elementCompanyName.sendKeys("Wallmart");
		 WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		 elementFirstName.sendKeys("Martin");
		 WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		 elementLastName.sendKeys("Guptill");
		 WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		 elementFirstNameLocal.sendKeys("Lord");
		 WebElement elementDepartName = driver.findElement(By.id("createLeadForm_departmentName"));
		 elementDepartName.sendKeys("Stock_Market");
		 WebElement elementDesc = driver.findElement(By.className("inputBox"));
		 elementDesc.sendKeys("This is a Demo class of Selenium using Chrome Webdriver");		  
		 WebElement elementCreate = driver.findElement(By.className("smallSubmit"));
		 elementCreate.click();
		 System.out.println(driver.getTitle());
	}

}
