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

WebUI.click(findTestObject('Object Acquisition/Page_nightlyno - Axiell Quria/md-icon'))

WebUI.click(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/span_Budsjetter'))

WebUI.click(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/button_Legg til budsjett'))

WebUI.setText(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/input_Kode_ctxstateCurrentBudgetCode'), 
    '150')

WebUI.setText(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/input_Budsjett_ctxstateCurrentBudgetName'), 
    'Ignacio budsjett 2')

WebUI.click(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/span_Ingen valgt_md-select-icon'))

WebUI.click(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/span_ Drammenbiblioteket1'))

WebUI.setText(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/input_Merknad_ctxstateCurrentBudgetNote'), 
    'Automatic testing')

WebUI.setText(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/input_r_ctxstateFirstBudgetPeriodYear'), 
    '2020')

WebUI.setText(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/input_Belp_ctxstateBudgetPeriodAmount'), 
    '200000')

WebUI.setText(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/input_Varselsniv ()_ctxstateFirstBudgetPeri_2394ce'), 
    '70')

WebUI.setText(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/input_Merknad_ctxstateFirstBudgetPeriodNote'), 
    'Kommentar felt')

WebUI.click(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/button_Lagre'))

WebUI.click(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/md-icon_1'))

WebUI.click(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/span_Budsjetter'))

WebUI.click(findTestObject('Object Repository/Object Acquisition/Page_nightlyno - Axiell Quria/td_Ignacio budsjett 2'))

WebUI.closeBrowser()

