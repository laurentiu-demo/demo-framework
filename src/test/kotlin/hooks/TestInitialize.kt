package hooks

import pages.BasePage
import io.cucumber.java.After
import io.cucumber.java.Before
import io.github.bonigarcia.wdm.WebDriverManager

class TestInitialize(basePage: BasePage) {

    private var basePage : BasePage

    init {
        this.basePage = basePage
    }

    @Before
    fun setup() {
        ConfigureSetup.initializeSettings()
        basePage.driver = WebDriverManager.chromedriver().create()
    }

    @After
    fun tearDown() {
        basePage.driver.quit()
    }
}