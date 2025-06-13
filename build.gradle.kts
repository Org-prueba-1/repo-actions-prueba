plugins {
    java
    id("org.sonarqube") version "4.4.1.3373"
}

group = "com.example"
version = "1.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

repositories {
    mavenCentral()
}

sonarqube {
    properties {
        property("sonar.projectKey", "demo-java-app")
        property("sonar.organization", "tu_org_sonarqube") // si usás SonarCloud
        property("sonar.host.url", System.getenv("SONAR_HOST_URL"))
        property("sonar.login", System.getenv("SONAR_TOKEN"))
    }
}
