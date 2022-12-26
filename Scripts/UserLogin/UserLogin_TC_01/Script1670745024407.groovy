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

WebUI.click(findTestObject('Object Repository/Page_Home/i_home_icon-user'))

WebUI.setText(findTestObject('Object Repository/Page_Form Login/input__username'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Form Login/input__password'), password)

WebUI.click(findTestObject('Object Repository/Page_Form Login/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard_My Account/i_dahsboard_icon-user'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dashboard_My Account/p_verificator_Hello inassyarifah22'), 
    'Hello inassyarifah22 (not inassyarifah22? Log out)')

WebUI.closeBrowser()

