package com.example.cinemania

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ComedyPage : AppCompatActivity() {

    // Declaration of UI Elements
    private lateinit var backButton: ImageButton
    private lateinit var hangoverButton: Button
    private lateinit var dictatorButton: Button
    private lateinit var millersButton: Button
    private lateinit var tedButton: Button

    // Function to open a URL in a web browser
    private fun gotoURL(url: String) {
        val uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comedy_page)

        // Initialization of UI Elements
        backButton = findViewById(R.id.backButton)
        hangoverButton = findViewById(R.id.hangoverButton)
        dictatorButton = findViewById(R.id.dictatorButton)
        millersButton = findViewById(R.id.millersButton)
        tedButton = findViewById(R.id.tedButton)

        // Button to return to previous page
        backButton.setOnClickListener{
            val intent = Intent(this, CategoryPage::class.java)
            startActivity(intent)
        }

        // Buttons to open corresponding URLs
        hangoverButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt1119646/")
        }

        dictatorButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt1645170/")
        }

        millersButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt1723121/")
        }

        tedButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt1637725/")
        }
    }
}