package com.example.badmintoncounter

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Find the TextView with ID winningMessage
        val winningMessageTextView = findViewById<TextView>(R.id.winningMessage)

        // Receive the intent from the previous activity
        val intent = intent
        if (intent.hasExtra("winning_message")) {
            // Get the winning message from the intent
            val winningMessage = intent.getStringExtra("winning_message")

            // Set the winning message in the TextView
            winningMessageTextView.text = winningMessage
        } else {
            // Handle the case where no winning message is provided
            winningMessageTextView.text = "No winning message found."
        }
    }
}
