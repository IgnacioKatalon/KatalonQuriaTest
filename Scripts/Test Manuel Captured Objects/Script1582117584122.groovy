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

WebUI.openBrowser('https://nightlyno.quriaint.axiell.com/frontend/e6577300-18cd-4938-95dc-8690d6b50505/public/index.html')

WebUI.click(findTestObject('Manual Captured Objects/Page_Logg p  Google-kontoer/a_Sign in with Google'))

WebUI.setText(findTestObject('Manual Captured Objects/Page_Logg p  Google-kontoer/input_axiell.com_identifier'), 'axiell.norge.quria@gmail.com')

WebUI.click(findTestObject('Manual Captured Objects/Page_Logg p  Google-kontoer/span_Neste'))

WebUI.setText(findTestObject('Manual Captured Objects/Page_Logg p  Google-kontoer/input_Password'), 'quria123456')

WebUI.click(findTestObject('Manual Captured Objects/Page_Logg p  Google-kontoer/div_Neste'))

WebUI.click(findTestObject('Manual Captured Objects/Page_nightlyno - Axiell Quria/md-icon'))

WebUI.setText(findTestObject('Manual Captured Objects/Page_nightlyno - Axiell Quria/input_Abonnementer_search-inpu'), 'Cervantes')

WebUI.click(findTestObject('Manual Captured Objects/Page_nightlyno - Axiell Quria/md-icon_1'))

WebUI.waitForElementVisible(findTestObject('Page_nightlyno - Axiell Quria/span_Title'), 30)

WebUI.verifyElementText(findTestObject('Page_nightlyno - Axiell Quria/span_Title'), 'El Quijote de Cervantes')

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/Test Simple Search/Page_nightlyno - Axiell Quria/md-icon_expand_more'))

WebUI.waitForElementVisible(findTestObject('Test Simple Search/Page_nightlyno - Axiell Quria/a_exit_to_appLogg av'), 30)

WebUI.click(findTestObject('Object Repository/Test Simple Search/Page_nightlyno - Axiell Quria/a_exit_to_appLogg av'))

WebUI.closeBrowser()

