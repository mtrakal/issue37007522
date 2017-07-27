package cz.mtrakal.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.setTitle(R.string.title) // doesn't work when move under setSupportActionBar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // doesn't work when move before setSupportActionBar
        toolbar.setNavigationOnClickListener({ finish() }) // doesn't work when move before setSupportActionBar
    }
}
