
// �� ��� �������
plugins {
    kotlin("jvm") version "1.8.20"
    application
}

group = "ru.youngstanis"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.0-Beta")
    implementation("com.auth0:java-jwt:3.12.1")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

tasks.test {
    useJUnitPlatform()
}

// ��� �����������
kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}
