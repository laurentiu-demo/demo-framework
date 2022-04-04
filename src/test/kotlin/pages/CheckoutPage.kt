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


    fun proceedToCheckOut(stage: String) {
        when (stage) {
            "Shipping" -> basePage.driver.findElement(Elements.proceedCheckoutShipping).click()
            else -> basePage.driver.findElement(Elements.proceedCheckout).click()
        }

    }

    fun agreeToTermsOfService() {
        basePage.driver.findElement(Elements.termsOfService).click()
    }

    fun payViaBankWire() {
        basePage.driver.findElement(Elements.bankWire).click()
    }

    fun payViaCheck() {
        basePage.driver.findElement(Elements.cheque).click()
    }
}