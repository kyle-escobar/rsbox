package io.rsbox.toolbox.updater.ui.view.tab.src

import io.rsbox.toolbox.updater.asm.ClassEntry
import io.rsbox.toolbox.updater.asm.Matchable
import io.rsbox.toolbox.updater.asm.MemberEntry
import io.rsbox.toolbox.updater.asm.MethodEntry
import io.rsbox.toolbox.updater.decompile.Decompiler
import io.rsbox.toolbox.updater.ui.Events
import javafx.concurrent.Worker
import javafx.scene.control.Tab
import javafx.scene.web.WebView
import tornadofx.*

class SrcSourceTab : Tab("Source") {

    private val webView = WebView()
    private var task: (() -> Unit)? = null

    private var lastClass: ClassEntry? = null
    private var lastMatchable: Matchable<*>? = null

   init {
       webView.engine.loadWorker.stateProperty().addListener { observable, oldValue, newValue ->
           if(newValue == Worker.State.SUCCEEDED) {
               content = webView
               if(task != null) {
                   task!!.invoke()
                   task = null
               }
           }
       }

       content = webView
       displayText("No Class Selected")

       Events.selectedSrcChange.subscribe {
           val clsTarget = it as? ClassEntry ?: (it as? MemberEntry<*>)?.cls ?: return@subscribe
           val matchableTarget = it

           if(lastClass == clsTarget) {
               lastClass = clsTarget
               lastMatchable = matchableTarget
               scrollTo(matchableTarget)
           } else {
               lastClass = clsTarget
               lastMatchable = matchableTarget

               displayText("Decompiling...")
               runAsync {
                   Decompiler(clsTarget).decompile()
               } ui {
                   displayText(it)
               }
           }
       }
   }

    fun displayText(text: String) {
        webView.engine.loadContent(template.replace("%text%", text))
    }

    @Suppress("UNCHECKED_CAST")
    fun scrollTo(node: Matchable<*>) {
        val name = when(node.name) {
            "<init>", "<clinit>" -> (node as MemberEntry<MethodEntry>).cls.name
            else -> node.name
        }
        webView.engine.executeScript("window.scrollBy(0, document.evaluate(\"//*[text()[contains(., \'$name\')]][last()]\", document.body).iterateNext().getBoundingClientRect().top);" +
                "document.evaluate(\"//*[text()[contains(., '$name')]][last()]\", document.body).iterateNext().style.background = \"lightblue\";" +
                "setTimeout(function() { document.evaluate(\"//*[text()[contains(., '$name')]][last()]\", document.body).iterateNext().style.background = null; }, 1500);")
    }

    companion object {
        private val template = SrcSourceTab::class.java.getResourceAsStream("/ui/source.template.html")!!.bufferedReader().readText()
    }
}