import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestData.*;

public class FacebookSignUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(Urls.url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(Pages.SignUpPage.fName).sendKeys(UserData.first_name);
		driver.findElement(Pages.SignUpPage.lName).sendKeys(UserData.last_name);
		driver.findElement(Pages.SignUpPage.email1).sendKeys(UserData.email_id);

		WebElement email_address  = driver.findElement(Pages.SignUpPage.email2);//u_0_q
		if(email_address.isDisplayed()){
			email_address.sendKeys(UserData.email_id);
		}
		
		driver.findElement(Pages.SignUpPage.password).sendKeys(UserData.password);//u_0_w
		
		
		Select date = new Select(driver.findElement(Pages.SignUpPage.date));
		date.selectByValue("29");
		Select month = new Select(driver.findElement(Pages.SignUpPage.month));
		month.selectByVisibleText("Jan");
		Select year = new Select(driver.findElement(Pages.SignUpPage.year));
		year.selectByValue("1986");
		driver.findElement(Pages.SignUpPage.gender).click();
		driver.findElement(Pages.SignUpPage.signUp).click();
		
		String parentWindow = driver.getWindowHandle();
		WebElement connectToGmail = driver.findElement(By.xpath("//div[@class='rfloat _ohf']/button[@class='_42ft _4jy0 _4jy4 _4jy1 selected _51sy']"));
		connectToGmail.click();
		if(connectToGmail.isDisplayed()){
			connectToGmail.click();
		}
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		
	    Set<String> newWindows = driver.getWindowHandles();
	    System.out.println("newWindows: " + newWindows.size() + newWindows.toString());
	    Iterator<String> window = newWindows.iterator();
	    while(window.hasNext())
	    {
	        String next_tab = window.next();
	        if (!parentWindow.equalsIgnoreCase(next_tab))
	        {
	        driver.switchTo().window(next_tab);
	        System.out.println("Working on Google Login Box");
	        WebDriverWait wait2 = new WebDriverWait(driver, 20);
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']"))).sendKeys(UserData.email_id);
	        }
	    }
		driver.findElement(By.xpath("//div[@id='identifierNext']/content[@class='CwaK9']/span")).click();

	}

}
