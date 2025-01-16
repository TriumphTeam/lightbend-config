import dev.triumphteam.root.configure.PublishConfigure

plugins {
    `java-library`
    `maven-publish`
    signing
    id("dev.triumphteam.root")
}

root {
    configurePublishing {
        configure {

            from(components["java"])

            snapshotsRepo(PublishConfigure.TRIUMPH_SNAPSHOTS) {
                username = providers.gradleProperty("triumph.repo.user").orNull ?: ""
                password = providers.gradleProperty("triumph.repo.token").orNull ?: ""
            }

            releasesRepo(PublishConfigure.TRIUMPH_PUBLIC) {
                username = providers.gradleProperty("triumph.repo.user").orNull ?: ""
                password = providers.gradleProperty("triumph.repo.token").orNull ?: ""
            }
        }
    }
}