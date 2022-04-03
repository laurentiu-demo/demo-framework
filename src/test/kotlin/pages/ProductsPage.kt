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
        productList.forEach { element ->
            println(element.text)
        }
        val random = Random.nextInt(0,productList.size)
        basePage.driver.findElement(Elements.addToCart(random)).click()
        Thread.sleep(5000)

    }

    private fun switchToListView() {
        basePage.driver.findElement(Elements.listView).click()
    }

}