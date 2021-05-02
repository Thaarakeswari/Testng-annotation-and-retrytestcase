package testngfullpackage;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateLeadTestCases extends Baseclass {

	@Test
	public void runcreate() {
		// TODO Auto-generated method stub
	
		
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Leads")));
		//driver.findElement(By.linkText("Leads")).click();
		//driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL TECHNOLOGY");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("KING");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ALBERT");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		
		
	}
}
