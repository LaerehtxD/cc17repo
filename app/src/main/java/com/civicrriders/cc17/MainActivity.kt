package com.civicrriders.cc17

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.jvm.java
import android.widget.Button
import android.content.Intent





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnGetStarted = findViewById<Button>(R.id.btnGetStarted)

        // When button is clicked, go to HomePage activity
        btnGetStarted.setOnClickListener {
            val intent = Intent(this, home_page::class.java)
            startActivity(intent)
        }

    }
}