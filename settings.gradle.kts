import dev.triumphteam.root.includeProject

dependencyResolutionManagement {
    includeBuild("build-logic")
    repositories.gradlePluginPortal()
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.triumphteam.dev/releases")
    }
}

rootProject.name = "lightbend"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

plugins {
    id("dev.triumphteam.root.settings") version "0.0.14"
}

listOf("config").forEach(::includeProject)
