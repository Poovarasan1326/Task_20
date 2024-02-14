package task_20;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guvi_SignUp_Automation {

	public static void main(String[] args) {
		// Initialize the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximize the browser window
		driver.manage().window().maximize();

		// Launch the website
		driver.get("https://www.guvi.in/");

		// click on the Signup button
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();

		// Fill in the signup form
		driver.findElement(By.id("name")).sendKeys("Jack");

		driver.findElement(By.id("email")).sendKeys("Jack@example.com");

		driver.findElement(By.id("password")).sendKeys("Passsword@123");

		// Click on the Signup button to submit the form
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();

		// Wait for the page to load and verify user registration
		String pageTitleAfterSignup = driver.getTitle();
		if (pageTitleAfterSignup.contains("Thank you for registering")) {
			System.out.println("User registered successfully");
		} else {
			System.out.println("User registration failed");
		}

		// Close the browser
		driver.quit();
	}
}
