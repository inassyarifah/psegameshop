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

WebUI.click(findTestObject('Object Repository/Page_Form Login/a_Lost your password'))

WebUI.setText(findTestObject('Object Repository/Page_Reset Password/input_Username or email_user_login'), 
    username)

WebUI.click(findTestObject('Object Repository/Page_Reset Password/button_Reset password'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Reset Password/div_Password reset email has been sent'), 
    'Password reset email has been sent.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Reset Password/p_A password reset email has been sent to t_c3a80e'), 
    'A password reset email has been sent to the email address on file for your account, but may take several minutes to show up in your inbox. Please wait at least 10 minutes before attempting another reset.')

WebUI.closeBrowser()

