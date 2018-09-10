package com.facebook.utils;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookMethods {
static WebDriver driver = new FirefoxDriver();
	
//User sign in method
	public static void signIn(String email, String password) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");

		driver.get(TestData.Urls.url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(Pages.SignUpPage.email_id).sendKeys(email);
		driver.findElement(Pages.SignUpPage.user_password).sendKeys(password);
		driver.findElement(Pages.SignUpPage.logIn).click();
		 Thread.sleep(5000);

        System.out.println("Successfully logged in");
	}
	
	
	//Post a feed
	public static void postAFeed() throws InterruptedException{
	    String post = "Hello! My First Post.";
			   
	    WebElement feed_text = driver.findElement(Pages.FacebookHomePage.feed_text);
	    Thread.sleep(2000);
	    feed_text.click();
	    feed_text.sendKeys(post);
		driver.findElement(Pages.FacebookHomePage.post_button).click();
		
		String posted_value = driver.findElement(Pages.FacebookHomePage.posted_item).getText();
		System.out.println(posted_value);
		Assert.assertEquals(post, posted_value);
		Thread.sleep(2000);

		System.out.println("Status posted successfully.");
	}
	
	//Send a friend request
	 public static void sendRequest() throws InterruptedException{
		    String user_fullName = "Pogo Pogotest";
		    String request_sent = "Friend Request Sent";
		    WebElement search = driver.findElement(Pages.FacebookHomePage.search_box);
		    Thread.sleep(2000);
		    search.click();
		    search.sendKeys(user_fullName);
		    driver.findElement(Pages.FacebookHomePage.search_button).click();
		    			
			driver.findElement(Pages.SearchResultPage.add_friend_button).click();
			Thread.sleep(2000);
			WebElement pop_up = driver.findElement(Pages.SearchResultPage.friend_suggetion_close);
			if(pop_up.isDisplayed()){
				pop_up.click();
			}
			
			String request_sent_text = driver.findElement(Pages.SearchResultPage.sent_request).getText();
			Assert.assertEquals(request_sent, request_sent_text);
	        System.out.println("Friend request sent.");

	   }
	 
	 //SignOut
	 public static void signOut() throws InterruptedException{
		 Thread.sleep(2000);
		 driver.findElement(Pages.FacebookHomePage.userNavigation).click();
		 Thread.sleep(5000);
		 driver.findElement(Pages.FacebookHomePage.signOut).click();
		 System.out.println("User signed out.");
	 }

}
