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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Login Page Objects/usernameField'), username)

WebUI.setEncryptedText(findTestObject('Login Page Objects/passwordField'), password)

WebUI.click(findTestObject('Login Page Objects/loginButton'))

WebUI.verifyElementVisible(findTestObject('Login Page Objects/productsBanner'))

WebUI.click(findTestObject('Home Page Objects/product1_backpack'))

WebUI.click(findTestObject('Home Page Objects/product2_jacket'))

WebUI.verifyElementText(findTestObject('Home Page Objects/checkout_Cart'), '2')

WebUI.click(findTestObject('Home Page Objects/checkout_Cart'))

WebUI.click(findTestObject('Cart Page Objects/checkout button'))

WebUI.setText(findTestObject('Cart Page Objects/firstname Field'), '')

WebUI.setText(findTestObject('Cart Page Objects/lastname Field'), 'Testing')

WebUI.setText(findTestObject('Cart Page Objects/zipCode field'), '210800')

WebUI.click(findTestObject('Cart Page Objects/continue button'))

WebUI.verifyElementText(findTestObject('Cart Page Objects/error popup'), 'Error: First Name is required')

WebUI.closeBrowser()

