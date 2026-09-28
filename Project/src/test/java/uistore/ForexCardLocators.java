package uistore;

import org.openqa.selenium.By;

public class ForexCardLocators {

	private By productDropdown = By.xpath("(//div[@class='selectric'])[1]");

	private By oneCard = By.xpath("//ul//li[text()='One Currency Card']");

	private By currencyDropdown = By.xpath("//p[text()='Select Currency']");

	private By usDollar = By.xpath("//ul//li[text()='US Dollar']");

	private By inrInput = By.xpath("//input[@placeholder='Amount in INR']");

	private By mobileNoInput = By.xpath("//input[@placeholder='Mobile No.']");

	private By emailInput = By.xpath("//input[@placeholder='Email Address']");

	private By getQuote = By.xpath("(//button[@id='getquote'])[1]");

	private By knowYourCard = By.xpath("(//a[@href='https://www.borderlessprepaid.com/tccustomer/loginuser'])[2]");

	public By forexcard = By.xpath("(//a[@href='/foreign-exchange/travel-prepaid-forex-cards'])[2]");
	public By cardverification = By.xpath("//h1[text()='Travel Prepaid Forex Card']");

	public By forexAmount = By.xpath("//input[@placeholder='Forex Amount']");

	public By studyAbroad = By.xpath("//a[@href='/foreign-exchange/online-money-transfer']");
	public By productSA = By.xpath("(//div[@class='selectric'])[1]");
	public By sendExpenses = By.xpath("//ul//li[text()='Send Living Expenses']");
	public By sACurrency = By.xpath("(//div[@class='selectric'])[2]");

	public By forexEducation = By.xpath("//a[@href='/study-buddy']");
	public By lounge = By.xpath("//a[@href='#panel1']");

	public By retriverQuote = By.xpath("(//span[@class='edit-btn'])[2]");

	public By moblieNoInput = By.xpath("//input[@placeholder='Mobile']");

	public By learnMore = By.xpath("(//a[@href='/foreign-exchange/borderless-prepaid-multicurrency-card'])[4]");
	public By emailofLearnMore = By.xpath("//input[@placeholder='Subscribe to our updates/offers']");
	public By submitbtn = By.xpath("//a[@id='newsletterSubmit']");

	public By navigateButton = By.xpath("(//button[@class='owl-next'])[3]");
	public By verifyCustomer = By.xpath("(//span[text()='K. Jayasankar'])[2]");

	public By sendMoney = By.xpath("//a[@href='/foreign-exchange/receive-money-in-india']");
	public By payInCash = By.xpath("//a[@href='#collapseSix']");

	public By linkedin = By.xpath("//a[@href='https://in.linkedin.com/company/thomas-cook-india-limited']");
	public By verifySignin = By
			.xpath("//button[@class='sign-in-modal__outlet-btn cursor-pointer btn-md btn-primary btn-secondary']");

	public By thomasCookInfo = By.xpath("//a[@href='#menu11']");

	public By thomasCookInfoVerification = By.xpath("//a[text()='About the Site']");

	public By internationalHolidays = By.xpath("//a[@href='#menu2']");
	public By packages = By.xpath("(//a[@href='/holidays/international-tour-packages'])[2]");
	public By holidayPageVerification = By.xpath("//h2[@class='iWantholiday']");

	public By exchange = By.xpath("//a[@href='#menu4']");
	public By Bangalore = By.xpath("//a[@href='/foreign-exchange/currency-exchange-in-bangalore']");

	public By BangaloreVerify = By.xpath("//h1[@class='ttl']");

	public By androidVerify = By.xpath("//span[text()='google_logo Play']");

	public By distraction = By.xpath("//label[text()='Forex Amount']");

	public By recevingAmount = By.xpath("//span[text()='Receiving amount']");
	public By paycashverify = By.xpath("//a[@href='#collapseSix']");
	public By longueverify = By.xpath("//li[text()='Minimum Load Value 3000 USD eqv.']");
	
	public By gitCard = By.xpath("(//a[@id='navbarDropdown'])[3]");
	public By offers = By.xpath("(//a[@href='/product-offers/forex-offers'])[2]");

	// getters and setters
	public By getProductDropdown() {
		return productDropdown;
	}

	public void setProductDropdown(By productDropdown) {
		this.productDropdown = productDropdown;
	}

	public By getOneCard() {
		return oneCard;
	}

	public void setOneCard(By oneCard) {
		this.oneCard = oneCard;
	}

	public By getCurrencyDropdown() {
		return currencyDropdown;
	}

	public void setCurrencyDropdown(By currencyDropdown) {
		this.currencyDropdown = currencyDropdown;
	}

	public By getUsDollar() {
		return usDollar;
	}

	public void setUsDollar(By usDollar) {
		this.usDollar = usDollar;
	}

	public By getInrInput() {
		return inrInput;
	}

	public void setInrInput(By inrInput) {
		this.inrInput = inrInput;
	}

	public By getMobileNoInput() {
		return mobileNoInput;
	}

	public void setMobileNoInput(By mobileNoInput) {
		this.mobileNoInput = mobileNoInput;
	}

	public By getEmailInput() {
		return emailInput;
	}

	public void setEmailInput(By emailInput) {
		this.emailInput = emailInput;
	}

	public By getGetQuote() {
		return getQuote;
	}

	public void setGetQuote(By getQuote) {
		this.getQuote = getQuote;
	}

	public By getKnowYourCard() {
		return knowYourCard;
	}

	public void setKnowYourCard(By knowYourCard) {
		this.knowYourCard = knowYourCard;
	}

}
