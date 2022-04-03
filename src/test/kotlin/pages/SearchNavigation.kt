package pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import utils.Elements

class SearchNavigation(private val driver: WebDriver) {

    fun searchItem(item: String) {
        driver.findElement(Elements.search).sendKeys(item)
        driver.findElement(Elements.submitSearch).click()
    }

    fun chooseCategory(category: String) {
        val categoryElement = driver.findElement(Elements.category(category))
        val actions = Actions(driver)
        actions.moveToElement(categoryElement).perform()
    }

    fun chooseSubcategory(subcategory: String) {
        driver.findElement(Elements.subcategory(subcategory)).click()
        Thread.sleep(3000)
    }

}
