package com.example.cinemania

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ScifiPage : AppCompatActivity() {

    // Declaration of UI Elements
    private lateinit var backButton: ImageButton
    private lateinit var interstellarButton: Button
    private lateinit var arrivalButton: Button
    private lateinit var machinaButton: Button
    private lateinit var inceptionButton: Button

    // Function to open a URL in a web browser
    private fun gotoURL(url: String) {
        val uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scifi_page)

        // Initialization of UI Elements
        backButton = findViewById(R.id.backButton)
        interstellarButton = findViewById(R.id.interstellarButton)
        arrivalButton = findViewById(R.id.arrivalButton)
        machinaButton = findViewById(R.id.machinaButton)
        inceptionButton = findViewById(R.id.inceptionButton)

        // Button to return to previous page
        backButton.setOnClickListener{
            val intent = Intent(this, CategoryPage::class.java)
            startActivity(intent)
        }

        // Buttons to open corresponding URLs
        interstellarButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt0816692/")
        }

        arrivalButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt2543164/")
        }

        machinaButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt0470752/")
        }

        inceptionButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt1375666/")
        }
    }
}