package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_02Chrome : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "ba88cf40-419e-4e61-905c-e42b4858d557"
    extId = "JavaScript_02Chrome"
    name = "02. Chrome"

    params {
        param("Browser", "Chrome")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
