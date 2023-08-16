package app.chatdaddy.tech.Utils;

import java.util.concurrent.TimeUnit;

import org.apache.hc.client5.http.utils.Base64;

public class ReusableMethods {
	
	public void pageToLoad(int i) {
		Driver.driver.manage().timeouts().implicitlyWait(i*1000, TimeUnit.SECONDS);
		}
	
	public void sleep(int i) throws InterruptedException {
		Thread.sleep(i*1000);
		
	}
	
	public String decodePassword(String password) {
		byte[] decodeBytes=Base64.decodeBase64(password);
		String deCodeString=new String(decodeBytes);
		return deCodeString;
		
	}

}
