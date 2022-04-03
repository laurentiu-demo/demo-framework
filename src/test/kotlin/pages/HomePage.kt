package pages

import utils.Elements
import utils.Settings

class HomePage(basePage: BasePage) : BasePage() {

    private val basePage: BasePage

    init {
        this.basePage = basePage
    }

    fun goToHomePage() {
        basePage.driver.get(Settings.baseUrl)
    }

    fun clickOnSignIn() {
       val signInElement = basePage.driver.findElement(Elements.login)
        signInElement.click()
    }
}