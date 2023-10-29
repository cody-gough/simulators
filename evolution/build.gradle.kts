plugins {
    kotlin("jvm") version "1.9.10"
}

kotlin {
    target {
        compilations.configureEach {
            kotlinOptions {
                jvmTarget = "19"
            }
        }
    }
}

version = "SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}