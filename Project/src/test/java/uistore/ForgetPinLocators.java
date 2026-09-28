package uistore;

import org.openqa.selenium.By;

public class ForgetPinLocators {
   private By cardnoInput = By.xpath("//input[@id='cardNo']");
	
	
	private By expDate = By.xpath("//input[@id='expDate']");
	
	
	private By pinnoInput = By.xpath("//input[@id='pinNo']");
	
	
	private By proceed = By.xpath("//input[@id='Proceed']");
	
	
	private By verify = By.xpath("//label[@id='error']");
	
	
	
	public By getCardnoInput() {
        return cardnoInput;
    }





	public void setCardnoInput(By cardnoInput) {
        this.cardnoInput = cardnoInput;
    }




	public By getExpDate() {
        return expDate;
    }




	public void setExpDate(By expDate) {
        this.expDate = expDate;
    }




	public By getPinnoInput() {
        return pinnoInput;
    }




	public void setPinnoInput(By pinnoInput) {
        this.pinnoInput = pinnoInput;
    }




	public By getProceed() {
        return proceed;
    }




	public void setProceed(By proceed) {
        this.proceed = proceed;
    }




	public By getVerify() {
        return verify;
    }




	public void setVerify(By verify) {
        this.verify = verify;
    }

	
}
