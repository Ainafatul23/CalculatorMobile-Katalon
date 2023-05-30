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

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), '')

Mobile.tap(findTestObject('Calculator/Number/3 - Button'), 0)

String FirstNumber = Mobile.getText(findTestObject('Calculator/Number/3 - Button'), 0)

Mobile.verifyElementText(findTestObject('Calculator/Number/3 - Button'), FirstNumber)

Mobile.tap(findTestObject('Calculator/Cal/Parentheses - Button'), 0)

String Parentheses1 = Mobile.getText(findTestObject('Calculator/Cal/Parentheses - Button'), 0)

String FirstParentheses = Parentheses1.replace(Parentheses1, '(')

String Value1 = FirstNumber + FirstParentheses

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), Value1)

Mobile.tap(findTestObject('Calculator/Number/1 - Button'), 0)

String SecondNumber = Mobile.getText(findTestObject('Calculator/Number/1 - Button'), 0)

String Value2 = Value1 + SecondNumber

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), Value2)

Mobile.tap(findTestObject('Calculator/Operation/Plus - Button'), 0)

String Plus = Mobile.getText(findTestObject('Calculator/Operation/Plus - Button'), 0)

String Value3 = Value2 + Plus

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), Value3)

Mobile.tap(findTestObject('Calculator/Number/3 - Button'), 0)

String ThirdNumber = Mobile.getText(findTestObject('Calculator/Number/3 - Button'), 0)

String Value4 = Value3 + ThirdNumber

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), Value4)

Mobile.tap(findTestObject('Calculator/Cal/Parentheses - Button'), 0)

String Parentheses2 = Mobile.getText(findTestObject('Calculator/Cal/Parentheses - Button'), 0)

String SecondParentheses = Parentheses2.replace(Parentheses2, ')')

String Value5 = Value4 + SecondParentheses

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), Value5)


int first_number = FirstNumber.toInteger()

int second_number = SecondNumber.toInteger()

int third_number = ThirdNumber.toInteger()

Mobile.tap(findTestObject('Calculator/Cal/Equals - Button'), 0)

int PResult = first_number * (second_number + third_number)

String ExpectedValue = PResult.toString()

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), ExpectedValue)

