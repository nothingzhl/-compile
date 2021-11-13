plugins {
    java
}

group = "org.zhl"
version = "1.0-SNAPSHOT"

repositories {
    maven("http://maven.aliyun.com/nexus/content/groups/public/")
    jcenter()
    google()
    mavenCentral()
}

dependencies {
    implementation("net.java.dev.javacc:javacc:7.0.10")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}