package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object JavaScript_01FastTests : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template)
    uuid = "ff029583-5524-4742-b663-6e1c9189a617"
    extId = "JavaScript_01FastTests"
    name = "01. Fast Tests"

    params {
        param("Browser", "PhantomJS")
    }
})
