import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		println "Iam inside Given"
		
		WebUI.openBrowser("")
		
		WebUI.navigateToUrl("https://opensource-demo.orangehrmlive.com/")
	}
	
	@When("user enter (.*) and (.*)")
	public void user_enter_username_and_password(String username, String password) {
		println "I am inside When"
		
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), username)
		
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), password)
	}
	
	@And("click on login butoon")
	public void click_on_login_butoon() {
		println "I am inside And"
		
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login')	)
		
	}
	
	
	
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		println "I am inside Then"
		
		WebUI.verifyTextPresent("Dashboard", false)
		
		WebUI.closeBrowser()
	}
}