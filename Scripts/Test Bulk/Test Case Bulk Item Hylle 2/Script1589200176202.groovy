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

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/md-icon'))

WebUI.waitForElementVisible(findTestObject('Object Bulk/Page_nightlyno - Axiell Quria/span_Mengdehndtering'), 30)

WebUI.click(findTestObject('Object Bulk/Page_nightlyno - Axiell Quria/span_Mengdehndtering'))

WebUI.setText(findTestObject('Object Bulk/Page_nightlyno - Axiell Quria/input_Abonnementer_search-input'), 'Bikuben')

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/md-icon_1'))

WebUI.click(findTestObject('Object Bulk/Page_nightlyno - Axiell Quria/div_Slett eksemplarer_md-container md-ink-ripple'))

WebUI.click(findTestObject('Object Bulk/Page_nightlyno - Axiell Quria/button_Endre data'))

WebUI.setText(findTestObject('Object Repository/Object Bulk/Page_nightlyno - Axiell Quria/input_Hylle - eksemplar_ctxstateSelectedFor_9bc213'), 
    'Hylle 2')

WebUI.click(findTestObject('Object Bulk/Page_nightlyno - Axiell Quria/span_Endre'))

WebUI.click(findTestObject('Object Bulk/Page_nightlyno - Axiell Quria/button_Ja endre'))

WebUI.click(findTestObject('Object Repository/Object Bulk/Page_nightlyno - Axiell Quria/span_Hylle 1'))

WebUI.verifyElementText(findTestObject('Object Repository/Object Bulk/Page_nightlyno - Axiell Quria/span_Hylle 1'), 'Hylle 2')

WebUI.closeBrowser()

