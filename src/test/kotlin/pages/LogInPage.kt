package pages

import utils.Elements

class LogInPage(basePage: BasePage) {

    private val basePage: BasePage
    init {
        this.basePage = basePage
    }

    fun authenticate(username: String, password: String) {
        basePage.driver.findElement(Elements.username).sendKeys(username)
        basePage.driver.findElement(Elements.password).sendKeys(password)
        basePage.driver.findElement(Elements.submit).click()
    }
}