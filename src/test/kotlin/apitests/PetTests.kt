package apitests

import hooks.ConfigureSetup
import io.restassured.http.ContentType
import io.restassured.module.kotlin.extensions.Given
import io.restassured.module.kotlin.extensions.Then
import io.restassured.module.kotlin.extensions.When
import model.PetModel
import org.apache.http.HttpStatus
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import utils.Settings


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PetTests {
    private var baseUrl: String = ""

    @BeforeAll
    fun setup() {
        ConfigureSetup.initializeSettings()
        baseUrl = Settings.apiBaseUrl
    }

    @Test
    fun `Successfully add a new Pet and expected is ok`() {
        val petModel = PetModel(name = "Saya", photoUrls = emptyList())
        Given {
            contentType(ContentType.JSON)
            body(petModel)
        } When {
            post("$baseUrl/pet")
        } Then {
            log().all()
            statusCode(HttpStatus.SC_OK)
        }
    }

    @Test
    fun `Fail to add a new Pet with wrong information and expected is bad request`() {
        val petModel = PetModel(name = null, photoUrls = null)
        Given {
            contentType(ContentType.JSON)
            body(petModel)
        } When {
            log().all()
            post("$baseUrl/pet")
        } Then {
            log().all()
            statusCode(HttpStatus.SC_BAD_REQUEST)
        }
    }

    @Test
    fun `Fail to add a new Pet with wrong input and expected is bad request`() {
        Given {
            contentType(ContentType.JSON)
            body(
                """
                    {
                    "id": 101700111,
                    "naem": ,
                     }
                """
            )
        } When {
            log().all()
            post("$baseUrl/pet")
        } Then {
            log().all()
            statusCode(HttpStatus.SC_METHOD_NOT_ALLOWED)
        }
    }


    @Test
    fun `Successfully update a pet and expected is ok`() {
        Given {
            contentType(ContentType.JSON)
            body(
                """
                   {
                      "id": 0,
                      "category": {
                        "id": 0,
                        "name": "string"
                      },
                      "name": "doggie",
                      "photoUrls": [
                        "string"
                      ]
                   }
                """
            )
        } When {
            log().all()
            put("$baseUrl/pet")
        } Then {
            log().all()
            statusCode(HttpStatus.SC_OK)
        }
    }

    @Test
    fun `Fail to update a pet and expected is not found`() {
        Given {
            contentType(ContentType.JSON)
            body(
                """
                   {
                      "id": 5.01523,
                      "category": {
                        "id": 0,
                        "name": "string"
                      },
                      "name": "doggie",
                      "photoUrls": [
                        "string"
                      ]
                   }
                """
            )
        } When {
            log().all()
            put("$baseUrl/pet")
        } Then {
            log().all()
            statusCode(HttpStatus.SC_NOT_FOUND)
        }
    }

    @Test
    fun `Fail to update a pet and expected is bad request`() {
        Given {
            contentType(ContentType.JSON)
            body(
                """
                   {
                      "id": "string"
                   }
                """
            )
        } When {
            log().all()
            put("$baseUrl/pet")
        } Then {
            log().all()
            statusCode(HttpStatus.SC_BAD_REQUEST)
        }
    }

    @Test
    fun `Fail to update a pet and expected is bad request due to missing fields`() {
        Given {
            contentType(ContentType.JSON)
            body(
                """
                   {
                      "id": "13"
                   }
                """
            )
        } When {
            log().all()
            put("$baseUrl/pet")
        } Then {
            log().all()
            statusCode(HttpStatus.SC_BAD_REQUEST)
        }
    }
}