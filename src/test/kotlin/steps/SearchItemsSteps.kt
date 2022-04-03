package steps

import io.cucumber.java.en.Then
import pages.BasePage
import pages.HomePage
import pages.ProductsPage

class SearchItemsSteps(basePage: BasePage) : BasePage() {

    private val basePage: BasePage

    init {
        this.basePage = basePage
    }

    private val homePage = HomePage(basePage)
    private val productsPage = ProductsPage(basePage)


    @Then("I search for {string}")
    fun i_search_for_hoodie(item: String) {
        homePage.search.searchItem(item)
    }

    @Then("I add a random item to the cart")
    fun i_search_for_hoodie() {
        productsPage.addToCart()
    }

    @Then("I continue shopping")
    fun i_continue_shopping() {
        productsPage.continueShopping()
    }
}