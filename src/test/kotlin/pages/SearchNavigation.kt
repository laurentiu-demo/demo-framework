package pages

import org.openqa.selenium.WebDriver
import utils.Elements
import utils.enums.Category

class SearchNavigation(private val driver: WebDriver) {

    fun searchItem(item: String) {
        driver.findElement(Elements.search).sendKeys(item)
        driver.findElement(Elements.submitSearch).click()
    }

    fun chooseCategory(category: Category) {
       val element = driver.findElement(Elements.category(category.name))
        println(element.text)
    }

}
