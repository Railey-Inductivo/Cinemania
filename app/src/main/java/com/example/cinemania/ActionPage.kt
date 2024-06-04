package com.example.cinemania

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ActionPage : AppCompatActivity() {

    // Declaration of UI Elements
    private lateinit var backButton: ImageButton
    private lateinit var fallButton: Button
    private lateinit var duneButton: Button
    private lateinit var monkeyButton: Button
    private lateinit var beekeeperButton: Button

    // Function to open a URL in a web browser
    private fun gotoURL(url: String) {
        val uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_page)

        // Initialization of UI Elements
        backButton = findViewById(R.id.backButton)
        fallButton = findViewById(R.id.fallButton)
        duneButton = findViewById(R.id.duneButton)
        monkeyButton = findViewById(R.id.monkeyButton)
        beekeeperButton = findViewById(R.id.beekeeperButton)

        // Button to return to previous page
        backButton.setOnClickListener{
            val intent = Intent(this, CategoryPage::class.java)
            startActivity(intent)
        }

        // Buttons to open corresponding URLs
        fallButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt1684562/")
        }

        duneButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt1160419/")
        }

        monkeyButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt9214772/")
        }

        beekeeperButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt15314262/")
        }
    }
}