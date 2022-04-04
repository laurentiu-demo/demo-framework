package utils.cucumber

import io.cucumber.java.ParameterType

@ParameterType(name="category", value="Women|Dresses|T-Shirts")
fun category(category: String): String {
    return category
}
@ParameterType("Blouses|T-shirts|Evening Dresses|Casual Dresses")
fun subcategory(subcategory: String): String {
    return subcategory
}

@ParameterType("bank wire|pay by check")
fun payment(payment: String): String {
    return payment
}