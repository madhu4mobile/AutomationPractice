package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp"); // URL

		/*
		 * //*[@id="customers"]/tbody/tr[2]/td[1]
		 * //*[@id="customers"]/tbody/tr[3]/td[1]
		 * //*[@id="customers"]/tbody/tr[4]/td[1]
		 * 
		 * */
		
		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for (int i=2; i<=7; i++) {
			String actualXpath = beforeXpath+i+afterXpath;
			String companyName = driver.findElement(By.xpath(actualXpath+i+afterXpath));
			System.out.println(companyName);
		}
		
		
		
		
		
		
		
	}

}
