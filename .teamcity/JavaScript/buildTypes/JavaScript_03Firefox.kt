package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_03Firefox : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "63d4390c-94b0-4ae6-bd75-d2b1de95ee86"
    extId = "JavaScript_03Firefox"
    name = "02. Firefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
