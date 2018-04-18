package ir.nadcup.roboro.editor

import android.content.Context
import android.content.Intent
import com.google.blockly.android.AbstractBlocklyActivity
import com.google.blockly.android.codegen.CodeGenerationRequest
import com.google.blockly.android.codegen.LoggingCodeGeneratorCallback
import com.google.blockly.model.DefaultBlocks
import java.util.*


class EditorActivity : AbstractBlocklyActivity() {

    companion object {
        private val JAVASCRIPT_GENERATORS = Arrays.asList(
                // Custom block generators go here. Default blocks are already included.
        ""
        )

        fun start(invokerContext: Context) {
            val startIntent = Intent(invokerContext, EditorActivity::class.java)
            invokerContext.startActivity(startIntent)
        }
    }

    private var mCodeGeneratorCallback: CodeGenerationRequest.CodeGeneratorCallback = LoggingCodeGeneratorCallback(this, "LoggingTag")

    override fun onInitBlankWorkspace() {
        // Initialize available variable names.
        controller.addVariable("item")
    }

    override fun getToolboxContentsXmlPath() = "default/toolbox.xml"

    override fun getBlockDefinitionsJsonPaths(): MutableList<String> {
        val assetPaths = ArrayList(DefaultBlocks.getAllBlockDefinitions())
        // Append your own block definitions here.
        return assetPaths
    }

    override fun getGeneratorsJsPaths() = JAVASCRIPT_GENERATORS

    override fun getCodeGenerationCallback() = mCodeGeneratorCallback

}
