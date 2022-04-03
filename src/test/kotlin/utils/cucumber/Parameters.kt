package utils.cucumber

import io.cucumber.java.ParameterType

@ParameterType(name="category", value="Women|Dresses|T-Shirts")
fun category(category: String): String {
    return category
}
@ParameterType("Blouses|T-shirts|Evening Dresses")
fun subcategory(subcategory: String): String {
    return subcategory
}