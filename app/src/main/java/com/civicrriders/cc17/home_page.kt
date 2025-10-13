package com.civicrriders.cc17

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.jvm.java
import android.widget.Button
import android.content.Intent
import android.widget.ImageButton
import android.widget.*

class home_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val reportManagementBtn = findViewById<ImageButton>(R.id.tileReportManagement)
        val reportProblemBtn = findViewById<ImageButton>(R.id.tileReportProblem)
        val newsfeedBtn = findViewById<ImageButton>(R.id.tileNewsfeed)
        val chatBtn = findViewById<ImageButton>(R.id.tileChat)
        val settingsBtn = findViewById<ImageButton>(R.id.tileSettings)

        reportManagementBtn.setOnClickListener {
            startActivity(Intent(this@home_page, ReportManagementActivity::class.java))
        }

        reportProblemBtn.setOnClickListener {
            startActivity(Intent(this@home_page, ReportProblemActivity::class.java))
        }

        newsfeedBtn.setOnClickListener {
            startActivity(Intent(this@home_page, NewsfeedActivity::class.java))
        }

        chatBtn.setOnClickListener {
            startActivity(Intent(this@home_page, ChatActivity::class.java))
        }

        settingsBtn.setOnClickListener {
            startActivity(Intent(this@home_page, SettingsActivity::class.java))
        }
    }
}