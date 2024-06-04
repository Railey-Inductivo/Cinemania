package com.example.cinemania

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class FantasyPage : AppCompatActivity() {

    // Declaration of UI Elements
    private lateinit var backButton: ImageButton
    private lateinit var barbieButton: Button
    private lateinit var wonkaButton: Button
    private lateinit var ghostButton: Button
    private lateinit var jumanjiButton: Button

    // Function to open a URL in a web browser
    private fun gotoURL(url: String) {
        val uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy_page)

        // Initialization of UI Elements
        backButton = findViewById(R.id.backButton)
        barbieButton = findViewById(R.id.barbieButton)
        wonkaButton = findViewById(R.id.wonkaButton)
        ghostButton = findViewById(R.id.ghostButton)
        jumanjiButton = findViewById(R.id.jumanjiButton)

        // Button to return to previous page
        backButton.setOnClickListener{
            val intent = Intent(this, CategoryPage::class.java)
            startActivity(intent)
        }

        // Buttons to open corresponding URLs
        barbieButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt1517268/")
        }

        wonkaButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt6166392/")
        }

        ghostButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt0087332/")
        }

        jumanjiButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt0113497/")
        }
    }
}