package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.objectproperty.ObjectRepo;
import com.util.BaseMethods;
import com.util.Constent;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseMethods {
	ObjectRepo l = new ObjectRepo();
//	public static WebDriver driver;

	@Given("The HasTag webpages is opened")
	public void the_has_tag_webpages_is_opened() {
		try {
			loadurl();

		} catch (Exception e) {
			System.out.println("Browser not Launched ");
		}
	}

	@When("user enter user name criditional")
	public void user_enter_user_name_criditional() {
		try {
			driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys(Constent.NAME);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Then("user enter mail ID criditional")
	public void user_enter_mail_id_criditional() {
		try {
			driver.findElement(By.xpath("(//input[@placeholder='Enter your email'])[1]")).sendKeys(Constent.MAIL);

		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Then("user enter mobile number criditional")
	public void user_enter_mobile_number_criditional() {
		try {
			driver.findElement(By.xpath("//input[@placeholder='Enter your phone']")).sendKeys(Constent.NUMBER);
		} catch (Exception e) {

		}
	}

	@Then("user enter selfdetails criditional")
	public void user_enter_selfdetails_criditional() {
		try {
			driver.findElement(By.xpath("//textarea[@placeholder='Briefly Describe Yourself']"))
					.sendKeys(Constent.SELF);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Then("user upload the file")
	public void user_upload_the_file() {
		try {
			driver.findElement(By.xpath("//input[@id='inputFile']")).sendKeys(Constent.LOCATION);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Then("user click the apply button")
	public void user_click_the_apply_button() {
		try {
			WebElement apply = driver.findElement(By.xpath("//button[text()='APPLY NOW']"));
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].click();", apply);

		} catch (NullPointerException e) {

			e.printStackTrace();
		}
	}

	@Then("To check the error message")
	public void to_check_the_error_message() {
		try {
			WebElement text = driver.findElement(By.xpath("//p[@class='text-danger']"));
			String text1 = text.getText();
			System.out.println(text1);

		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Then("User get the location details")
	public void user_get_the_location_details() {
		try {
			driver.findElement(By.xpath("//a[text()='Contact Us ']")).click();
			WebElement add = driver.findElement(By.xpath("(//h3[@class='address-text'])[1]"));
			String add1 = add.getText();
			System.out.println(add1);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Then("user can refresh the page using logo")
	public void user_can_refresh_the_page_using_logo() {

		driver.findElement(By.xpath("(//img[@id='logo'])[1]")).click();
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
		driver.quit();
	}

}
