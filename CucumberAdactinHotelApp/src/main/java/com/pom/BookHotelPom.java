package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPom {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastname;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement billaddress;

	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement ccno;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cctype;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expmon;

	public BookHotelPom (WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBilladdress() {
		return billaddress;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmon() {
		return expmon;
	}

	public WebElement getExpyr() {
		return expyr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expyr;

	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv;

	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement booknow;

}
