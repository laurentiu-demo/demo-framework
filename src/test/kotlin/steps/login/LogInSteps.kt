package steps.login

import environment.Environment
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import pages.BasePage
import pages.HomePage
import pages.LogInPage
import pages.MyAccountPage


class LogInSteps(basePage: BasePage) : BasePage() {

    private val basePage: BasePage

    init {
        this.basePage = basePage
    }

    private val homePage = HomePage(basePage)
    private val logInPage = LogInPage(basePage)
    private val myAccountPage = MyAccountPage(basePage)


    @Given("I am on the home page")
    fun iAmOnTheHomePage() {
        homePage.goToHomePage()
    }

    @Then("I go to Log In Page")
    fun iGoToLogInPage() {
        homePage.clickOnSignIn()
    }

    @Then("I insert the {string} and {string}")
    fun iInsertTheUsernameAndPassword(username: String, password: String) {
        val user = if (username == "default") Environment("username") else username
        val pwd = if (username == "default") Environment("password") else password
        logInPage.authenticate(user, pwd)
    }

    @Then("I check that I am on my account page")
    fun iCheckThatIAmOnMyAccountPage() {
        myAccountPage.checkIamOnMyAccountPage()
    }
}