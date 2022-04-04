package steps

import io.cucumber.java.en.And
import io.cucumber.java.en.Then
import pages.BasePage
import pages.CheckoutPage
import pages.ProductsPage

class CheckoutSteps(basePage: BasePage) {

    private val basePage: BasePage
    init {
        this.basePage = basePage
    }

    private val productsPage = ProductsPage(basePage)
    private val checkoutPage = CheckoutPage(basePage)


    @Then("I go to checkout")
    fun iGoToCheckOut() {
        productsPage.goToCheckOut()
    }

    @Then("I click proceed to checkout")
    fun iClickProceedToCheckout() {
        productsPage.goToCheckOut()
    }

    @And("I remove the item")
    fun iRemoveTheItem() {
        checkoutPage.removeItem()
        Thread.sleep(3000)
    }
}