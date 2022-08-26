package com.baseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver dr;

	
	public static WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.manage().window().maximize();
		return dr;
	}

	public static void launchUrl(String Url) {
		dr.get(Url);
		
	}
	public static void type(WebElement element,String value) {
		
	element.sendKeys(value);
	}
	public static void click(WebElement element) {
	element.click();

}
	public static void scrollDown(WebElement element) {
	JavascriptExecutor j=(JavascriptExecutor)dr;
	j.executeScript("arguments[0].scrollIntoView(true)",element);

}

	public static void takeScreenShot(WebElement element, String location) throws IOException {
		TakesScreenshot screenShot=(TakesScreenshot)dr;
		File s = screenShot.getScreenshotAs(OutputType.FILE);
		File d=new File(location);
		FileUtils.copyFile(s, d);

	}
	
	
	
	
	
}


