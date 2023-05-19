package WhiteUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WhiteBase {
     
	//constructor
	//method for browser
	//method for url
	public static WebDriver driver;
	public static Properties WhitePro;
	
	public WhiteBase() {
		
		try {
			FileInputStream ConsFile = new FileInputStream (System.getProperty("user.dir")+ "\\src\\test\\java\\WhiteConfiguration\\WhiteConfig.Properties");
			WhitePro = new Properties();
			WhitePro.load(ConsFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("please check code");
			e.printStackTrace();
		}
	
		}
	   
	public void WhiteBrowser() {
		
	String Browser = WhitePro.getProperty("WhiteBrowser1");
	if (Browser.equalsIgnoreCase("Chrome")) {
		
		//System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir") + "\\WhiteDriverFolder\\chromedriver.exe"));
		//driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", (System.getProperty("user.dir") + "\\ieDriver\\msedgedriver.exe"));
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	else if (Browser.equalsIgnoreCase("FF"));
	}
	
	public static void WhiteURL(String URL) {
		driver.get(WhitePro.getProperty("URLQA"));
	}
	
}
