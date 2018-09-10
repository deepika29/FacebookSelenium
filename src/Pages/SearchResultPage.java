package Pages;
import org.openqa.selenium.By;

public class SearchResultPage {

	public static By feed_text = By.name("xhpc_message");
	public static By user_name = By.xpath("//a[@id='js_rb']/div");
	public static By add_friend_button = By.xpath("//div[@class='FriendButton']/button/i");
	public static By sent_request = By.xpath("//div[@class='FriendButton fStatusOutgoing']/button[2]");
	public static By friend_suggetion = By.xpath("//div[@class='ptm title fwb']");
	public static By friend_suggetion_close = By.xpath("//a[@title='Close']");
}
