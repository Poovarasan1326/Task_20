package task_20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker_Atomate {

	public static void main(String[] args) {
		// Initialize the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximize the browser window
		driver.manage().window().maximize();

		// Navigate to the URL
		driver.get("https://jqueryui.com/datepicker/");

		// Switch to the iframe
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("datepicker")).click();

		// Select the date
		String expMonth = "March";

		while (true) {
			String actMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			if (actMonth.equals(expMonth)) {
				break;
			} else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				WebElement selectDate = driver.findElement(By.xpath("//a[text()='22']"));
				selectDate.click();
			}
		}
		// Get the selected date and print it on the console
		WebElement getDate = driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
		String date = getDate.getText();
		System.out.println("Selected Date: " + date);

		// Close the browser window and quit the WebDriver instance
		driver.quit();
	}
}
