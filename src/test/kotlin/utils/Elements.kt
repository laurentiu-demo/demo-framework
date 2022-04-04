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
}