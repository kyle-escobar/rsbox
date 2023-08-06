plugins {
    id("de.fayard.refreshVersions") version "0.50.2"
}

rootProject.name = "rsbox"

include(":toolbox")
include(":toolbox:updater")

include(":client")

include(":server")
include(":server:logger")
include(":server:common")
include(":server:util")
include(":server:config")
include(":server:cache")
include(":server:engine")
