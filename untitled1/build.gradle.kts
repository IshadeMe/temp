plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
//    implementation("ru.fedor.apiGen:ru.fedor.apiGen.gradle.plugin:1.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

//apply(null,"ru.fedor.apiGen")
tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

buildscript {
    repositories {
        gradlePluginPortal()
        mavenLocal()
    }
    dependencies {
        classpath("ru.fedor.apiGen:ru.fedor.apiGen.gradle.plugin:1.1")
    }
}
apply(plugin = "ru.fedor.apiGen")

