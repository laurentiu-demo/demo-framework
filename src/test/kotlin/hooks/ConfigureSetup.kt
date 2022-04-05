package hooks

import environment.Environment
import utils.Settings

object ConfigureSetup {
    fun initializeSettings() {
        Settings.baseUrl = Environment("baseUrl")
        Settings.apiBaseUrl = Environment("apiBaseUrl")
        Settings.username = Environment("username")
        Settings.password = Environment("password")
        println("Settings configuration complete")
    }
}