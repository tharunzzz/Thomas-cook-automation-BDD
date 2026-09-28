package pages;

import org.openqa.selenium.By;

import utils.Base;
import utils.WebDriverHelper;

public class Dropdown {
	public static By oneCard = By.xpath("//ul//li[text()='One Currency Card']");

	public static By selectProduct = By.xpath("//ul//li[text()='Select Product']");

	public static By combo = By.xpath("//ul//li[text()='Combo']");

	public static By multiCurrencycard = By.xpath("//ul//li[text()='MultiCurrency card']");

	public static By studyBuddyCard = By.xpath("//ul//li[text()='Study Buddy Card']");

	public static By cash = By.xpath("//ul//li[text()='Cash']");

	public static void selectDropdown(String value) {

		WebDriverHelper help = new WebDriverHelper(Base.driver);

		if (value.equalsIgnoreCase("One Currency Card")) {

			help.clickOnElement(oneCard);

		}

		else if (value.equalsIgnoreCase("Select Product")) {

			help.clickOnElement(selectProduct);

		}

		else if (value.equalsIgnoreCase("Combo")) {

			help.clickOnElement(combo);

		}

		else if (value.equalsIgnoreCase("MultiCurrency card")) {

			help.clickOnElement(multiCurrencycard);

		}

		else if (value.equalsIgnoreCase("Study Buddy card")) {

			help.clickOnElement(studyBuddyCard);

		}

		else {

			help.clickOnElement(cash);

		}

	}

}
