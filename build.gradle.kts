import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    application
    id ("se.thinkcode.cucumber-runner") version "0.0.8"
    kotlin("plugin.serialization") version "1.6.10"
}

group = "me.laure"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val ktor_version = "1.6.8"

    testImplementation(kotlin("test"))

    // Assertion dependency
    testImplementation("org.assertj:assertj-core:3.22.0")

    // Selenium
    testImplementation("org.seleniumhq.selenium:selenium-java:4.1.3")

    // Drivers
    testImplementation("io.github.bonigarcia:webdrivermanager:5.1.0")

    // Junit Parameterized
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.8.2")
    testImplementation("org.junit.platform:junit-platform-suite-api:1.8.2")

    // Interaction with APIs, serialization & deserialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
    implementation("io.ktor:ktor-client-core:$ktor_version")
    implementation("io.ktor:ktor-client-json:$ktor_version")
    implementation("io.ktor:ktor-client-logging:$ktor_version")
    implementation("io.ktor:ktor-client-serialization:$ktor_version")


    // Cucumber
    testImplementation(platform("io.cucumber:cucumber-bom:7.2.3"))
    testImplementation("io.cucumber:cucumber-java")
    testImplementation("io.cucumber:cucumber-junit-platform-engine")
    testImplementation("org.junit.platform:junit-platform-suite")
    testImplementation("org.junit.jupiter:junit-jupiter")

    // Cucumber dependency injection through constructor
    testImplementation("io.cucumber:cucumber-picocontainer:7.2.3")
}

tasks.test {
    systemProperties = System.getProperties().map { property -> property.key.toString() to property.value.toString() }.toMap()
    useJUnitPlatform()
    systemProperty("cucumber.junit-platform.naming-strategy", "long")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}