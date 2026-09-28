package uistore;

import org.openqa.selenium.By;

public class KnowyourCardBalanceLocators {
	 
	
	private By loginType = By.xpath("//select[@id='loginType']");
	
	
	private By webLoginPin = By.xpath("//select[@id='loginType']//option[text()='Web Login PIN']");
	
	
	private By usernameInput = By.xpath("(//input[@id='userName'])[2]");
	
	
	private By pinInput = By.xpath("//input[@id='answer']");
	
	
	private By forgotPin = By.xpath("//input[@id='forgotPassBtn']");
	
	
	
	
	
	//getters and setters
	public By getLoginType() {
	        return loginType;
	    }

	    
	
	public void setLoginType(By loginType) {
	        this.loginType = loginType;
	    }

	
	
	public By getWebLoginPin() {
	        return webLoginPin;
	    }

	
	
	public void setWebLoginPin(By webLoginPin) {
	        this.webLoginPin = webLoginPin;
	    }

	
	
	public By getUsernameInput() {
	        return usernameInput;
	    }

	
	
	public void setUsernameInput(By usernameInput) {
	        this.usernameInput = usernameInput;
	    }

	
	
	public By getPinInput() {
	        return pinInput;
	    }

	
	
	public void setPinInput(By pinInput) {
	        this.pinInput = pinInput;
	    }

	
	
	public By getForgotPin() {
	        return forgotPin;
	    }

	
	
	public void setForgotPin(By forgotPin) {
	        this.forgotPin = forgotPin;
	    }

	
	
	

}
