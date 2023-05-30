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
import java.math.BigDecimal as BigDecimal

Mobile.startExistingApplication('com.google.android.calculator')

Mobile.tap(findTestObject('Calculator/Cal/AC - Button'), 0)

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), '')

Mobile.tap(findTestObject('Calculator/Detail - More Operation/Details - Button'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Detail - More Operation/Close Details - Button'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Detail - More Operation/sin - Button'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Detail - More Operation/cos - Button'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Detail - More Operation/tan - Button'), 0)

// Calculate SIN
Mobile.tap(findTestObject('Calculator/Detail - More Operation/sin - Button'), 0)

String sin = Mobile.getText(findTestObject('Calculator/Detail - More Operation/sin - Button'), 0)

sin = sin.replace(sin, 's')

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), sin)

Mobile.tap(findTestObject('Calculator/Number/9 - Button'), 0)

String sinNumber1 = Mobile.getText(findTestObject('Calculator/Number/9 - Button'), 0)

String sinValue1 = sin + sinNumber1

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), sinValue1)

Mobile.tap(findTestObject('Calculator/Number/0 - Button'), 0)

String sinNumber2 = Mobile.getText(findTestObject('Calculator/Number/0 - Button'), 0)

String sinValue2 = sinValue1 + sinNumber2

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), sinValue2)

String sin_number = sinNumber1 + sinNumber2

double number_sin = sin_number.toDouble()

Mobile.tap(findTestObject('Calculator/Cal/Equals - Button'), 0)

double sinResult = Math.sin(number_sin)

double sinroundedResult = ((Math.round(sinResult * 10000000000.0) / 10000000000.0) as double)

String sinExpectedValue = sinroundedResult.toString()

if (sinExpectedValue.contains('.') && sinExpectedValue.endsWith('.0')) {
    double actual = sinExpectedValue.toDouble()

    int IntValue = actual.toInteger()

    String sinExpectedResult = IntValue.toString()

    Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), sinExpectedResult)
} else {
    double DoubValue = sinExpectedValue.toDouble()

    String sinExpectedResult = DoubValue.toString()

    Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), sinExpectedResult)
}

// Calculate COS
Mobile.tap(findTestObject('Calculator/Detail - More Operation/cos - Button'), 0)

String cos = Mobile.getText(findTestObject('Calculator/Detail - More Operation/cos - Button'), 0)

cos = cos.replace(cos, 'c')

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), cos)

Mobile.tap(findTestObject('Calculator/Number/3 - Button'), 0)

String cosNumber1 = Mobile.getText(findTestObject('Calculator/Number/3 - Button'), 0)

String cosValue1 = cos + cosNumber1

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), cosValue1)

Mobile.tap(findTestObject('Calculator/Number/0 - Button'), 0)

String cosNumber2 = Mobile.getText(findTestObject('Calculator/Number/0 - Button'), 0)

String cosValue2 = cosValue1 + cosNumber2

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), cosValue2)

String cos_number = cosNumber1 + cosNumber2

double number_cos = cos_number.toDouble()

Mobile.tap(findTestObject('Calculator/Cal/Equals - Button'), 0)

double cosResult = Math.cos(number_cos)

// used to extract the substring starting from the beginning of the string up to the position 
//of the decimal point plus 10 additional characters (which include the decimal point and the following 9 decimal places).
def roundedNumberString = cosResult.toString()

def cosroundedResult = roundedNumberString.substring(0, roundedNumberString.indexOf('.') + 11)

String cosExpectedValue = cosroundedResult.toString()

if (cosExpectedValue.contains('.') && cosExpectedValue.endsWith('.0')) {
    double actual = cosExpectedValue.toDouble()

    int IntValue = actual.toInteger()

    String cosExpectedResult = IntValue.toString()

    Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), cosExpectedResult)
} else {
    double DoubValue = cosExpectedValue.toDouble()

    String cosExpectedResult = DoubValue.toString()

    Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), cosExpectedResult)
}

//Calculate TAN
Mobile.tap(findTestObject('Calculator/Detail - More Operation/tan - Button'), 0)

String tan = Mobile.getText(findTestObject('Calculator/Detail - More Operation/tan - Button'), 0)

tan = tan.replace(tan, 't')

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), tan)

Mobile.tap(findTestObject('Calculator/Number/0 - Button'), 0)

String tanNumber1 = Mobile.getText(findTestObject('Calculator/Number/0 - Button'), 0)

String tanValue1 = tan + tanNumber1

Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), tanValue1)

Mobile.tap(findTestObject('Calculator/Cal/Equals - Button'), 0)

double tan_number = tanNumber1.toDouble()

double tanResult = Math.tan(tan_number)

String tanExpectedValue = tanResult.toString()

if (tanExpectedValue.contains('.') && tanExpectedValue.endsWith('.0')) {
    double actual = tanExpectedValue.toDouble()

    int IntValue = actual.toInteger()

    String tanExpectedResult = IntValue.toString()

    Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), tanExpectedResult)
} else {
    double DoubValue = tanExpectedValue.toDouble()

    String tanExpectedResult = DoubValue.toString()

    Mobile.verifyElementText(findTestObject('Calculator/Cal/Cal - Text View'), tanExpectedResult)
}

Mobile.tap(findTestObject('Calculator/Detail - More Operation/Close Details - Button'), 0)

Mobile.verifyElementExist(findTestObject('Calculator/Detail - More Operation/Details - Button'), 0)

Mobile.verifyElementNotExist(findTestObject('Calculator/Detail - More Operation/sin - Button'), 0)

Mobile.verifyElementNotExist(findTestObject('Calculator/Detail - More Operation/cos - Button'), 0)

Mobile.verifyElementNotExist(findTestObject('Calculator/Detail - More Operation/tan - Button'), 0)

