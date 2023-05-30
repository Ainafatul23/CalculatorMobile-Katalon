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

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), '', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Calculator/Number/7 - Button'), 0)

String Number = Mobile.getText(findTestObject('Calculator/Number/7 - Button'), 0)

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), Number)

Mobile.tap(findTestObject('Calculator/Detail - More Operation/Details - Button'), 0)

String CloseDetails = Mobile.getText(findTestObject('Calculator/Detail - More Operation/Close Details - Button'), 0)

Mobile.verifyElementText(findTestObject('Calculator/Detail - More Operation/Close Details - Button'), CloseDetails)

String Euler = Mobile.getText(findTestObject('Calculator/Detail - More Operation/e - Button'), 0)

Mobile.verifyElementText(findTestObject('Calculator/Detail - More Operation/e - Button'), Euler)

Mobile.tap(findTestObject('Calculator/Detail - More Operation/e - Button'), 0)

String Value = Number + Euler

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), Value)

Mobile.tap(findTestObject('Calculator/Cal/Equals - Button'), 0)

double ValNumber = Number.toDouble()

double EResult = ValNumber * Math.E

double roundedResult = ((Math.round(EResult * 1000000000.0) / 1000000000.0) as double)

String ExpectedValue = roundedResult.toString()

if (ExpectedValue.contains('.') && ExpectedValue.endsWith('.0')) {
    double actual = ExpectedValue.toDouble()

    int IntValue = actual.toInteger()

    String ExpectedResult = IntValue.toString()

    Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), ExpectedResult)
} else {
    double DoubValue = ExpectedValue.toDouble()

    String ExpectedResult = DoubValue.toString()

    Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), ExpectedResult)
}

Mobile.tap(findTestObject('Calculator/Detail - More Operation/Close Details - Button'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Detail - More Operation/Details - Button'), 0)

Mobile.verifyElementNotExist(findTestObject('Calculator/Detail - More Operation/e - Button'), 0)

