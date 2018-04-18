package ir.nadcup.roboro.editor

import android.content.Context
import android.content.Intent
import com.google.blockly.android.AbstractBlocklyActivity
import com.google.blockly.android.codegen.CodeGenerationRequest

class EditorActivity : AbstractBlocklyActivity() {

    companion object {
        fun start(invokerContext: Context) {
            val startIntent = Intent(invokerContext, EditorActivity::class.java)
            invokerContext.startActivity(startIntent)
        }
    }

    override fun getToolboxContentsXmlPath(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBlockDefinitionsJsonPaths(): MutableList<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getGeneratorsJsPaths(): MutableList<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCodeGenerationCallback(): CodeGenerationRequest.CodeGeneratorCallback {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
