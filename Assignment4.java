package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.leafground.com/input.xhtml");
		 WebElement elementName = driver.findElement(By.xpath("//input[@name='j_idt88:name']"));
		 elementName.sendKeys("Kesavaram");
		 WebElement elementCountry = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']"));
		 elementCountry.sendKeys("Chennai");
		 WebElement elementText = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt95']"));
		 elementText.getText();
		 WebElement elementClear = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt95']"));
		 elementClear.clear();
		 WebElement elementRetrive = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt97']"));
		 elementRetrive.clear();
		 elementRetrive.sendKeys(elementText.getText());
		 

	}

}
