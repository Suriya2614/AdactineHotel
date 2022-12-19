package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPom {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radiobutton;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continu;

	public SelectHotelPom(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinu() {
		return continu;
	}

}
