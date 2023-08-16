package app.chatdaddy.tech.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import app.chatdaddy.tech.Utils.Driver;
import app.chatdaddy.tech.Utils.ReusableMethods;

public class LoginPage {
	
	ReusableMethods reuse= new ReusableMethods();
	
	@FindBy(how = How.ID, using = "whatsapp-number")
	WebElement enterPhoneNumberId;
	
	@FindBy(how = How.ID, using = "fullName")
	WebElement enterFullNameId;
	
	
	@FindBy(how = How.ID, using = "password")
	WebElement enterPasswordId;
	
	@FindBy(how = How.ID, using = "login-submit")
	WebElement clickOnRegisterId;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void signUpToTheApplication(String phonenUmber, String fullName, String password) throws InterruptedException {
		enterPhoneNumberId.sendKeys(phonenUmber);
		reuse.pageToLoad(3);
		enterFullNameId.sendKeys(fullName);
		reuse.sleep(3);
		String enterPassword=reuse.decodePassword(password);
		enterPasswordId.sendKeys(enterPassword);
		reuse.sleep(3);
		clickOnRegisterId.click();
		reuse.sleep(3);
		
	}
}
