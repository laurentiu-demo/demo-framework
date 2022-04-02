package environment

import java.util.*

class Environment {

    private val environmentConfiguration = System.getProperty("environmentConfiguration") ?: "qa"
    private val props = javaClass.classLoader.getResourceAsStream("environments/$environmentConfiguration.properties").use {
        Properties().apply { load(it) }
    }

    fun getEnvironmentValues(key: String): String {
        return props.getProperty(key) ?: error("Could not find property $key")
    }
}