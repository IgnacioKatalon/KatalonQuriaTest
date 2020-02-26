import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Test Patron/Test Case Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Capture Object Patron/Page_nightlyno - Axiell Quria/md-icon-Patron'))

WebUI.setText(findTestObject('Capture Object Patron/Page_nightlyno - Axiell Quria/input_Search-Patron'), 'Tejera Picossi')

WebUI.click(findTestObject('Capture Object Patron/Page_nightlyno - Axiell Quria/md-iconSearchPatron'))

WebUI.click(findTestObject('Capture Object Patron/Page_nightlyno - Axiell Quria/md-icon_closePatron'))

WebUI.verifyElementText(findTestObject('Capture Object Patron/Page_nightlyno - Axiell Quria/td_PatronName'), 'Tejera Picossi, Porfirio')

WebUI.click(findTestObject('Capture Object Patron/Page_nightlyno - Axiell Quria/md-iconSearchPatron'))

WebUI.click(findTestObject('Capture Object Patron/Page_nightlyno - Axiell Quria/md-icon_closePatron'))

WebUI.click(findTestObject('Capture Object Patron/Page_nightlyno - Axiell Quria/td_PatronName'))

WebUI.verifyElementPresent(findTestObject('Capture Object Patron/Page_nightlyno - Axiell Quria/div_ActivLoan'), 30)

WebUI.click(findTestObject('Capture Object Patron/Page_nightlyno - Axiell Quria/div_ActivLoan'))

WebUI.verifyElementText(findTestObject('Capture Object Patron/Page_nightlyno - Axiell Quria/div_ActivLoan'), 'Utlånte eksemplarer (1)')

WebUI.click(findTestObject('Capture Object Patron Search/Page_nightlyno - Axiell Quria/span_Reserveringer'))

WebUI.click(findTestObject('Capture Object Patron Search/Page_nightlyno - Axiell Quria/div_AktiveReserveringer'))

WebUI.waitForElementPresent(findTestObject('Capture Object Patron Search/Page_nightlyno - Axiell Quria/span_Gjeld og betalinger'), 
    30)

WebUI.click(findTestObject('Capture Object Patron Search/Page_nightlyno - Axiell Quria/span_Gjeld og betalinger'))

WebUI.click(findTestObject('Capture Object Patron Search/Page_nightlyno - Axiell Quria/div_ActivGjeld'))

//WebUI.verifyElementText(findTestObject('Capture Object Patron Search/Page_nightlyno - Axiell Quria/div_ActivGjeld'), 'Saldo: -kr  47,00')
WebUI.click(findTestObject('Capture Object Patron/Page_nightlyno - Axiell Quria/md-icon_closePatron'))

WebUI.callTestCase(findTestCase('Test Patron/Test Case Logout and Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

