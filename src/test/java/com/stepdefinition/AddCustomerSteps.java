package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerSteps {
	static WebDriver driver;
	@Given("user should be in the telecom home page")
	public void user_should_be_in_the_telecom_home_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Srilakshmi\\Cucumber10\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
	  driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("user enters all the fields with valid data")
	public void user_enters_all_the_fields_with_valid_data() {
		    driver.findElement(By.xpath("//label[@for='done']")).click();
		    driver.findElement(By.id("fname")).sendKeys("Rajasri");
		    driver.findElement(By.id("lname")).sendKeys("lakshmi");
		    driver.findElement(By.id("email")).sendKeys("rajasri@gmail.com");
		    driver.findElement(By.name("addr")).sendKeys("Chennai");
		    driver.findElement(By.id("telephoneno")).sendKeys("8734568734");
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	   driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

	@Then("user should be displayed customer id is generated")
	public void user_should_be_displayed_customer_id_is_generated() {
	    driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed();
	}
//1D list
	@When("user enters all the fields with valid data.")
	public void user_enters_all_the_fields_with_valid_data(DataTable custData) {
		List<String> datas = custData.asList(String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get(0));
		driver.findElement(By.id("lname")).sendKeys(datas.get(1));
		driver.findElement(By.id("email")).sendKeys(datas.get(2));
		driver.findElement(By.name("addr")).sendKeys(datas.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get(4));
			}
	//1D Map
	@When("user enters all the fields with valid datas")
	public void user_enters_all_the_fields_with_valid_datas(DataTable custMap) {
		Map<String,String> data = custMap.asMap(String.class,String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(data.get("lname"));
		driver.findElement(By.id("email")).sendKeys(data.get("email"));
		driver.findElement(By.name("addr")).sendKeys(data.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get("phno"));
	}
	//1D_list_AddTariff
	@Given("user click on add tariff button")
	public void user_click_on_add_tariff_button() {
	    driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("user enters all the fields with valid dataA")
	public void user_enters_all_the_fields_with_valid_dataA(DataTable tList) {
		List<String> data1 = tList.asList(String.class);
		driver.findElement(By.id("rental1")).sendKeys(data1.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(data1.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(data1.get(2));
		driver.findElement(By.name("sms_pack")).sendKeys(data1.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(data1.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(data1.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(data1.get(6));
	}
	@When("user clicks on submit buttonA")
	public void user_clicks_on_submit_buttonA() {
	   driver.findElement(By.xpath("//input[@value='submit']")).click();
	}

	@Then("user should be displayed home is generated")
	public void user_should_be_displayed_home_is_generated() {
	driver.findElement(By.xpath("(//a[text()='Home'])[1]")).isDisplayed();
	}
	//1D_Map_AddTariff
	@When("user enters all the fields with valid dataB")
	public void user_enters_all_the_fields_with_valid_dataB(DataTable tMap) {
		Map<String,String> data2 = tMap.asMap(String.class,String.class);
		driver.findElement(By.id("rental1")).sendKeys(data2.get("MonRen"));
		driver.findElement(By.id("local_minutes")).sendKeys(data2.get("locMin"));
		driver.findElement(By.id("inter_minutes")).sendKeys(data2.get("IntMin"));
		driver.findElement(By.name("sms_pack")).sendKeys(data2.get("Sms"));
		driver.findElement(By.id("minutes_charges")).sendKeys(data2.get("locChrg"));
		driver.findElement(By.id("inter_charges")).sendKeys(data2.get("IntChrg"));
		driver.findElement(By.id("sms_charges")).sendKeys(data2.get("SmsChrg"));
	}
	@When("user clicks on submit buttonB")
	public void user_clicks_on_submit_buttonB() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@Then("user should be displayed home is generatedB")
	public void user_should_be_displayed_home_is_generatedB() {
		driver.findElement(By.xpath("(//a[text()='Home'])[1]")).isDisplayed();
	}
	@When("user enters all the fields with valid dataC")
	public void user_enters_all_the_fields_with_valid_dataC(DataTable t1List) {
		List<List<String>> data3 = t1List.asLists(String.class);
		driver.findElement(By.id("rental1")).sendKeys(data3.get(1).get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(data3.get(1).get(3));
		driver.findElement(By.id("inter_minutes")).sendKeys(data3.get(0).get(5));
		driver.findElement(By.name("sms_pack")).sendKeys(data3.get(2).get(2));
		driver.findElement(By.id("minutes_charges")).sendKeys(data3.get(1).get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(data3.get(0).get(6));
		driver.findElement(By.id("sms_charges")).sendKeys(data3.get(2).get(1));
	}
	@When("user enters all the fields with valid dataD")
	public void user_enters_all_the_fields_with_valid_dataD(DataTable t1Map) {
		List<Map<String,String>> data4 = t1Map.asMaps(String.class,String.class);
		driver.findElement(By.id("rental1")).sendKeys(data4.get(2).get("MonRen"));
		driver.findElement(By.id("local_minutes")).sendKeys(data4.get(1).get("locMin"));
		driver.findElement(By.id("inter_minutes")).sendKeys(data4.get(0).get("IntMin"));
		driver.findElement(By.name("sms_pack")).sendKeys(data4.get(2).get("Sms"));
		driver.findElement(By.id("minutes_charges")).sendKeys(data4.get(0).get("locChrg"));
		driver.findElement(By.id("inter_charges")).sendKeys(data4.get(1).get("IntChrg"));
		driver.findElement(By.id("sms_charges")).sendKeys(data4.get(2).get("SmsChrg"));
	}
	}


