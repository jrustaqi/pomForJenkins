package pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public int generateRandomNumber(int boundryNumber) {
		Random random = new Random();
		int generatedNum = random.nextInt(boundryNumber);
		return generatedNum;
	}
	
	public void selectFromDropdown(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
		
	}
}
