package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object JavaScript_Template : Template({
    uuid = "2cb49911-8425-4a80-af6d-8e81d9b9b483"
    extId = "JavaScript_Template"
    name = "Template"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCardsGit)

    }

    steps {
        script {
            name = "Restore NPM packages"
            id = "RUNNER_6"
            scriptContent = "npm install"
        }
        script {
            name = "Browser Tests"
            id = "RUNNER_7"
            scriptContent = "npm test -- --single-run --browsers %Browser% --colors false --reporters teamcity"
        }
    }
})
