package pages

import org.assertj.core.api.Assertions.assertThat
import utils.Elements

class MyAccountPage(basePage: BasePage) : BasePage() {

    private val basePage: BasePage

    init {
        this.basePage = basePage
    }

    fun checkIamOnMyAccountPage() {
        basePage.driver.findElement(Elements.myAccount).isDisplayed
        val url = basePage.driver.currentUrl
        assertThat(url).contains("my-account")
    }
}