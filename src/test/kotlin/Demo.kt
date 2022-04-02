import io.github.bonigarcia.wdm.WebDriverManager
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Demo {
    private lateinit var driver: WebDriver

    @AfterEach
    fun teardown() {
        driver.quit()
    }

    @ParameterizedTest
    @ValueSource(classes = [ChromeDriver::class, FirefoxDriver::class])
    fun test(webDriverClass: Class<out WebDriver?>?) {
        // Driver management and WebDriver instantiation
        driver = WebDriverManager.getInstance(webDriverClass).create()

        // Exercise
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/")
        val title: String = driver.getTitle()

        // Verify
        assertThat(title).contains("Selenium WebDriver")
    }
}