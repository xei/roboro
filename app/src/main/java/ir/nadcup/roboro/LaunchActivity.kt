package ir.nadcup.roboro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ir.nadcup.roboro.editor.EditorActivity

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        EditorActivity.start(this)
        finish()
    }
}
