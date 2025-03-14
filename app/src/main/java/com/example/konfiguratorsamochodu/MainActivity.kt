package com.example.konfiguratorsamochodu

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val myTextView=findViewById<TextView>(R.id.podsumowanie)

        val Podgrzewane_siedzenia:CheckBox = findViewById(R.id.podgrzewane_siedzenia)
        Podgrzewane_siedzenia.setOnCheckedChangeListener{ _, isChecked->
            if(isChecked){
                myTextView.text="Podgrzewane siedzenia"
            }
            else{

            }
        }
        val Klimatyzacja: CheckBox = findViewById(R.id.klimatyzacja)
        Klimatyzacja.setOnCheckedChangeListener{ _, isChecked->
            if(isChecked){
                myTextView.text="Klimatyzacja"
            }
            else{

            }
        }
        val Szyberdach: CheckBox = findViewById(R.id.szyberdach)
        Szyberdach.setOnCheckedChangeListener{ _, isChecked->
            if(isChecked){
                myTextView.text="Szyberdach"
            }
            else{

            }
        }
        val Skorzana_tapicerka: CheckBox = findViewById(R.id.skorzana_tapicerka)
        Skorzana_tapicerka.setOnCheckedChangeListener{ _, isChecked->
            if(isChecked){
                myTextView.text="Skorzana_tapicerka"
            }
            else{

            }
        }
        val Automatyczna_skrzynia: CheckBox = findViewById(R.id.automatyczna_skrzynia)
        Automatyczna_skrzynia.setOnCheckedChangeListener{ _, isChecked->
            if(isChecked){
                myTextView.text="Automatyczna_skrzynia"
            }
            else{

            }
        }

    }
}