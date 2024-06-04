package com.example.cinemania

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MysteryPage : AppCompatActivity() {

    // Declaration of UI Elements
    private lateinit var backButton: ImageButton
    private lateinit var incendiesButton: Button
    private lateinit var shutterButton: Button
    private lateinit var apocButton: Button
    private lateinit var sevenButton: Button

    // Function to open a URL in a web browser
    private fun gotoURL(url: String) {
        val uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mystery_page)

        // Initialization of UI Elements
        backButton = findViewById(R.id.backButton)
        incendiesButton = findViewById(R.id.incendiesButton)
        shutterButton = findViewById(R.id.shutterButton)
        apocButton = findViewById(R.id.apocButton)
        sevenButton = findViewById(R.id.sevenButton)

        // Button to return to previous page
        backButton.setOnClickListener{
            val intent = Intent(this, CategoryPage::class.java)
            startActivity(intent)
        }

        // Buttons to open corresponding URLs
        incendiesButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt1255953/")
        }

        shutterButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt1130884/")
        }

        apocButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt0078788/")
        }

        sevenButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt0114369/")
        }
    }
}