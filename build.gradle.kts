plugins {
    // We are building java code to the JVM
    java

    // We are also building kotlin code to the JVM
    kotlin("jvm") version "1.6.10"

    // This plugin lets us run the bot outside of an IDE using `gradle run`.
    application
}

// Configuration for `gradle run`
application {
    mainClassName = "com.cwpcoomber.norush20.BotKt"
}

// This is used if you export artifacts from your/ code, such as a .jar.
// Convention is that it matches the package names that your code uses.
group = "com.cwpcoomber"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.github.ocraft:ocraft-s2client-bot:0.4.9")  // From mavenCentral()

    // We don't currently have unit tests, but you might want to use these libraries if you write some.
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}