package com.example.cinemania

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class HorrorPage : AppCompatActivity() {

    // Declaration of UI Elements
    private lateinit var backButton: ImageButton
    private lateinit var stingButton: Button
    private lateinit var talktomeButton: Button
    private lateinit var barbarianButton: Button
    private lateinit var abigailButton: Button

    // Function to open a URL in a web browser
    private fun gotoURL(url: String) {
        val uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horror_page)

        // Initialization of UI Elements
        backButton = findViewById(R.id.backButton)
        stingButton = findViewById(R.id.stingButton)
        talktomeButton = findViewById(R.id.talktomeButton)
        barbarianButton = findViewById(R.id.barbarianButton)
        abigailButton = findViewById(R.id.abigailButton)

        // Button to return to previous page
        backButton.setOnClickListener{
            val intent = Intent(this, CategoryPage::class.java)
            startActivity(intent)
        }

        // Buttons to open corresponding URLs
        stingButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt20112746/")
        }

        talktomeButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt10638522/")
        }

        barbarianButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt15791034/?ref_=sr_i_20")
        }

        abigailButton.setOnClickListener {
            gotoURL("https://www.imdb.com/title/tt27489557/?ref_=sr_i_3")
        }
    }
}