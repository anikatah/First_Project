package WhitePageAction;

import WhitePageLocator.HomePageLocator;
import WhiteUtility.WhiteBase;

public class HomePageAction extends WhiteBase {
	
	HomePageLocator homepageLocator = new  HomePageLocator();
	
	public void clickkallcatagories () throws Exception {
	
		homepageLocator.AllCatagories.click();
		Thread.sleep(5000);
		
	}
	public void cliccksearchbutton () throws Exception {
		
		homepageLocator.SearchButton.click();
		Thread.sleep(5000);
	}
}
