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

WebUI.click(findTestObject('Object Acquisition/Page_nightlyno - Axiell Quria/span_Statistikk_ax-menu-icon'))

WebUI.click(findTestObject('Object Acquisition/Page_nightlyno - Axiell Quria/a_Valutaer'))

WebUI.click(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/button_Legg til valuta'))

WebUI.setText(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/input_Valuta_ctxstateCurrencyName'), 
    'Pesetas')

WebUI.setText(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/input_Kode_ctxstateCurrencyCode'), 
    'PST')

WebUI.setText(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/input_Vekselkurs_ctxstateCurrencyExchangeRate'), 
    '0.5')

WebUI.click(findTestObject('Object Acquisition/Page_nightlyno - Axiell Quria/span_Lagre'))

WebUI.closeBrowser()

