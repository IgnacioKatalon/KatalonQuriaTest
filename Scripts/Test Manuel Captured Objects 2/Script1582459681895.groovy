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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nightlyno.quriaint.axiell.com/frontend/e6577300-18cd-4938-95dc-8690d6b50505/public/index.html')

WebUI.click(findTestObject('Object Repository/test manuel objecter 2/Page_Axiell Quria/a_Sign in with Google'))

WebUI.setText(findTestObject('Object Repository/test manuel objecter 2/Page_Logg p  Google-kontoer/input_axiell.com_identifier'), 
    'axiell.norge.quria@gmail.com')

WebUI.click(findTestObject('Object Repository/test manuel objecter 2/Page_Logg p  Google-kontoer/span_Neste'))

WebUI.setEncryptedText(findTestObject('test manuel objecter 2/Page_Logg p  Google-kontoer/input_Password'), 
    'd097ITWPO7f2v9EptRJGCg==')

WebUI.click(findTestObject('test manuel objecter 2/Page_Logg p  Google-kontoer/div_Neste'))

WebUI.click(findTestObject('Object Repository/test manuel objecter 2/Page_nightlyno - Axiell Quria/md-icon'))

WebUI.setText(findTestObject('Object Repository/test manuel objecter 2/Page_nightlyno - Axiell Quria/input_Abonnementer_search-inpu'), 
    'sub:romantikk NOT cre:boge')

WebUI.click(findTestObject('test manuel objecter 2/Page_nightlyno - Axiell Quria/md-icon_1'))

WebUI.click(findTestObject('test manuel objecter 2/Page_nightlyno - Axiell Quria/div_Resultater'))

WebUI.verifyElementText(findTestObject('test manuel objecter 2/Page_nightlyno - Axiell Quria/div_Resultater'), 'Resultater: 483')

WebUI.click(findTestObject('Object Repository/test manuel objecter 2/Page_nightlyno - Axiell Quria/md-icon_expand_more'))

WebUI.click(findTestObject('Object Repository/test manuel objecter 2/Page_nightlyno - Axiell Quria/a_exit_to_appLogg av'))

WebUI.closeBrowser()

