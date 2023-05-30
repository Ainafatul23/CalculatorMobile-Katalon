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

Mobile.tap(findTestObject('Calculator/Detail - More Operation/Details - Button'), 0)

String CloseDetails = Mobile.getText(findTestObject('Calculator/Detail - More Operation/Close Details - Button'), 0)

Mobile.verifyElementText(findTestObject('Calculator/Detail - More Operation/Close Details - Button'), CloseDetails)

String log = Mobile.getText(findTestObject('Calculator/Detail - More Operation/log - Button'), 0)

Mobile.verifyElementText(findTestObject('Calculator/Detail - More Operation/log - Button'), log)

String ln = Mobile.getText(findTestObject('Calculator/Detail - More Operation/In - Button'), 0)

Mobile.verifyElementText(findTestObject('Calculator/Detail - More Operation/In - Button'), ln)

//math operation with log
Mobile.tap(findTestObject('Calculator/Detail - More Operation/log - Button'), 0)

String View1 = 'L' // i dont know why on cal system is L, but it display on cal screen with "log("

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), View1)

Mobile.tap(findTestObject('Calculator/Number/1 - Button'), 0)

String LogNumber = Mobile.getText(findTestObject('Calculator/Number/1 - Button'), 0)

String View2 = View1 + LogNumber

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), View2)

Mobile.tap(findTestObject('Calculator/Cal/Equals - Button'), 0)

double log_number = LogNumber.toDouble()

double logResult = Math.log10(log_number)

String logExpectedValue = logResult.toString()

String logExpectedResult = ''

if (logExpectedValue.contains('.') && logExpectedValue.endsWith('.0')) {
    double actual = logExpectedValue.toDouble()

    int IntValue = actual.toInteger()

    logExpectedResult = IntValue.toString()

    Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), logExpectedResult)
} else {
    double DoubValue = logExpectedValue.toDouble()

    logExpectedResult = DoubValue.toString()

    Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), logExpectedResult)
}

Mobile.tap(findTestObject('Calculator/Cal/AC - Button'), 0)

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), '')

//math operation with ln
Mobile.tap(findTestObject('Calculator/Detail - More Operation/In - Button'), 0)

String View3 = 'l'

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), View3)

Mobile.tap(findTestObject('Calculator/Number/5 - Button'), 0)

String lnNumber = Mobile.getText(findTestObject('Calculator/Number/5 - Button'), 0)

String View4 = View3 + lnNumber

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), View4)

Mobile.tap(findTestObject('Calculator/Cal/Equals - Button'), 0)

double ln_number = lnNumber.toDouble()

double lnResult = Math.log(ln_number)

double roundedResult = ((Math.round(lnResult * 10000000000.0) / 10000000000.0) as double)

String lnExpectedValue = roundedResult.toString()

String lnExpectedResult = ''

if (lnExpectedValue.contains('.') && lnExpectedValue.endsWith('.0')) {
    double actual = lnExpectedValue.toDouble()

    int IntValue = actual.toInteger()

    lnExpectedResult = IntValue.toString()

    Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), lnExpectedResult)
} else {
    double DoubValue = lnExpectedValue.toDouble()

    lnExpectedResult = DoubValue.toString()

    Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), lnExpectedResult)
}

Mobile.tap(findTestObject('Calculator/Detail - More Operation/Close Details - Button'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Detail - More Operation/Details - Button'), 0)

Mobile.verifyElementNotExist(findTestObject('Calculator/Detail - More Operation/log - Button'), 0)

Mobile.verifyElementNotExist(findTestObject('Calculator/Detail - More Operation/In - Button'), 0)

