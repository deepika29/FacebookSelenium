package Pages;

import org.openqa.selenium.By;

public class SignUpPage {

	//Sign in elements
	public static By email_id = By.xpath("//input[@id='email']");
	public static By user_password = By.xpath("//input[@id='pass']");
	public static By logIn = By.xpath("//label[@id='loginbutton']/input");

	//Sign up elements
	public static By fName = By.xpath("//input[@id='u_0_j']");
	public static By lName = By.xpath("//input[@id='u_0_l']");
	public static By email1 = By.xpath("//input[@id='u_0_o']");
	public static By email2 = By.xpath("//input[@id='u_0_r']");
	public static By password = By.xpath("//input[@id='u_0_v']");

	public static By date = By.id("day");
	public static By month = By.id("month");
	public static By year = By.id("year");
	public static By gender = By.xpath("//span[@id='u_0_z']/span/input");
	public static By signUp = By.xpath("//div[@class='clearfix']/button[@name='websubmit']");
}
