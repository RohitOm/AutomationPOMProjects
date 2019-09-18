package he;
	
import java.util.List;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class base {
	static WebDriver driver;
	static Select sel;
	static Actions acc;
public static void launchBrowser(String url) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit Omkar\\eclipse-workspace\\new\\EarContent\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		}

public static void max() {
	driver.manage().window().maximize();
}


public static void filltxt(WebElement e,String inp) {
			e.sendKeys(inp);
		}
		
public static void opt(WebElement e, int i) {
	 
	sel=new Select(e);
	sel.selectByIndex(i);
}		

public  static void clk(WebElement e) {
	acc=new Actions(driver);
	acc.moveToElement(e).perform();
	e.click();
	System.out.println("executed");
}

public static void mulOpt(WebElement e, WebElement f, WebElement g) {
	 
	e.click();

	
	
}			
		
	
}	
	


