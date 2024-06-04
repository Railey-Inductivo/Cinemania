package com.example.cinemania

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class RomancePage : AppCompatActivity() {

    // Declaration of UI Elements
    private lateinit var backButton: ImageButton
    private lateinit var fivefeetButton: Button
    private lateinit var lalaButton: Button
    private lateinit var anyoneButton: Button
    private lateinit var herButton: Button

    // Function to open a URL in a web browser
    private fun gotoURL(url: String) {
        val uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romance_page)

        // Initialization of UI Elements
        backButton = findViewById(R.id.backButton)
        fivefeetButton = findViewById(R.id.fivefeetButton)
        lalaButton = findViewById(R.id.lalaButton)
        anyoneButton = findViewById(R.id.anyoneButton)
        herButton = findViewById(R.id.herButton)

        // Button to return to previous page
        backButton.setOnClickListener{
            val intent = Intent(this, CategoryPage::class.java)
            startActivity(intent)
        }

        // Buttons to open corresponding URLs
        fivefeetButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt6472976/")
        }

        lalaButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt3783958/")
        }

        anyoneButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt26047818/")
        }

        herButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt1798709/")
        }
    }
}