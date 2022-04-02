import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    application
}

group = "me.laure"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    // Assertion dependency
    testImplementation("org.assertj:assertj-core:3.22.0")

    // Selenium
    testImplementation("org.seleniumhq.selenium:selenium-java:4.1.3")

    // Drivers
    testImplementation("io.github.bonigarcia:webdrivermanager:5.1.0")

    // Junit Parameterized
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.8.2")



}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}