package com.example.cinemania

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class CategoryPage : AppCompatActivity() {

    // Declaration of button and pop-up modal variables to display the instruction page.
    private lateinit var instructionbutton: ImageButton
    private lateinit var nDialog: Dialog

    // Declaration of variables for the greeting text and shared preferences
    private lateinit var greetingText: TextView
    private lateinit var sharedPreferences: SharedPreferences

    // Declaration of category buttons
    private lateinit var horrorButton: ImageButton
    private lateinit var actionButton: ImageButton
    private lateinit var adventureButton: ImageButton
    private lateinit var comedyButton: ImageButton
    private lateinit var romanceButton: ImageButton
    private lateinit var scifiButton: ImageButton
    private lateinit var fantasyButton: ImageButton
    private lateinit var mysteryButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_page)

        // Initialization of category buttons
        horrorButton = findViewById(R.id.horrorButton)
        actionButton = findViewById(R.id.actionButton)
        adventureButton = findViewById(R.id.adventureButton)
        comedyButton = findViewById(R.id.comedyButton)
        romanceButton = findViewById(R.id.romanceButton)
        scifiButton = findViewById(R.id.scifiButton)
        fantasyButton = findViewById(R.id.fantasyButton)
        mysteryButton = findViewById(R.id.mysteryButton)

        // Initialization of greeting text and shared preferences
        greetingText = findViewById(R.id.greetingText)
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        // Initialization of button and pop-up modal variables to display the instruction page.
        instructionbutton = findViewById(R.id.instructionButton)
        nDialog = Dialog(this)

        // OnClickListener for button to open instruction page.
        instructionbutton.setOnClickListener {
            nDialog.setContentView(R.layout.instruction_popup)
            nDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            nDialog.show()
        }

        // Retrieve and capitalize the user's name from shared preferences
        val name = sharedPreferences.getString("text", "User")
        val capitalizeName = name?.capitalize()
        greetingText.text = "Welcome, $capitalizeName!"

        // OnClickListeners for category buttons to navigate to their pages
        horrorButton.setOnClickListener{
            val intent = Intent(this, HorrorPage::class.java)
            startActivity(intent)
        }

        actionButton.setOnClickListener{
            val intent = Intent(this, ActionPage::class.java)
            startActivity(intent)
        }

        adventureButton.setOnClickListener{
            val intent = Intent(this, AdventurePage::class.java)
            startActivity(intent)
        }

        mysteryButton.setOnClickListener{
            val intent = Intent(this, MysteryPage::class.java)
            startActivity(intent)
        }

        romanceButton.setOnClickListener{
            val intent = Intent(this, RomancePage::class.java)
            startActivity(intent)
        }

        scifiButton.setOnClickListener{
            val intent = Intent(this, ScifiPage::class.java)
            startActivity(intent)
        }

        fantasyButton.setOnClickListener{
            val intent = Intent(this, FantasyPage::class.java)
            startActivity(intent)
        }

        comedyButton.setOnClickListener{
            val intent = Intent(this, ComedyPage::class.java)
            startActivity(intent)
        }

    }
}