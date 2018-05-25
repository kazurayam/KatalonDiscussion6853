package com.mycompany

import org.openqa.selenium.Capabilities
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.RemoteWebDriver
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import java.awt.*

public class GetTestingConfig {
	@Keyword
	def getOperatingSystem () {
		println System.getProperty('os.name')
	}

	@Keyword
	def getBrowserAndVersion() {
		WebDriver driver = DriverFactory.getWebDriver()
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities()
		String browserName = caps.getBrowserName().capitalize()
		String browserVersion = caps.getVersion()
		println browserName + ' ' + browserVersion
	}

	@Keyword
	def getScreenResolution() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize()
		Integer screenHeight = screenSize.height
		Integer screenWidth = screenSize.width
		println screenWidth + 'x' + screenHeight
	}
}