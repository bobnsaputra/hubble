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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.thoughtworks.selenium.Wait.WaitTimedOutException

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('tokopedia.com')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(20)

searchInput = findTestObject('Page_Situs Jual Beli Online Terlengkap, Mudah  Aman  Tokopedia/input_Kategori_css-3017qm exxxdg63')

WebUI.sendKeys(searchInput, 'iphone 14 pro')

WebUI.click(searchInput)

WebUI.click(findTestObject('Page_Situs Jual Beli Online Terlengkap, Mudah  Aman  Tokopedia/strong_iphone 14 pro'))

WebUI.click(findTestObject('Page_Jual iphone 14 pro  Tokopedia/span_Official Store'))

WebUI.sendKeys(findTestObject('Page_Jual iphone 14 pro  Tokopedia/input_Rp_pmin'), GlobalVariable.minHarga)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Jual iphone 14 pro  Tokopedia/input_Rp_pmax'))

WebUI.sendKeys(findTestObject('Page_Jual iphone 14 pro  Tokopedia/input_Rp_pmax'), GlobalVariable.maxHarga)

WebUI.click(findTestObject('Page_Jual iphone 14 pro  Tokopedia/input_Rp_pmin'))

WebUI.click(findTestObject('Page_Jual iphone 14 pro  Tokopedia/button_Paling Sesuai'))

WebUI.click(findTestObject('Page_Jual iphone 14 pro  Tokopedia/button_Harga Terendah'))

phoneData = WebUI.getText(findTestObject('Page_Jual iphone 14 pro  Tokopedia/div_Apple iPhone 14 Pro'))

WebUI.getText(findTestObject('Page_Jual iphone 14 pro  Tokopedia/div_Apple iPhone 14 Pro - Garansi Resmi iBox Apple Indonesia'))

WebUI.scrollToPosition(50, 6000)

WebUI.click(findTestObject('Page_Jual iphone 14 pro  Tokopedia/button_2'))

WebUI.getText(findTestObject('Page_Jual iphone 14 pro  Tokopedia/div_APPLE IPHONE 14 PRO 128 GARANSI RESMI IBOX TERMURAH'))

WebUI.scrollToPosition(50, 6000)

WebUI.click(findTestObject('Page_Jual iphone 14 pro  Tokopedia/button_3'))

phone = 'Apple iPhone 14 Pro'

println(phone)

WebUI.verifyEqual(phoneData, phone)

WebUI.closeBrowser()

