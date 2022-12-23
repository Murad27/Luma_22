package step_defination_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base_package.Luma_baseClass;
import element_page.ElementClass;
import generic_package.CommonUtility;
import generic_package.Highlights;
import generic_package.WaitHelper;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class StepDefination extends Luma_baseClass {
	ElementClass pf;
	
	@Given("User already logged in the application and verify the user information on the landing page")
	public void user_already_logged_in_the_application_and_verify_the_user_information_on_the_landing_page() {
		pf=PageFactory.initElements(driver, ElementClass.class); 
		pf.getLogIn();
		
		
		//Verify Landing Page:-
		
		
		String expected=prop.getProperty("Title");
		WaitHelper.SeleniumWait(pf.getLandingPageText(), 30);
		String actual=pf.getLandingPageText().getText();
		log.info("User able to verify landing page");
		CommonUtility.getassert(expected, actual);
	   
	}
	@When("User should be able to select Jupiter All-Weather Trainer jacket from men module")
	public void user_should_be_able_to_select_jupiter_all_weather_trainer_jacket_from_men_module() {
		
		//MouseHover MenModule:-
		
		log.info("User able to mousehover the MenModule");
		Highlights.drawBorder(pf.getMenModule());
		WaitHelper.SeleniumWait(pf.getMenModule(), 30);
		CommonUtility.MenModule(pf.getMenModule());
		
		
		//MouseHover Tops:-
		
		
		log.info("User able to mousehover the Tops");
		Highlights.drawBorder(pf.getSelectTops());
		WaitHelper.SeleniumWait(pf.getSelectTops(), 30);
		CommonUtility.MenModule(pf.getSelectTops());
		
		
		//MouseHover jacket:-
		
		log.info("User able to mousehover the Selectjacket");
		Highlights.drawBorder(pf.getSelectJacket());
		WaitHelper.SeleniumWait(pf.getSelectJacket(), 30);
	    CommonUtility.MenModule(pf.getSelectJacket());
	    CommonUtility.getJsClick(pf.getSelectJacket());
	    
	    
	    //WaitHelper.SeleniumWait(pf.getSelectJupiterJacket(), 30);
		//CommonUtility.getJsClick(pf.getSelectJacket());
		//CommonUtility.getActionClick(pf.getSelectJupiterJacket());
		//WaitHelper.SeleniumWait(pf.getSelectJupiterJacket(), 30);
		//CommonUtility.getJsClick(pf.getSelectJupiterJacket());
	    
	    
	    
		//Verify the SpecialJacket:-
		
		log.info("User able to verify the specialjacket");
		//String expected=prop.getProperty("jacket");
		Highlights.drawBorder(pf.getSelectJupiterJacket());
		WaitHelper.SeleniumWait(pf.getSelectJupiterJacket(), 30);
		CommonUtility.getJsClick(pf.getSelectJupiterJacket());
		//String actual=pf.getSelectJupiterJacket().getText();
		//CommonUtility.getassert(expected, actual);
		
		
		
		
	 
	}
	@When("Verify the jacket name on the Jupiter All-Weather Trainer list")
	public void verify_the_jacket_name_on_the_jupiter_all_weather_trainer_list() {
		
		//SelectSize:-
		
		log.info("User able to mousehover the SelectSize");
		Highlights.drawBorder(pf.getSelectSize());
		WaitHelper.SeleniumWait(pf.getSelectSize(), 30);
		//CommonUtility.getActionClick(pf.getSelectSize());
		CommonUtility.getJsClick(pf.getSelectSize());
		
		
		//SelectColor:-
		
		log.info("User able to mousehover the SelectColor");
		Highlights.drawBorder(pf.getSelectcolor());
		WaitHelper.SeleniumWait(pf.getSelectcolor(), 30);
		//CommonUtility.getActionClick(pf.getSelectcolor());
		CommonUtility.getJsClick(pf.getSelectcolor());
		
		
		//Select quantity:-
		
		
		log.info("User able to  Select quantity");
		Highlights.drawBorder(pf.getSelectQuantity());
		WaitHelper.SeleniumWait(pf.getSelectQuantity(), 30);
		//CommonUtility.getActionClick(pf.getSelectQuantity());
		CommonUtility.getJsClick(pf.getSelectQuantity());
		pf.getSelectQuantity().clear();            //quantity issue solve method
		pf.getSelectQuantity().sendKeys("4");
		
		
		
	}
	@When("User should be able to select the L and purple and {int} then click on the add to cart")
	public void user_should_be_able_to_select_the_l_and_purple_and_then_click_on_the_add_to_cart(Integer int1) {
	 
		//Select AddToCard:-
		
		log.info("User able to the Select AddToCard");
		Highlights.drawBorder(pf.getAddToCard());
		WaitHelper.SeleniumWait(pf.getAddToCard(), 30);
		//CommonUtility.getActionClick(pf.getAddToCard());
		CommonUtility.getJsClick(pf.getAddToCard());
		
		//Select ShoppingCard:-
		
		log.info("User able to the Select ShoppingCard");
		Highlights.drawBorder(pf.getShoppingCart());
		WaitHelper.SeleniumWait(pf.getShoppingCart(), 30);
		CommonUtility.getJsClick(pf.getShoppingCart());
	   
	}
	@When("User should be able to click on the cart and checkout")
	public void user_should_be_able_to_click_on_the_cart_and_checkout() {
		
		
		//Select ProceedToCheckout:-
		
		log.info("User able to  the Select ProceedToCheckout");
		Highlights.drawBorder(pf.getProceedToCheckout());
		WaitHelper.SeleniumWait(pf.getProceedToCheckout(), 30);
		CommonUtility.getJsClick(pf.getProceedToCheckout());
		
	
	   
	}
	@When("User should be able to enter the shipping details and click on the Next")
	public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() {
		
		//NewAddress:-
		
		log.info("User able to  the Select Shipping Address");
		Highlights.drawBorder(pf.getNewAddress());
		WaitHelper.SeleniumWait(pf.getNewAddress(), 30);
		CommonUtility.getJsClick(pf.getNewAddress());
		 
	  
	}
	@When("User should be able to verify the shipping address and place the order")
	public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {
	   
		//ShippingAddressDetails:-
		
		
		
		pf.ShippingAddressDetails();
		
		
	    //WaitHelper.SeleniumWait(pf.getStateOrProvince(), 30);//State perpose
		//CommonUtility.getJsClick(pf.getStateOrProvince());
		
		//WaitHelper.SeleniumWait(pf.getCountry(), 30);
		//CommonUtility.getJsClick(pf.getCountry());

	}
	@Then("User should be able to verify the order number and get text on the screen “Thank you for your purchase!”")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen_thank_you_for_your_purchase() {
	    
	
}
	}
