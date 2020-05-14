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

WebUI.click(findTestObject('Object External Resources/Page_nightlyno - Axiell Quria/md-icon'))

WebUI.click(findTestObject('Object External Resources/Page_nightlyno - Axiell Quria/a_Eksterne kilder'))

WebUI.setText(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/input_Abonnementer_search-input (1)'), 
    'Artenes opprinnelse')

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/span_Libris_md-select-icon'))

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/md-option_Bokbasen'))

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/md-icon_1 (1)'))

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/md-icon_more_vert (1)'))

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/button_Importer (1)'))

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/span_Sk (1)'))

WebUI.setText(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/input_Abonnementer_search-input (1)'), 
    'Artenes opprinnelse')

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/md-icon_1 (1)'))

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/md-icon_more_vert_1 (1)'))

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/button_Slett manifestasjon (1)'))

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/button_Slett (1)'))

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/md-icon_more_vert_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/button_Slett uttrykk (1)'))

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/button_Slett (1)'))

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/button_Tilbake til sket (1)'))

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/md-icon_1 (1)'))

WebUI.click(findTestObject('Object Repository/Object External Resources/Page_nightlyno - Axiell Quria/div_Resultater 0 (1)'))

WebUI.closeBrowser()

