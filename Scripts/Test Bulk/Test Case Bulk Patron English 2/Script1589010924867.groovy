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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Test Patron/Test Case Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Object Bulk/Page_nightlyno - Axiell Quria/md-icon'))

WebUI.click(findTestObject('Object Repository/Object Bulk/Page_nightlyno - Axiell Quria/a_Mengdehndtering'))

WebUI.setText(findTestObject('Object Repository/Object Bulk/Page_nightlyno - Axiell Quria/input_Bankfiler_search-input'), 
    'Tejera')

WebUI.click(findTestObject('Object Repository/Object Bulk/Page_nightlyno - Axiell Quria/md-icon_1'))

WebUI.click(findTestObject('Object Repository/Object Bulk/Page_nightlyno - Axiell Quria/div_Resultater 4'))

WebUI.click(findTestObject('Object Repository/Object Bulk/Page_nightlyno - Axiell Quria/div_Slett lnere_md-container md-ink-ripple'))

WebUI.click(findTestObject('Object Repository/Object Bulk/Page_nightlyno - Axiell Quria/button_Endre data'))

WebUI.doubleClick(findTestObject('Object Repository/Object Bulk/Page_nightlyno - Axiell Quria/md-select_Ingen forandringer               _795f6f'))

WebUI.selectOptionByIndex(findTestObject('Object Bulk/Page_nightlyno - Axiell Quria/md-option_English'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/span_Endre'))

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/button_Ja endre'))

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/span_Sk'))

WebUI.setText(findTestObject('Page_nightlyno - Axiell Quria/input_Bankfiler_search-input'), 'Tejera')

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/md-icon_1'))

WebUI.click(findTestObject('Object Repository/Object Bulk/Page_nightlyno - Axiell Quria/span_Tejera Snsteby Torfinn'))

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/md-tab-item_Lneropplysninger'))

WebUI.click(findTestObject('Object Repository/Object Bulk/Page_nightlyno - Axiell Quria/span_English'))

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/md-icon_close'))

WebUI.closeBrowser()

