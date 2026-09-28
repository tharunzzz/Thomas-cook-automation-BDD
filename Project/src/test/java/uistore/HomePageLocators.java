package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {
	
	 private By forexHover = By.xpath("(//a[@href='/foreign-exchange'])[1]");
	 
	 private By fExchange = By.xpath("(//a[@href='/foreign-exchange/buy-forex-online'])[1]");
	 
		public By internationalUnivercity=By.xpath("(//a[@href='/international-money-transfer'])[1]");
		
		public By android=By.xpath("(//a[@href='https://play.google.com/store/apps/details?id=com.thomascook.forexapp'])[1]");
		
		
	 public static By xopx=By.xpath("");
	 // Getters and Setters
	    public By getForexHover() {
	        return forexHover;
	    }

	    
	    public void setForexHover(By forexHover) {
	        this.forexHover = forexHover;
	    }

	    
	    public By getFExchange() {
	        return fExchange;
	    }

	    
	    public void setFExange(By fExange) {
	        this.fExchange = fExange;
	    }
	    
}
