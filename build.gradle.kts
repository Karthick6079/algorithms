plugins {
    id("java")
}

group = "org.karthick"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("junit:junit:4.13.1")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter",  "junit-jupiter-engine",  "5.9.1")
}

tasks.test {
    useJUnitPlatform()
}