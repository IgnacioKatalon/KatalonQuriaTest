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

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/md-icon (3)'))

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/button_Legg til lner (1)'))

WebUI.setText(findTestObject('Page_nightlyno - Axiell Quria/input_Personnummer_ctx.state.N (1)'), '29072633383')

WebUI.setText(findTestObject('Page_nightlyno - Axiell Quria/input_Fornavn_ctx.state.FirstN (1)'), 'Patron')

WebUI.setText(findTestObject('Page_nightlyno - Axiell Quria/input_Etternavn_ctx.state.Last (1)'), 'Automatic Test')

WebUI.setText(findTestObject('Page_nightlyno - Axiell Quria/input_Fdselsdato_input_78'), '12.08.1961')

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/md-option_Drammen Branch1'))

WebUI.setText(findTestObject('Page_nightlyno - Axiell Quria/input_Adresselinje 1_ctx.state (1)'), 'Brynsveien 128')

WebUI.setText(findTestObject('Page_nightlyno - Axiell Quria/input_Telefonnummer_ctx.state.'), '41428685')

WebUI.setText(findTestObject('Page_nightlyno - Axiell Quria/input_E-post_ctx.state.EmailAd (1)'), 'itp@axiell.com')

WebUI.setText(findTestObject('Page_nightlyno - Axiell Quria/input_Postkode_ctx.state.PostC (1)'), '1352')

WebUI.setText(findTestObject('Page_nightlyno - Axiell Quria/input_By_ctx.state.Town (1)'), 'Kolsås')

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/md-option_Norge (1)'))

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/button_Avbryt'))

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/button_Nei g tilbake'))

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/span_Lagre (1)'))

WebUI.click(findTestObject('Page_nightlyno - Axiell Quria/md-tab-item_Lneropplysninger (1)'))

WebUI.closeBrowser()

