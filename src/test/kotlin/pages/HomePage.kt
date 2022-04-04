package pages

import org.openqa.selenium.interactions.Actions
import utils.Elements
import utils.Settings

class HomePage(basePage: BasePage) : BasePage() {

    private val basePage: BasePage
    val search = SearchNavigation(basePage.driver)

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

    fun addItemToCart() {
       val listOfHomeProducts = basePage.driver.findElements(Elements.homeProductList)
        val actions = Actions(basePage.driver)
        actions.moveToElement(listOfHomeProducts[0]).perform()
        basePage.driver.findElement(Elements.addToCart).click()

    }
}