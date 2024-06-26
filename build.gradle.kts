plugins {
    id("java")
}

group = "com.tkachov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("io.appium:java-client:9.2.3")
    implementation ("org.springframework.boot:spring-boot-autoconfigure:3.3.1")
    testImplementation ("org.springframework.boot:spring-boot-starter-test:3.3.1")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
