package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Eclipse IDE\\CucumberAdactinHotelApp\\src\\test\\java\\com\\feature\\AdactinHotelApp.feature", 
				glue = "com.stepdefinition",
				monochrome = true,
				dryRun = false,
				plugin = {"pretty", "html:target/cucumber.html",
						"json:target/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Runner extends BaseClass {

	@BeforeClass

	public static void BrowserLaunch() {

		browser("chrome");

	}

}
