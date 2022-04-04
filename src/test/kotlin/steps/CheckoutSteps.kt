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

    @Then("I click proceed to checkout from {}")
    fun iClickProceedToCheckout(string: String) {
        checkoutPage.proceedToCheckOut(string)
    }

    @Then("I agree to terms of service")
    fun iAgreeToTermsOfService() {
        checkoutPage.agreeToTermsOfService()
    }

    @Then("I choose the payment via {payment}")
    fun iAgreeToTermsOfService(payment: String) {
        when(payment) {
            "bank wire" -> checkoutPage.payViaBankWire()
            "pay by check" -> checkoutPage.payViaCheck()
        }
    }

    @And("I remove the item")
    fun iRemoveTheItem() {
        checkoutPage.removeItem()
    }
}