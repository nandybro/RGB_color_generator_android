package com.youthpower.helloworld
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.createbtnid)?.setOnClickListener {
            val red = findViewById<TextInputEditText>(R.id.redchannelid)?.text.toString()
            val green = findViewById<TextInputEditText>(R.id.greenchannelid)?.text.toString()
            val blue = findViewById<TextInputEditText>(R.id.bluechannelid)?.text.toString()
            val colordisplay=findViewById<TextView>(R.id.displaytextid)
            if (red.isNotEmpty() && green.isNotEmpty() && blue.isNotEmpty())
            {
                val colorcode="#".plus(red).plus(green).plus(blue)
                colordisplay.text=colorcode
                val colorAsInt= Color.parseColor(colorcode)
                colordisplay.setBackgroundColor(colorAsInt)
            }
        }
    }
}