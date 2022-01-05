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

//open browser 

WebUI.openBrowser('')

// Navigate to URl

WebUI.navigateToUrl('https://portal-buzz.asgard.capiter.io/superlogin')

// click to entermailmobiletextbox

WebUI.click(findTestObject('Object Repository/Capiter_Dashboard_OrderTab/Page_Capiter Dashboard/input_Email  Mobile_txtMobileEmail'))

//set user name 

WebUI.setText(findTestObject('Object Repository/Capiter_UsersTab_User_Manual/Page_Capiter Dashboard/input_Email  Mobile_txtMobileEmail'),  '01001644120')


// click to enter password text box

WebUI.click(findTestObject('Object Repository/Capiter_UsersTab_User_Manual/Page_Capiter Dashboard/input_Email  Mobile_txtPassword'))


// Set Password

WebUI.setText(findTestObject
	('Object Repository/Capiter_UsersTab_User_Manual/Page_Capiter Dashboard/input_Email  Mobile_txtPassword'),'aeHFOx8jV/A=')

// click on login

WebUI.click(findTestObject('Object Repository/Capiter_UsersTab_User_Manual/Page_Capiter Dashboard/button_login'))



WebUI.closeBrowser()