import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Page_OrangeHRM/input_Username_username'), GlobalVariable.USERNAME)

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Password_password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Page_OrangeHRM/button_Login'))

WebUI.verifyTextPresent('Dashboard', false)

WebUI.closeBrowser()

