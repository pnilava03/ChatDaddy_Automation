package app.chatdaddy.tech.Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import app.chatdaddy.tech.POM.LoginPage;
import app.chatdaddy.tech.Utils.Driver;
import app.chatdaddy.tech.Utils.ReusableMethods;

public class LoginTest {
	
	private Properties prop= new Properties();
	ReusableMethods reuse= new ReusableMethods();
	
	{
		try {
			prop.load(new FileInputStream("./resources/test.properties"));
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}
	
	@BeforeMethod
	public void setup() {
		Driver.launchBrowser("chrome");
		Driver.driver.get(prop.getProperty("AppURL"));
		reuse.pageToLoad(5);
		
	}
	
	@AfterMethod
	public void closeApplication() {
		Driver.closeBrowser();
	}
	
	@Test
	public void testM() throws InterruptedException {
	LoginPage loginPage= new LoginPage(Driver.driver);
	loginPage.signUpToTheApplication(prop.getProperty("EnterPhoneNumber"),prop.getProperty("EnterFullName"),prop.getProperty("EnterPassword"));
	}

}
