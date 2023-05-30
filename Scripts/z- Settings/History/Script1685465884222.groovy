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

Mobile.startExistingApplication('com.google.android.calculator')

Mobile.tap(findTestObject('Calculator/Settings/Settings Options - Button'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Settings/Settings - History/History - Button'), 0)

Mobile.tap(findTestObject('Calculator/Settings/Settings - History/History - Button'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Settings/Settings - History/History - Current expression'), 0)

Mobile.tap(findTestObject('Calculator/Settings/Settings - History/History - Triple Dot'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Settings/Settings - History/History - Clear'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Calculator/Settings/Settings - History/History - Clear'), 0)

Mobile.tap(findTestObject('Calculator/Settings/Settings - History/History - Clear - Dismiss'), 0)

Mobile.verifyElementNotExist(findTestObject('Calculator/Settings/Settings - History/History - Clear - No History'), 0)

Mobile.tap(findTestObject('Calculator/Settings/Settings - History/History - Triple Dot'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Settings/Settings - History/History - Clear'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Calculator/Settings/Settings - History/History - Clear'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Settings/Settings - History/History - Clear - Clear history and memory'), 
    0)

Mobile.tap(findTestObject('Calculator/Settings/Settings - History/History - Clear - Clear'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Settings/Settings - History/History - Clear - Dashboard'), 0)

Mobile.tap(findTestObject('Calculator/Settings/Settings Options - Button'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Settings/Settings - History/History - Button'), 0)

Mobile.tap(findTestObject('Calculator/Settings/Settings - History/History - Button'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Settings/Settings - History/History - Clear - No History'), 0)

Mobile.tap(findTestObject('Calculator/Settings/Settings - History/History-Back'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Cal/AC - Button'), 0)

