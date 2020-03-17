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

WebUI.setText(findTestObject('Capture Object Patron/Page_nightlyno - Axiell Quria/input_Search-Patron'), '29072633383')

WebUI.click(findTestObject('Capture Object Patron/Page_nightlyno - Axiell Quria/md-iconSearchPatron'))

//WebUI.click(findTestObject('Capture Object Patron/Page_nightlyno - Axiell Quria/md-icon_closePatron'))
//WebUI.click(findTestObject('Object Repository/Page_nightlyno - Axiell Quria/Page_nightlyno - Axiell Quria/md-icon'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_nightlyno - Axiell Quria/Page_nightlyno - Axiell Quria/md-tab-item_Lneropplysninger'), 
    30)

WebUI.click(findTestObject('Object Repository/Page_nightlyno - Axiell Quria/Page_nightlyno - Axiell Quria/md-tab-item_Lneropplysninger'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_nightlyno - Axiell Quria/Page_nightlyno - Axiell Quria/span_Slett lner'), 
    30)

WebUI.click(findTestObject('Object Repository/Page_nightlyno - Axiell Quria/Page_nightlyno - Axiell Quria/span_Slett lner'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_nightlyno - Axiell Quria/Page_nightlyno - Axiell Quria/button_Slett lner'), 
    30)

WebUI.click(findTestObject('Object Repository/Page_nightlyno - Axiell Quria/Page_nightlyno - Axiell Quria/button_Slett lner'))

WebUI.click(findTestObject('Object Repository/Page_nightlyno - Axiell Quria/Page_nightlyno - Axiell Quria/md-icon_expand_more'))

WebUI.click(findTestObject('Object Repository/Page_nightlyno - Axiell Quria/Page_nightlyno - Axiell Quria/a_exit_to_appLogg av'))

WebUI.closeBrowser()

