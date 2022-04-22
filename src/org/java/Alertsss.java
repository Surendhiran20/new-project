package org.java;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsss {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Alert\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		

//		Prompt Alert
		WebElement clk4 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		clk4.click();
		
		WebElement clk5 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		clk5.click();
		
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Suren");
		prompt.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
