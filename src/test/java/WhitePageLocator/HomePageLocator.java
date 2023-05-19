package WhitePageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WhiteUtility.WhiteBase;

public class HomePageLocator extends WhiteBase {
	
	
	public HomePageLocator () {
		
		PageFactory.initElements(driver, this ); //own method and pagefactory is constructor
		
	}
@FindBy (id = "gh-cat")
public WebElement AllCatagories;
// WebElement = Locator


@FindBy (id = "gh-btn")
public WebElement SearchButton;
	}

