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

Mobile.tap(findTestObject('Calculator/Cal/AC - Button'), 0)

Mobile.tap(findTestObject('Calculator/Number/5 - Button'), 0)

String FirstNumber = Mobile.getText(findTestObject('Calculator/Number/5 - Button'), 0)

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), FirstNumber)

Mobile.tap(findTestObject('Calculator/Operation/Times - Button'), 0)

String Times = Mobile.getText(findTestObject('Calculator/Operation/Times - Button'), 0)

String MulValue = FirstNumber + Times

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), MulValue)

Mobile.tap(findTestObject('Calculator/Number/6 - Button'), 0)

String SecondNumber = Mobile.getText(findTestObject('Calculator/Number/6 - Button'), 0)

String Value = MulValue + SecondNumber

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), Value)

int first_number = Integer.parseInt(FirstNumber)

int second_number = Integer.parseInt(SecondNumber)

int MulResult = first_number * second_number

String ExpectedValue = MulResult.toString()

Mobile.tap(findTestObject('Calculator/Cal/Equals - Button'), 0)

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), ExpectedValue)

