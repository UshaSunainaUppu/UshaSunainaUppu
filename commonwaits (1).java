package hemanth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class commonwaits {
	
	@Test
	public void Common()
	{
		System.setProperty("webdriver.chrome.driver", "/Volumes/mac_data/my_data/usha_sony/Documents/important_documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.edureka.co/");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"si_popup_email\"]")).sendKeys("Sunaina.hemanth@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"si_popup_passwd\"]")).sendKeys("QWERTY55$$");
	    driver.findElement(By.xpath("//*[@id=\"new_sign_up_mode\"]/div/div/div[2]/div[3]/form/button")).click();
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/button/img")));
	    element.click();
	    driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"personal_details\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/div[2]/a/i")).click();
	WebElement upload = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='file-upload']")));
	    upload.click();
	   
	}

	}



