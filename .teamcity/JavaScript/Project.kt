package JavaScript

import JavaScript.buildTypes.*
import JavaScript.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "4d3d75ed-d7a8-4288-a47c-b67ec75e3c55"
    extId = "JavaScript"
    parentId = "_Root"
    name = "JavaScript"

    vcsRoot(JavaScript_HttpsGithubComG0t4teamcityCourseCardsGit)

    buildType(JavaScript_DeployToStaging)
    buildType(JavaScript_02Chrome)
    buildType(JavaScript_01FastTests)
    buildType(JavaScript_03Firefox)

    template(JavaScript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "HttpsGithubComDoomster73teamcitycourseGit"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            param("credentialsStorageType", "credentialsJSON")
        }
    }
})
