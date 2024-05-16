plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.slf4j:slf4j-api:2.0.13")
    implementation("ch.qos.logback:logback-classic:1.5.6")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.0-M1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.0-M1")
}

tasks.test {
    useJUnitPlatform()
}