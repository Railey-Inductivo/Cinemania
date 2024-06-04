package com.example.cinemania

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.text.InputFilter
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginPage : AppCompatActivity() {

    // Declaration of UI elements and shared preferences
    private lateinit var editText: EditText
    private lateinit var confirmButton: Button
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        // Initialization of UI elements and shared preferences
        editText = findViewById(R.id.editText)
        confirmButton = findViewById(R.id.confirmButton)
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        // Input filter to limit maximum characters to 13
        editText.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(11))

        // OnClickListener for confirm button to save the input text in shared preferences
        confirmButton.setOnClickListener {
            val inputText = editText.text.toString()

            // Checks if input text is not empty
            if (inputText.isNotEmpty()) {
                // Saves the input text in shared preferences
                val editor = sharedPreferences.edit()
                editor.putString("text", inputText)
                editor.apply()

                // Moves to the next activity
                val intent = Intent(this, CategoryPage::class.java)
                startActivity(intent)
            } else {
                // Displays a toast message indicating that the input text is empty.
                Toast.makeText(this, "Please enter your name.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
