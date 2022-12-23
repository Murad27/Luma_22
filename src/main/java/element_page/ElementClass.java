package element_page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_package.Luma_baseClass;
import generic_package.CommonUtility;
import generic_package.Highlights;
import generic_package.WaitHelper;

public class ElementClass extends Luma_baseClass {
	
	
	public ElementClass() {
		PageFactory.initElements(driver, this);
	}
	
//ClickSignInButton

@FindBy(xpath="(//*[@class='authorization-link'])[1]")   
@CacheLookup
private WebElement ClickSignInButton;

public WebElement getClickSignInButton() {
	return ClickSignInButton;
}

//EnterUserName

@FindBy(xpath="(//*[@type='email'])[1]")    
@CacheLookup
private WebElement EnterUserName;

public WebElement getEnterUserName() {
	return EnterUserName;

}

//EnterUserPWD

@FindBy(xpath="(//*[@type='password'])[1]")
@CacheLookup
private WebElement EnterUserPWD;

public WebElement getEnterUserPWD() {
	return EnterUserPWD;
}

//ClickLogInButton

@FindBy(xpath="(//*[@type='submit'])[2]")
@CacheLookup
private WebElement ClickLogInButton;

public WebElement getClickLogInButton() {
	return ClickLogInButton;
}

//LandingPageText

@FindBy(xpath="(//*[text()='Welcome, md Hasan!'])[1]")
@CacheLookup
private WebElement LandingPageText;

public WebElement getLandingPageText() {
	return LandingPageText;
	}

//MenModule

@FindBy(xpath="(//*[text()='Men'])[1]")
@CacheLookup
private WebElement MenModule;

public WebElement getMenModule() {
	return MenModule;
	}

//SelectTops

@FindBy(xpath="(//*[text()='Tops'])[2]")
@CacheLookup
private WebElement SelectTops;

public WebElement getSelectTops() {
	return SelectTops;
}

//SelectJacket

@FindBy(xpath="(//*[text()='Jackets'])[2]")
@CacheLookup
private WebElement SelectJacket;

public WebElement getSelectJacket() {
	return SelectJacket;
}

//SelectJupiterJacket

@FindBy(xpath="(//a[@class='product-item-link'])[3]")
@CacheLookup
private WebElement SelectJupiterJacket;

public WebElement getSelectJupiterJacket() {
	return SelectJupiterJacket;
}

//SelectSize

@FindBy(xpath="(//*[text()='L'])[1]")
@CacheLookup
private WebElement SelectSize;

public WebElement getSelectSize() {
	return SelectSize;
}

//Select color

@FindBy(xpath="(//div[@class='swatch-option color'])[3]")
@CacheLookup
private WebElement Selectcolor;

public WebElement getSelectcolor() {
	return Selectcolor;
}

//SelectQuantity

@FindBy(xpath="//*[@name='qty']")
//@FindBy(xpath="(//input[@type='number'])[2]")
@CacheLookup
private WebElement SelectQuantity;

public WebElement getSelectQuantity() {
	return SelectQuantity;
}

//AddToCard

@FindBy(xpath="(//button[@type='submit'])[2]")
//@FindBy(xpath="//*[text()='Add to Cart']")
@CacheLookup
private WebElement AddToCard;

public WebElement getAddToCard() {
	return AddToCard;
}

//ShoppingCart

@FindBy(xpath="//*[text()='shopping cart']")
@CacheLookup
private WebElement ShoppingCart ;

public WebElement getShoppingCart() {
	return ShoppingCart ;
}

//ProceedToCheckout

@FindBy(xpath="(//*[text()='Proceed to Checkout'])[2]")
@CacheLookup
private WebElement ProceedToCheckout ;

public WebElement getProceedToCheckout() {
	return ProceedToCheckout ;
}

@FindBy(xpath="//*[text()='New Address']")
//@FindBy(xpath="(//button[@type='button'])[5]")
@CacheLookup
private WebElement NewAddress ;

public WebElement getNewAddress() {
	return NewAddress ;
}
//Address:

	
@FindBy(xpath="(//input[@type='text'])[2]")
@CacheLookup
private WebElement FirstName ;

public WebElement getFirstName() {
	return FirstName ;
}

@FindBy(xpath="(//input[@type='text'])[3]")
@CacheLookup
private WebElement LastName ;

public WebElement getLastName() {
	return LastName  ;
}

@FindBy(xpath="(//input[@type='text'])[4]")
@CacheLookup
private WebElement Company ;

public WebElement getCompany() {
	return Company ;
}
@FindBy(xpath="(//input[@type='text'])[5]")
@CacheLookup
private WebElement StreetAddress ;

public WebElement getStreetAddress() {
	return StreetAddress ;
}

@FindBy(xpath="(//input[@type='text'])[8]")
@CacheLookup
private WebElement City ;

public WebElement getCity() {
	return City ;
}
@FindBy(xpath="(//*[@class='select'])[1]")           //Use Select Class
//@FindBy(xpath="(//select[@class='select'])[1]")
@CacheLookup
private WebElement StateOrProvince ;

public WebElement getStateOrProvince() {
	return StateOrProvince ;
}

@FindBy(xpath="(//*[@class='select'])[1]")           //Use DropDown Class
@CacheLookup
private List<WebElement> DropDownStateOrProvince;

public List<WebElement> getDropDownStateOrProvince() {
	return DropDownStateOrProvince ;
}






@FindBy(xpath="(//input[@type='text'])[10]")
@CacheLookup
private WebElement ZipOrPostalCode  ;

public WebElement getZipOrPostalCode() {
	return ZipOrPostalCode;
}
@FindBy(xpath="(//select[@class='select'])[2]")
@CacheLookup
private WebElement Country ;

public WebElement getCountry() {
	return Country ;
}

@FindBy(xpath="(//input[@type='text'])[11]")
@CacheLookup
private WebElement PhoneNumber ;

public WebElement getPhoneNumber() {
	return PhoneNumber ;
}

@FindBy(xpath="//span[text()='Ship here']")
@CacheLookup
private WebElement Shiphere ;

public WebElement getShiphere() {
	return Shiphere ;
}
public void ShippingAddressDetails() {
	
	//First Name :-
	
	log.info("User able to  the Select FirstName");
	Highlights.drawBorder(getFirstName());
	getFirstName().clear();
	WaitHelper.SeleniumWait(getFirstName(), 30);
	//getFirstName().sendKeys("Md Mahamudul Hasan");                             //Regular One
	getFirstName().sendKeys(CommonUtility.getNewAplphabetValue()+ "@gmail.com"); //RandomString Use(C.Utility.Class) 
	
	
	//Last Name :-
	
	log.info("User able to  the Select LastName");
	Highlights.drawBorder(getLastName());
	getLastName().clear();
	WaitHelper.SeleniumWait(getLastName(), 30);
	//getLastName().sendKeys("Murad");                             //Regular One
	getLastName().sendKeys(CommonUtility.getNewAplphabetValue()); //RandomString Use(C.Utility.Class) 
	
	
	
	//Company Name:-
	
	log.info("User able to  the Select Company");
	Highlights.drawBorder(getCompany());
	getCompany().clear();
	WaitHelper.SeleniumWait(getCompany(), 30);
	//getCompany().sendKeys("com.usa");                            //Regular One
	getCompany().sendKeys(CommonUtility.getNewAplphabetValue());  //RandomString Use(C.Utility.Class)
	
	
	//Street Name:-
	
	
	log.info("User able to  the Select StreetAddress");
	Highlights.drawBorder(getStreetAddress());
	getStreetAddress().clear();
	WaitHelper.SeleniumWait(getStreetAddress(), 30);
	//getStreetAddress().sendKeys("109");                                        //Regular One
	getStreetAddress().sendKeys("109"  +CommonUtility.getNewAplphabetValue());  //RandomString Use(C.Utility.Class)
	
	
	//City Name:-
	
	
	log.info("User able to  the Select city");
	Highlights.drawBorder(getCity());
	getCity().clear();
	WaitHelper.SeleniumWait(getCity(), 30);
	//getCity().sendKeys("NewYork");                              //Regular One
	getCity().sendKeys(CommonUtility.getNewAplphabetValue());    //RandomString Use(C.Utility.Class)
	
	
	
	//StateOrProvince Name:-
	
	
	log.info("User able to  the Select StateOrProvince");
	Highlights.drawBorder(getStateOrProvince());
	WaitHelper.SeleniumWait(getStateOrProvince(), 30);
	//CommonUtility.getSelectValue(getStateOrProvince(),"New York");  //Use Select Class
	CommonUtility.getDropDownList(getDropDownStateOrProvince(),"New York");
	
	//ZipOrPostalCode Name:-
	
	log.info("User able to  the Select ZipOrPostalCode");
	Highlights.drawBorder(getZipOrPostalCode());
	getZipOrPostalCode().clear();
	WaitHelper.SeleniumWait(getZipOrPostalCode(), 30);
	//getZipOrPostalCode().sendKeys("11432");                               //Regular One
	getZipOrPostalCode().sendKeys(CommonUtility.getNewNumericValue());     //RandomString Use(C.Utility.Class)
	
	
	//Country Name:-
	
	
	log.info("User able to  the Select Country");
	Highlights.drawBorder(getCountry());
	WaitHelper.SeleniumWait(getCountry(), 30);
	CommonUtility.getSelectValue(getCountry(),"United States");
	
	
	//PhoneNumber Name:-
	
	
	log.info("User able to  the Select PhoneNumber");
	Highlights.drawBorder(getPhoneNumber());
	getPhoneNumber().clear();
	WaitHelper.SeleniumWait(getPhoneNumber(), 30);
	//getPhoneNumber().sendKeys("6666666666");                            //Regular One
	getPhoneNumber().sendKeys(CommonUtility.getNewNumericValue());       //RandomString Use(C.Utility.Class)
	
	
	
	//ShipHere:-
	
	
	log.info("User able to  the Select Shiphere");
	Highlights.drawBorder(getShiphere());
	WaitHelper.SeleniumWait(getShiphere(), 30);
	CommonUtility.getActionClick(getShiphere());
	
}

public void getLogIn() {
	
	//SignIn button:-
	
	log.info("User able to click signIn button");
	Highlights.drawBorder(getClickSignInButton());
	WaitHelper.SeleniumWait(getClickSignInButton(),30);
	CommonUtility.getActionClick(getClickSignInButton());
	
	//UserName:-
	
	log.info("User able to Enter valid UserName");
	Highlights.drawBorder(getEnterUserName());
	WaitHelper.SeleniumWait(getEnterUserName(),30);
	getEnterUserName().sendKeys(prop.getProperty("userName"));
	
	//UserPassword:-
	
	
	log.info("User able to Enter valid UserPassword");
	Highlights.drawBorder(getEnterUserPWD());
	WaitHelper.SeleniumWait(getEnterUserPWD(),30);
	getEnterUserPWD().sendKeys(prop.getProperty("passWord"));
	
	//LogIn button:-
	
	
	log.info("User able to click LogIn button");
	Highlights.drawBorder(getClickLogInButton());
	WaitHelper.SeleniumWait(getClickLogInButton(),30);
	CommonUtility.getActionClick(getClickLogInButton());
	
	
	//Verify the Text:-
	
	log.info("User able verify the text");
	Highlights.drawBorder(getLandingPageText());
	WaitHelper.SeleniumWait(getLandingPageText(),30);
	CommonUtility.getActionClick(getLandingPageText());
	
}
}
