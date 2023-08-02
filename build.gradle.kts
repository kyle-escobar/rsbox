plugins {
    kotlin("jvm") version "1.7.21"
}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "io.rsbox"
    version = "1.0.0"

    repositories {
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        testImplementation(kotlin("test"))
    }

    tasks.test {
        useJUnitPlatform()
    }
}