dependencies {
    implementation(project(":toolbox:updater"))
    implementation("com.github.ajalt.clikt:clikt:_")
}

tasks {
    register<JavaExec>("run toolbox") {
        dependsOn(build.get())
        group = "toolbox"
        mainClass.set("io.rsbox.toolbox.Toolbox")
        workingDir = rootProject.projectDir
        classpath = sourceSets["main"].runtimeClasspath
    }

    register<JavaExec>("run updater") {
        dependsOn(project(":toolbox:updater").tasks.compileKotlin)
        group = "toolbox"
        mainClass.set("io.rsbox.toolbox.Toolbox")
        args = listOf("updater")
        workingDir = rootProject.projectDir
        classpath = sourceSets["main"].runtimeClasspath
    }
}