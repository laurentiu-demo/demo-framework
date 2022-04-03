package utils

import org.openqa.selenium.By

object Elements {
    // Home Page
    val login: By = By.cssSelector(".login")

    // Log In Page
    val username: By = By.id("email")
    val password: By = By.id("passwd")
    val submit: By = By.cssSelector("#SubmitLogin > span")

    // My Account Page
    val myAccount: By = By.cssSelector(".page-heading")
}