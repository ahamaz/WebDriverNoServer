package com.ahamaz;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverNoServer {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\ahasan.manzoor.ali\\eclipse Tools\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		// Entering search term into google search.
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("Accenture");
		searchField.submit();
		
		//Implicit time wait.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Click and open the Images page.
		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();
		
//		//Clicking an image on the Image page:
//		WebElement imageElement = driver.findElements(By.cssSelector("a[class=wXeWr islib nfEiy mM5pbd]")).get(0);
//		WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
//		imageElement.click();
		driver.findElement(By.xpath("//*[@id=\"islrg\"]/div[1]/div[1]/a[1]/div[1]/img")).click();
	}
}
