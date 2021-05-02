package testngfullpackage;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountTestcase extends Baseclass{
	@Test
	public void accountsinfo() throws InterruptedException {
	
	
	Thread.sleep(2000);
	driver.findElement(By.linkText("Accounts")).click();
	/*WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Accounts")));
	/*driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();*/
	/*List<WebElement> elements1=driver.findElements(By.xpath("//table[@style='width: 1128px;']//tr[1]"));
	
	for (WebElement eachrows  : elements1) {
		
		System.out.println(eachrows);
		
	}*/
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	
}}
