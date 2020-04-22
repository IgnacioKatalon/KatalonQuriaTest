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

WebUI.click(findTestObject('Object Repository/Test Simple Search/Page_nightlyno - Axiell Quria/md-icon'))

WebUI.waitForElementVisible(findTestObject('Test Simple Search/Page_nightlyno - Axiell Quria/input_Abonnementer_search-inpu'), 
    30)

WebUI.setText(findTestObject('Object Repository/Test Simple Search/Page_nightlyno - Axiell Quria/input_Abonnementer_search-inpu'), 
    'hest*')

WebUI.click(findTestObject('test manuel objecter 2/Page_nightlyno - Axiell Quria/md-icon_1'))

WebUI.click(findTestObject('test manuel objecter 2/Page_nightlyno - Axiell Quria/div_Resultater'))

WebUI.verifyElementText(findTestObject('test manuel objecter 2/Page_nightlyno - Axiell Quria/div_Resultater'), 'Resultater: 27')

WebUI.click(findTestObject('Object Repository/Object Clouse Browser/Page_nightlyno - Axiell Quria/md-icon_expand_more'))

WebUI.click(findTestObject('Object Repository/Object Clouse Browser/Page_nightlyno - Axiell Quria/a_exit_to_appLogg av'))

WebUI.closeBrowser()

