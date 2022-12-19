package com.pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public static WebDriver driver;

	private LoginPom p1;
	private SearchHotelPom p2;
	private SelectHotelPom p3;
	private BookHotelPom p4;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;

	}

	public LoginPom getInstanceLoginPom() {

		p1 = new LoginPom(driver);
		return p1;

	}

	public SearchHotelPom getInstanceSearchHotelPom() {

		p2 = new SearchHotelPom(driver);
		return p2;

	}

	public SelectHotelPom getInstanceSelectHotelPom() {

		p3 = new SelectHotelPom(driver);
		return p3;

	}

	public BookHotelPom getInstanceBookHotelPom() {

		p4 = new BookHotelPom(driver);
		return p4;

	}

}
