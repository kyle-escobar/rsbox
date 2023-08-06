plugins {
    id("org.openjfx.javafxplugin") version "0.0.13"
}

dependencies {
    implementation("com.formdev:flatlaf:_")
    implementation("com.formdev:flatlaf-intellij-themes:_")
    implementation("no.tornado:tornadofx:_")
    implementation("org.ow2.asm:asm:_")
    implementation("org.ow2.asm:asm-commons:_")
    implementation("org.ow2.asm:asm-util:_")
    implementation("org.ow2.asm:asm-tree:_")
}

javafx {
    version = "11"
    modules = listOf("javafx.controls", "javafx.web", "javafx.graphics", "javafx.swing")
}