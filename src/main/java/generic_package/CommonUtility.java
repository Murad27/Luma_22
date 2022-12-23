package generic_package;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base_package.Luma_baseClass;
import junit.framework.Assert;

public class CommonUtility extends Luma_baseClass {
	public static void getActionClick(WebElement ele) {
		Actions click = new Actions(driver);
		click.click(ele).build().perform();
	}

	public static void getJsClick(WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}

	public static void getassert(String expected, String actual) {
		Assert.assertEquals(expected, actual);
		System.out.println("Verify the text" + actual);
	}

	public static void MenModule(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}

	public static void getSelectValue(WebElement ele, String text) {
		Select sc = new Select(ele);
		// sc.deselectByVisibleText(text);
		sc.selectByVisibleText(text);

	}

	public static void getDropDownList(List<WebElement> ele, String text) {
		List<WebElement> option = ele;

		for (WebElement NewValue : option) {
			if (NewValue.getText().contains(text)) {
				NewValue.click();
				// getActionClick(NewValue);
			}
		}
	}

	public static void USeLoopForClick(String xpath) {
		WebElement ele = driver.findElement(By.xpath(xpath));

		for (int i = 0; i <= 299; i++) {
			ele.click();
			break;
		}
		}
	
	public static String getNewAplphabetValue() {
	String data=RandomStringUtils.randomAlphabetic(5);
	//log.info(data);
	System.out.println(data);
	return data;
		
	}
	public static String getNewNumericValue() {
		String data=RandomStringUtils.randomNumeric(10);
		//log.info(data);
		System.out.println(data);
		return data;
		
	}
	public static void main(String[] args) {
		getNewAplphabetValue();
		getNewNumericValue();
		
	}
	}

