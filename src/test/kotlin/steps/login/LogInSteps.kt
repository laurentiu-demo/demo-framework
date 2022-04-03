package steps.login

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import pages.BasePage
import pages.HomePage


class LogInSteps(basePage: BasePage) : BasePage() {

    private val basePage: BasePage
    init {
        this.basePage = basePage
    }

    private val homePage = HomePage(basePage)


    @Given("I am on the home page")
    fun i_am_on_the_home_page() {
    homePage.goToHomePage()
    }

    @Then("I go to Log In Page")
    fun i_go_to_log_in_page() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("I insert the {string} and {string}")
    fun i_insert_the_and(string: String?, string2: String?) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("I check that I am on home page")
    fun i_check_that_i_am_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
    }
}