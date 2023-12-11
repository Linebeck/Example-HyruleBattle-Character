plugins {
    java
    kotlin("jvm") version "1.7.10"
    id("io.papermc.paperweight.userdev") version "1.5.5"
}

group = "com.linebeck.characters"
version = "1.0"

repositories {
    mavenCentral()
    maven { setUrl("https://jitpack.io") }
}

dependencies {
    paperweight.paperDevBundle("1.20-R0.1-SNAPSHOT")
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
    compileOnly("com.github.Linebeck:HyruleBattle-API:1.0.0")
}

tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xno-param-assertions", "-Xno-call-assertions")
    }
}

tasks.named("jar").configure {
    enabled = false
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}