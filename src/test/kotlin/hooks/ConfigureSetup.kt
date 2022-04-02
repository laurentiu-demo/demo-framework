package hooks

import environment.Environment
import utils.Settings

object ConfigureSetup {
    fun initializeSettings() {
        val environment = Environment()
        Settings.baseUrl = environment.getEnvironmentValues("baseUrl")
        Settings.username = environment.getEnvironmentValues("username")
        Settings.password = environment.getEnvironmentValues("password")
        println("Settings configuration complete")
    }
}