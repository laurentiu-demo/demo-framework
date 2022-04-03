package pages

import org.openqa.selenium.WebDriver
import utils.Elements

class SearchNavigation(private val driver: WebDriver) {

        fun searchItem(item: String) {
            driver.findElement(Elements.search).sendKeys(item)
            driver.findElement(Elements.submitSearch).click()
        }

}
