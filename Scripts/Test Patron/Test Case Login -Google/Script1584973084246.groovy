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

WebUI.click(findTestObject('Object Repository/Object Login Google/Page_Axiell Quria/a_Sign in with Google'))

WebUI.setText(findTestObject('Object Repository/Object Login Google/Page_Logg p  Google-kontoer/input_axiell.com_identifier'), 
    'axiell.norge.quria@gmail.com')

WebUI.click(findTestObject('Object Repository/Object Login Google/Page_Logg p  Google-kontoer/span_Neste'))

WebUI.setEncryptedText(findTestObject('Object Repository/Object Login Google/Page_Logg p  Google-kontoer/input_For mange mislykkede for'), 
    'd097ITWPO7f2v9EptRJGCg==')

WebUI.click(findTestObject('Object Repository/Object Login Google/Page_Logg p  Google-kontoer/span_Neste'))

WebUI.closeBrowser()

