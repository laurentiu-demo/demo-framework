package hooks

import io.cucumber.java.After
import io.cucumber.java.Before

class TestInitialize {

    @Before
    fun setup() {
        ConfigureSetup.initializeSettings()

    }

    @After
    fun tearDown() {

    }
}