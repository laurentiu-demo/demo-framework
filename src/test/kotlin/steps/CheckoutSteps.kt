package steps

import io.cucumber.java.en.Then
import pages.BasePage
import pages.ProductsPage

class CheckoutSteps(basePage: BasePage) {

    private val basePage: BasePage
    init {
        this.basePage = basePage
    }

    private val productsPage = ProductsPage(basePage)


    @Then("I go to checkout")
    fun iGoToCheckOut() {
        productsPage.goToCheckOut()
    }
}