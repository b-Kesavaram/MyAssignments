package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeads {

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
		 elementCompanyName.sendKeys("CTS");
		 WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		 elementFirstName.sendKeys("Kesav");
		 WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		 elementLastName.sendKeys("Ram");
		 WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		 elementFirstNameLocal.sendKeys("B");
		 WebElement elementDepartName = driver.findElement(By.id("createLeadForm_departmentName"));
		 elementDepartName.sendKeys("Management");
		 WebElement elementDesc = driver.findElement(By.className("inputBox"));
		 elementDesc.sendKeys("This is a Demo class of  Chrome Webdriver");		  
		 WebElement elementCreate = driver.findElement(By.className("smallSubmit"));
		 elementCreate.click();
		 WebElement elementEditLeads = driver.findElement(By.linkText("Edit"));
		 elementEditLeads.click();
		 WebElement elementDescCorrection = driver.findElement(By.className("inputBox"));
		 elementDescCorrection.clear();
		 WebElement elementUpdateCompany = driver.findElement(By.id("updateLeadForm_companyName"));
		 elementUpdateCompany.sendKeys("Cognizant");
		 WebElement elementImportantNote = driver.findElement(By.id("updateLeadForm_importantNote"));
		 elementImportantNote.sendKeys("This is a test");
		 WebElement elementUpdate = driver.findElement(By.className("smallSubmit"));
		 elementUpdate.click();
		 System.out.println(driver.getTitle());

	}

}
