package utils

import org.openqa.selenium.By

object Elements {
    // Home Page
    val login: By = By.cssSelector(".login")
    val homeProductList: By = By.cssSelector(".homefeatured > li")

    // Log In Page
    val username: By = By.id("email")
    val password: By = By.id("passwd")
    val submit: By = By.cssSelector("#SubmitLogin > span")

    // My Account Page
    val myAccount: By = By.cssSelector(".page-heading")

    // Search Navigation
    val search: By = By.id("search_query_top")
    val submitSearch: By = By.cssSelector("[name='submit_search']")
    fun category(categoryTitle: String): By = By.cssSelector(".sf-with-ul[title='${categoryTitle}']")
    fun subcategory(subcategoryTitle: String): By = By.xpath("//a[text()='$subcategoryTitle']")

    // Product Page
    val listView: By = By.id("list")
    fun addToCart(index: Int) : By = By.cssSelector(".button[data-id-product='$index'] > span")
    val addToCart: By = By.xpath(" //span[text()='Add to cart']")
    val productList: By = By.cssSelector(".product_list > li")
    val continueShopping: By = By.cssSelector(".continue")
    val checkout: By = By.xpath("//a[@title='Proceed to checkout']")
    val proceedCheckout: By = By.xpath("//span[.='Proceed to checkout']")
    val proceedCheckoutShipping: By = By.xpath("//button[@name='processCarrier']/span[contains(.,'Proceed to checkout')]")

    // CheckoutPage
    val increaseItemsInCart: By = By.xpath("//a[contains(@class, 'cart_quantity_up') and @title='Add']")
    val subtractItemsInCart: By = By.xpath("//a[contains(@class, 'cart_quantity_down') and @title='Substract']")
    val removeItemFromCart: By = By.xpath("//a[@title='Delete']")
    val termsOfService: By = By.id("cgv")
    val bankWire: By = By.cssSelector(".bankwire")
    val cheque: By = By.cssSelector("..cheque")
}