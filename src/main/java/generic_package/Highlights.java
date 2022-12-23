package generic_package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base_package.Luma_baseClass;

public class Highlights extends Luma_baseClass {
	public static void drawBorder(WebElement ele){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='6px solid yellow'",ele );
    }

}
