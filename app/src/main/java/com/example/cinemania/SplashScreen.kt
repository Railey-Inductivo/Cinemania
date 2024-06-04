package com.example.cinemania

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.content.Intent

class SplashScreen : AppCompatActivity() {

    // Duration of the splash screen display
    private val SPLASH_SCREEN_DELAY: Long = 2800

    // Declaration of UI elements
    private lateinit var appLogo: ImageView
    private lateinit var appTitle: ImageView
    private lateinit var appSlogan: TextView

    // Declaration of animations
    private lateinit var above: Animation
    private lateinit var below: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Initialization of UI elements
        appLogo = findViewById(R.id.appLogo)
        appTitle = findViewById(R.id.appTitle)
        appSlogan = findViewById(R.id.appSlogan)

        // Load animations
        above = AnimationUtils.loadAnimation(this, R.anim.above)
        below = AnimationUtils.loadAnimation(this, R.anim.below)

        // Play animations
        appLogo.startAnimation(above)
        appTitle.startAnimation(below)
        appSlogan.startAnimation(below)

        // Delay before displaying MainActivity and finishing the splash screen display
        android.os.Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLASH_SCREEN_DELAY)

    }
}
