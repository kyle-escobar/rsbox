plugins {
    id("de.fayard.refreshVersions") version "0.50.2"
}

rootProject.name = "rsbox"

include(":client")

include(":server")
include(":server:logger")
