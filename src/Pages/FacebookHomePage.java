package Pages;
import org.openqa.selenium.By;

public class FacebookHomePage {
	//Feed elements
	public static By feed_text = By.name("xhpc_message");//By.xpath("//*[contains(@class='navigationFocus')");// By.xpath("//div[@class='_1mf _1mj']/span/br"); // By.name("xhpc_message");
	public static By post_button = By.xpath("//button[@class='_1mf7 _4jy0 _4jy3 _4jy1 _51sy selected _42ft']/span");
	public static By posted_item = By.xpath("//div[@class='_5pbx userContent _3ds9 _3576']/div/p");
	
	//Search elements
	public static By search_box = By.xpath("//input[@data-testid='search_input']");
	public static By search_button = By.xpath("//button[@data-testid='facebar_search_button']/i");
	
	public static By userNavigation = By.xpath("//div[@id='userNavigationLabel']");
	public static By signOut = By.partialLinkText("Log Out");

}
