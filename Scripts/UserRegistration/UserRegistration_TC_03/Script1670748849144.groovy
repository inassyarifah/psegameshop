import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.webURL)

WebUI.click(findTestObject('Page_Home/i_home_icon-user'))

WebUI.selectOptionByValue(findTestObject('Page_Form Register/select_favoriteGenre'), 'Sports', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Form Register/select_favoriteConsole'), 'Nintendo', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Form Register/select_favoriteHobbiesInterest'), 'Gadgets & Technology', 
    true)

WebUI.click(findTestObject('Page_Form Register/input_gender'))

WebUI.setEncryptedText(findTestObject('Page_Form Register/input__password'), password)

WebUI.setEncryptedText(findTestObject('Page_Form Register/input__confirmpassword'), confirm_password)

WebUI.click(findTestObject('Page_Form Register/button_Register'))

WebUI.verifyElementText(findTestObject('Alert/div_alert_Error Please provide a valid email address'), 
    'Error: Please provide a valid email address.')

WebUI.closeBrowser()

