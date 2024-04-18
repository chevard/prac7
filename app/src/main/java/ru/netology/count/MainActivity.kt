package ru.netology.count
import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0
    private var homaCounter: Int = 0
    private lateinit var grText: TextView
    private lateinit var countText: TextView
    private lateinit var homaText: TextView
    private lateinit var grBtn: Button
    private lateinit var countBtn: Button
    private lateinit var homaBtn: ImageButton
    @SuppressLint("MissingInflatedId", "SetTextI18n", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        grText = findViewById(R.id.greetingsText)
        homaText = findViewById(R.id.homaText)
        countText = findViewById(R.id.textCount)
        grBtn = findViewById(R.id.greetingsBtn)
        countBtn = findViewById(R.id.countBtn)
        homaBtn = findViewById(R.id.homyakBtn)
        grBtn.setOnClickListener {
            grText.text = "Привет, друг"
        }
        countBtn.setOnClickListener {
            countText.text = "Я нажала на кнопку ${++counter} раз"
        }
        homaBtn.setOnClickListener {
            homaText.text = "Я нажала на хомяка ${++homaCounter} раз"
        }
    }
}