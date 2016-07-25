package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTest {

	public static void main(String[] args) {
		WebDriver dr = new FirefoxDriver();
		dr.get("http://facebook.com");
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Test Facebook");
		
		dr.findElement(By.xpath(".//*[@id='u_0_f']")).click();
		
		Select month = new Select(dr.findElement(By.xpath(".//*[@id='month']")));
		month.selectByIndex(3);
		
		Select day = new Select(dr.findElement(By.xpath(".//*[@id='day']")));
		day.selectByValue("15");
		
		Select year = new Select(dr.findElement(By.xpath(".//*[@id='year']")));
		year.selectByVisibleText("2002");
		
		dr.findElement(By.xpath(".//*[@id='u_0_j']")).click();
		
		dr.quit();
	}

}
