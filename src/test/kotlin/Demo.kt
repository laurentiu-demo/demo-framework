import org.assertj.core.api.Assertions.assertThat
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import io.github.bonigarcia.wdm.WebDriverManager
import org.junit.jupiter.api.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Demo {
    var driver: WebDriver? = null

    @BeforeAll
    fun setupClass() {
        WebDriverManager.chromedriver().setup()
    }

    @BeforeEach
    fun setupTest() {
        driver = ChromeDriver()
    }

    @AfterEach
    fun teardown() {
        driver!!.quit()
    }

    @Test
    fun test() {
        // Exercise
        driver!!["https://bonigarcia.dev/selenium-webdriver-java/"]
        val title = driver!!.title

        // Verify
        assertThat(title).contains("Selenium WebDriver")
    }
}