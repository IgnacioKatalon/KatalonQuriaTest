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

WebUI.openBrowser('https://accounts.google.com/signin/oauth/identifier?client_id=398082617796-in0gu90ucdasgcoo8c4tockr4rtot3so.apps.googleusercontent.com&as=s-ygPBDdir4kjVMf1nAfsQ&destination=https%3A%2F%2Fnightlyno.quriaint.axiell.com&approval_state=!ChR4ZHlHalB1OFNmamg0bTMtSEQtbhIfdzhaeVFWa054NUlaOERFdWhZOThQYzhWM3NwaTloWQ%E2%88%99AJDr988AAAAAXg8v4bJ8GBneVwMoHv-ntTZ4J1ZRsLVs&oauthgdpr=1&xsrfsig=ChkAeAh8T1qJ1L1-m6_st3N8rPmbbU7C8x4yEg5hcHByb3ZhbF9zdGF0ZRILZGVzdGluYXRpb24SBXNvYWN1Eg9vYXV0aHJpc2t5c2NvcGU&flowName=GeneralOAuthFlow')

WebUI.setText(findTestObject('Quria Search/Page_Logg p  Google-kontoer/input_axiell.com_identifier'), 'axiell.norge.quria@gmail.com')

WebUI.click(findTestObject('Test Simple Search/Page_Logg p  Google-kontoer/span_Neste'))

WebUI.setText(findTestObject('Quria Search/Page_Logg p  Google-kontoer/input_For mange mislykkede for'), 'quria123456')

WebUI.waitForElementClickable(findTestObject('Test Simple Search2/Page_Logg p  Google-kontoer/div_Neste'), 5)

WebUI.click(findTestObject('Test Simple Search2/Page_Logg p  Google-kontoer/div_Neste'))

WebUI.closeBrowser()

