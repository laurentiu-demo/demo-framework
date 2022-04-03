package environment

import java.util.*

object Environment {

    private val environmentConfiguration = System.getProperty("environmentConfiguration") ?: "qa"
    private val props = javaClass.classLoader.getResourceAsStream("environments/$environmentConfiguration.properties").use {
        println("Environment is loading for: $environmentConfiguration")
        Properties().apply { load(it) }
    }

    operator fun invoke(key: String) = props.getProperty(key) ?: error("Could not find property $key")

}