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

WebUI.click(findTestObject('Object Acquisition/Page_nightlyno - Axiell Quria/md-icon_1_2'))

WebUI.setText(findTestObject('Manual Captured Objects/Page_nightlyno - Axiell Quria/input_Abonnementer_search-inpu'), 'La colmena')

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/md-icon_1'))

WebUI.click(findTestObject('Object Acquisition/Page_nightlyno - Axiell Quria/div_Opprett bestilling_md-container md-ink-ripple'))

WebUI.click(findTestObject('Object Acquisition/Page_nightlyno - Axiell Quria/button_Opprett bestilling'))

WebUI.click(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/span_Bestillinger'))

WebUI.setText(findTestObject('Object Acquisition/Page_nightlyno - Axiell Quria/input_Abonnementer_search-input'), 'La colmena')

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/md-icon_1'))

WebUI.click(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/div_Titler (1)'))

WebUI.closeBrowser()

