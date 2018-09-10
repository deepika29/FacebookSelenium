import com.facebook.utils.FacebookMethods;

public class FacebookAction {
	
	public static void main(String[] args) throws InterruptedException {
		FacebookMethods facebookMethods = new FacebookMethods();

		//Sign in to facebook
		facebookMethods.signIn(TestData.UserData.email_id1, TestData.UserData.password1);

		//Posting a feed
		facebookMethods.postAFeed();
		
		//Send friend Request
		facebookMethods.sendRequest();
		
		//Sign Out from facebook
		facebookMethods.signOut();
	}

}
