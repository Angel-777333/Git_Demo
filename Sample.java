package com.selenium.concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vellar church\\eclipse-workspace\\Selenium\\Driver1.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().fullscreen();
	String c = driver.getTitle();
	System.out.println(c);
		
	}

}
