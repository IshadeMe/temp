plugins {
    id("java")
    id("java-gradle-plugin")
    id("maven-publish")
//    id("ru.fedor.apiGen") version "1.0-SNAPSHOT"
}


gradlePlugin {
    plugins {
        create("apiGen") {
            group = "ru.fedor"
            version = "1.1"
            id = "ru.fedor.apiGen"
            implementationClass = "project.JustPojo"
        }
    }
}

//publishing {
//    publications {
//        create<MavenPublication>("apiGen") {
//            from(components["java"])
//        }
//    }
//}


//group = "ru.fedor"
//version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
//    implementation(gradleApi())
//    implementation(localGroovy())
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

