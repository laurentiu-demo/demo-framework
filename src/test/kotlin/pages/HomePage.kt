package pages

import utils.Settings

class HomePage(basePage: BasePage) : BasePage() {

    private val basePage: BasePage

    init {
        this.basePage = basePage
    }

    fun goToHomePage() {
        basePage.driver.get(Settings.baseUrl)
        println(basePage.driver.title)
    }
}