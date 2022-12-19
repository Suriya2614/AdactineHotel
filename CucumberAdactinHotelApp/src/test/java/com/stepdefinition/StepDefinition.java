package com.stepdefinition;

import com.baseclass.BaseClass;
import com.pom.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("User to launch the Url")
	public void user_to_launch_the_url() {

		url("https://adactinhotelapp.com/");
	}

	@When("User to give the username")
	public void user_to_give_the_username() {

		pom.getInstanceLoginPom().getUsername().sendKeys("Suriyajaya");
	}

	@When("User to give the password")
	public void user_to_give_the_password() {

		pom.getInstanceLoginPom().getPassword().sendKeys("Qwerty@123");
	}

	@When("User to click the login")
	public void user_to_click_the_login() {

		pom.getInstanceLoginPom().getLogin().click();

	}

	@When("User to select the location")
	public void user_to_select_the_location() {

		selectdropdown(pom.getInstanceSearchHotelPom().getLocation(), "byvalue", "Sydney");
	}

	@When("User to select the hotels")
	public void user_to_select_the_hotels() {

		selectdropdown(pom.getInstanceSearchHotelPom().getHotels(), "byvalue", "Hotel Sunshine");
	}

	@When("User to select the room type")
	public void user_to_select_the_room_type() {

		selectdropdown(pom.getInstanceSearchHotelPom().getRoomtype(), "byvalue", "Standard");

	}

	@When("User to select the no of rooms")
	public void user_to_select_the_no_of_rooms() {

		selectdropdown(pom.getInstanceSearchHotelPom().getNoofrooms(), "byvalue", "2");

	}

	@When("User to give the checkin details")
	public void user_to_give_the_checkin_details() {

		pom.getInstanceSearchHotelPom().getCheckindate().sendKeys("19/11/2022");
	}

	@When("User to give the checkout details")
	public void user_to_give_the_checkout_details() {

		pom.getInstanceSearchHotelPom().getCheckoutdate().sendKeys("20/11/2022");

	}

	@When("User to select the adults per room")
	public void user_to_select_the_adults_per_room() {

		selectdropdown(pom.getInstanceSearchHotelPom().getAdultsperroom(), "byvalue", "2");
	}

	@When("User to select the childrens per room")
	public void user_to_select_the_childrens_per_room() {

		selectdropdown(pom.getInstanceSearchHotelPom().getChildrenperroom(), "byvalue", "2");

	}

	@When("User to select the search")
	public void user_to_select_the_search() {

		pom.getInstanceSearchHotelPom().getSearch().click();
	}

	@When("User to select the radio button")
	public void user_to_select_the_radio_button() {

		pom.getInstanceSelectHotelPom().getRadiobutton().click();
	}

	@When("User to select the continue")
	public void user_to_select_the_continue() {

		pom.getInstanceSelectHotelPom().getContinu().click();

	}

	@When("User to give the first name")
	public void user_to_give_the_first_name() {

		pom.getInstanceBookHotelPom().getFirstname().sendKeys("Suriya");
	}

	@When("User to give the last name")
	public void user_to_give_the_last_name() {

		pom.getInstanceBookHotelPom().getLastname().sendKeys("SA");
	}

	@When("User to give the bill address")
	public void user_to_give_the_bill_address() {

		pom.getInstanceBookHotelPom().getBilladdress().sendKeys("SA appartments");
	}

	@When("User to give the credit card no")
	public void user_to_give_the_credit_card_no() {

		pom.getInstanceBookHotelPom().getCcno().sendKeys("1234567890123456");

	}

	@When("User to select credit card type")
	public void user_to_select_credit_card_type() throws InterruptedException {
//		Thread.sleep(3000);
		selectdropdown(pom.getInstanceBookHotelPom().getCctype(), "byvalue", "AMEX");
	}

	@When("User to select expiry month")
	public void user_to_select_expiry_month() {

		selectdropdown(pom.getInstanceBookHotelPom().getExpmon(), "byvalue", "2");
	}

	@When("User to select expiry year")
	public void user_to_select_expiry_year() {

		selectdropdown(pom.getInstanceBookHotelPom().getExpyr(), "byvalue", "2022");
	}

	@When("User to give credit card cvv number")
	public void user_to_give_credit_card_cvv_number() {

		pom.getInstanceBookHotelPom().getCvv().sendKeys("123");
	}

	@When("User to click booknow")
	public void user_to_click_booknow() {

		pom.getInstanceBookHotelPom().getBooknow().click();
	}

}
