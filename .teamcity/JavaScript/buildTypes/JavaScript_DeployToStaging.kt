package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_DeployToStaging : BuildType({
    uuid = "ebe01d8e-73ec-4860-8de1-aeb3b2192fb4"
    extId = "JavaScript_DeployToStaging"
    name = "03. Deploy To Staging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCardsGit)

    }

steps {
        script {
            name = "IIS Deploy"
            id = "RUNNER_6"
            scriptContent = """
rmdir /S /Q \inetpub\wwwroot
xcopy /S /I /Y app \inetpub\wwwroot\

"""
        }
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_02Chrome) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_03Firefox) {
            snapshot {
            }
        }
    }
})
