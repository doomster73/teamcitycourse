package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_03IE : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "javascript_03IE"
    extId = "JavaScript_03IE"
    name = "03. IE"

    params {
        param("Browser", "IE")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
