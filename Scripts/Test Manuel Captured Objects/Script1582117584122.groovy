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

WebUI.openBrowser('https://accounts.google.com/signin/oauth/identifier?client_id=398082617796-in0gu90ucdasgcoo8c4tockr4rtot3so.apps.googleusercontent.com&as=B16zwch4PyDthppsc34I1A&destination=https%3A%2F%2Fnightlyno.quriaint.axiell.com&approval_state=!ChRvTEVhc1lNbi1UZndwUWpmak15ahIfYzM2MWl1TUhxZlVYOERFdWhZOThQY19WRGQ3YUJSYw%E2%88%99AJDr988AAAAAXk6MWTrD0cwsZeD1p5SuPK5Ft1av7JJw&oauthgdpr=1&xsrfsig=ChkAeAh8TwtOgLn0gNHr2ju4RckzUA4Fe0sNEg5hcHByb3ZhbF9zdGF0ZRILZGVzdGluYXRpb24SBXNvYWN1Eg9vYXV0aHJpc2t5c2NvcGU&flowName=GeneralOAuthFlow')

WebUI.setText(findTestObject('Manual Captured Objects/Page_Logg p  Google-kontoer/input_axiell.com_identifier'), 'axiell.norge.quria@gmail.com')

WebUI.click(findTestObject('Manual Captured Objects/Page_Logg p  Google-kontoer/span_Neste'))

WebUI.setText(findTestObject('Manual Captured Objects/Page_Logg p  Google-kontoer/input_For mange mislykkede for'), 'quria123456')

WebUI.click(findTestObject('Manual Captured Objects/Page_Logg p  Google-kontoer/div_Neste'))

WebUI.verifyTextPresent('', false)

WebUI.closeBrowser()

