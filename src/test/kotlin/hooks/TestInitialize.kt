package hooks

import io.cucumber.java.After
import io.cucumber.java.Before
import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.AbstractDriverOptions
import pages.BasePage
import java.time.Duration


class TestInitialize(basePage: BasePage) {

    private var basePage: BasePage

    init {
        this.basePage = basePage
    }

    @Before
    fun setup() {
        ConfigureSetup.initializeSettings()
        val browser = System.getProperty("browser") ?: "ChromeDriver"
        val browserInstance = getBrowserClass(browser)
        val options = getBrowserOptions(browser)
        basePage.driver = WebDriverManager.getInstance(browserInstance).capabilities(options).create()
        basePage.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30))
        basePage.driver.manage().window().maximize()
    }

    private fun getBrowserOptions(driver: String): AbstractDriverOptions<*> {
        return when (driver) {
            "FireFoxDriver" -> {
                val options = FirefoxOptions()
                options.addArguments("--headless")
                options
            }
            "ChromeDriver" -> {
                val options = ChromeOptions()
                options.addArguments("--headless")
                options
            }
            else -> {val options = ChromeOptions()
                options.addArguments("--headless")
                options}
        }
    }

    @After
    fun tearDown() {
        basePage.driver.quit()
    }

    private fun getBrowserClass(browser: String): Class<out WebDriver?> {
        return when (browser) {
            "ChromeDriver" -> ChromeDriver::class.java
            "FireFoxDriver" -> FirefoxDriver::class.java
            else -> ChromeDriver::class.java
        }

    }
}