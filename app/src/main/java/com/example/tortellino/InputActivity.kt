package com.example.tortellino

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_input.*

class InputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        setupButton()
    }

    private fun setupButton() {
        bottoncino.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)

            val testoUtente = text_input.text.toString()
            intent.putExtra("TESTO", testoUtente)

            startActivity(intent)
        }
    }
}

// ctrl alt l per indentare automaticamente