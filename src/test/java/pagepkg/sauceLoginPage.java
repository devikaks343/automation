package pagepkg;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sauceLoginPage {
WebDriver driver;
	

@FindBy (xpath="//*[@id=\"user-name\"]")
WebElement saucename;

@FindBy (xpath="//*[@id=\"password\"]")
WebElement saucepassword;

@FindBy (xpath="//*[@id=\"login-button\"]")
WebElement saucelogin;


public sauceLoginPage(WebDriver driver)
{
	

this.driver=driver;
PageFactory.initElements(driver, this);
}

public void loginclick()
{
saucelogin.click();
}

public void setvalues(String UN,String PWD)
{
	saucename.sendKeys(UN);
	saucepassword.sendKeys(PWD);
}
}





