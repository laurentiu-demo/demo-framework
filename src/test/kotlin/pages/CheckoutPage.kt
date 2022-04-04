package pages

import utils.Elements

class CheckoutPage(basePage: BasePage) {

    private val basePage: BasePage

    init {
        this.basePage = basePage
    }

    fun removeItem() {
        basePage.driver.findElement(Elements.removeItemFromCart).click()
    }
}