package com.example.cinemania

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class AdventurePage : AppCompatActivity() {

    // Declaration of UI Elements
    private lateinit var backButton: ImageButton
    private lateinit var madmaxButton: Button
    private lateinit var apesButton: Button
    private lateinit var damselButton: Button
    private lateinit var hoursButton: Button

    // Function to open a URL in a web browser
    private fun gotoURL(url: String) {
        val uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventure_page)

        // Initialization of UI Elements
        backButton = findViewById(R.id.backButton)
        madmaxButton = findViewById(R.id.madmaxButton)
        apesButton = findViewById(R.id.apesButton)
        damselButton = findViewById(R.id.damselButton)
        hoursButton = findViewById(R.id.hoursButton)

        // Button to return to previous page
        backButton.setOnClickListener{
            val intent = Intent(this, CategoryPage::class.java)
            startActivity(intent)
        }

        // Buttons to open corresponding URLs
        madmaxButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt0079501/")
        }

        apesButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt0133152/")
        }

        damselButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt13452446/")
        }

        hoursButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt1542344/")
        }
    }
}