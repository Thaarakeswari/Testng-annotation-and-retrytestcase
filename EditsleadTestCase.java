package testngfullpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditsleadTestCase extends Baseclass {

	//@Test(retryAnalyzer=testngfullpackage.Retrytest.class)
	@Test
	public  void runedit() throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		/*WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Leads")));
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();*/
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc");
		driver.findElement(By.xpath("//utton[@type='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//driver.findElement(By.className("x-grid3-cell-inner x-grid3-col-partyId")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_firstName")).clear();
		driver.findElement(By.id("updateLeadForm_firstName")).sendKeys("MITHRA");
		driver.findElement(By.xpath("//input[@value='Update']")).click();

	}

}
