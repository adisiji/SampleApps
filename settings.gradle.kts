enableFeaturePreview("VERSION_CATALOGS")

pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // Register the AndroidX snapshot repository first so snapshots don't attempt (and fail)
        // to download from the non-snapshot repositories
        maven(url = "https://androidx.dev/snapshots/builds/8455591/artifacts/repository") {
            content {
                // The AndroidX snapshot repository will only have androidx artifacts, don't
                // bother trying to find other ones
                includeGroupByRegex("androidx\\..*")
            }
        }
        google()
        mavenCentral()
    }
}
rootProject.name = "Apps"
include(":app")
include(":lint")
include(":core-common")
//include(":core-data")
include(":core-designsystem")
include(":core-model")
include(":core-navigation")
include(":core-testing")
include(":core-ui")
include(":feature-list")
