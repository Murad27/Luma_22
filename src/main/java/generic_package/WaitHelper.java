package generic_package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base_package.Luma_baseClass;

public class WaitHelper extends Luma_baseClass {
	public static void SeleniumWait(WebElement ele, long time) {
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

}
