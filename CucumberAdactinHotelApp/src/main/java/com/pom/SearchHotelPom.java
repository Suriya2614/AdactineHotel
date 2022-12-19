package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPom {
	
	public static WebDriver driver;

	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomtype;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement noofrooms;

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkindate;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkoutdate;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultsperroom;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childrenperroom;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement search;

	public SearchHotelPom(WebDriver driver) {

	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultsperroom() {
		return adultsperroom;
	}

	public WebElement getChildrenperroom() {
		return childrenperroom;
	}

	public WebElement getSearch() {
		return search;
	}

}
