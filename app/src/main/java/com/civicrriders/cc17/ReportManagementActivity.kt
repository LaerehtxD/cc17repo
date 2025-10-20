package com.civicrriders.cc17

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ReportManagementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_report_management)

        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }



        setupBottomNav()
    }

    private fun setupBottomNav() {
        val navChat = findViewById<LinearLayout>(R.id.navChat)
        val navReport = findViewById<LinearLayout>(R.id.navReport)
        val navFeed = findViewById<LinearLayout>(R.id.navFeed)
        val navSettings = findViewById<LinearLayout>(R.id.navSettings)

        navChat.setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }
        navReport.setOnClickListener {
            startActivity(Intent(this, ReportProblemActivity::class.java))
        }
        navFeed.setOnClickListener {
            startActivity(Intent(this, NewsfeedActivity::class.java))
        }
        navSettings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }
}