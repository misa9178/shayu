package tw.pu.edu.csim.s1102442.shayu

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.MenuItem
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Button
//import kotlin.collections.EmptyList.size

class MainActivity : AppCompatActivity() {

    lateinit var txv: TextView
    lateinit var txv2: TextView
    var size: Float = 30f

    //@SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
        txv2 = findViewById(R.id.txv2)


    }

    fun display(v: View) {
        txv.text = "得到勇氣♡"
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        if (txv2.text == "烤肉") {
            txv2.text = "蛋包飯"
        } else {
            txv2.text = "烤肉"
        }
        return true
    }

    fun bigger(view: View) {
        size++
        findViewById<TextView>(R.id.btn4).setTextSize(size)
    }
}





