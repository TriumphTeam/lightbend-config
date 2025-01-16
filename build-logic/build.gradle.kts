import dev.triumphteam.root.root

plugins {
    `kotlin-dsl`
    id("dev.triumphteam.root.logic") version "0.0.14"
}

dependencies {
    // Hack to allow version catalog inside convention plugins
    // implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))

    root("0.0.14")
}
