package pages

import utils.Elements
import kotlin.random.Random

class ProductsPage(basePage: BasePage) {

    private val basePage: BasePage

    init {
        this.basePage = basePage
    }

    fun addToCart() {
        switchToListView()
        val productList = basePage.driver.findElements(Elements.productList)
        val random = if (productList.size >1) Random.nextInt(1, productList.size) else 1
        if (random != 1) {
            basePage.driver.findElement(Elements.addToCart(random)).click()
        } else {
            basePage.driver.findElement(Elements.addToCart).click()
        }
    }

    fun continueShopping() {
        basePage.driver.findElement(Elements.continueShopping).click()
    }

    fun goToCheckOut() {
        basePage.driver.findElement(Elements.checkout)
    }

    private fun switchToListView() {
        basePage.driver.findElement(Elements.listView).click()
    }

}