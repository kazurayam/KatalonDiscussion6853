import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

CustomKeywords.'com.mycompany.GetTestingConfig.getOperatingSystem'()

CustomKeywords.'com.mycompany.GetTestingConfig.getBrowserAndVersion'()

CustomKeywords.'com.mycompany.GetTestingConfig.getScreenResolution'()

WebUI.closeBrowser()