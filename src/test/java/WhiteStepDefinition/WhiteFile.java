package WhiteStepDefinition;

import WhiteUtility.WhiteBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WhiteFile extends WhiteBase {
	
	WhitePageAction.HomePageAction homepageAction = new WhitePageAction.HomePageAction();
	
	@Given("^openn ebayy \"([^\"]*)\" app$")
	public void openn_ebayy_app(String URL) throws Throwable {
	   WhiteURL(URL);
	}

	@Then("^clickk all catagories$")
	public void clickk_all_catagories() throws Throwable {
		homepageAction.clickkallcatagories();

	}

	@Then("^clicck search button$")
	public void clicck_search_button() throws Throwable {
		homepageAction.cliccksearchbutton();
	}

	

}
