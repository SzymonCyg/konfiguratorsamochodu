package com.example.konfiguratorsamochodu

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioGroup
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
        val myRadioGroup=findViewById<RadioGroup>(R.id.auto_radiobutton)
        val podgrzewaneSiedzeniabox=findViewById<CheckBox>(R.id.podgrzewane_siedzenia)
        val klimatyzacjabox=findViewById<CheckBox>(R.id.klimatyzacja)
        val szyberdachbox=findViewById<CheckBox>(R.id.szyberdach)
        val skorzanaTapicerkabox=findViewById<CheckBox>(R.id.skorzana_tapicerka)
        val automatycznaSkrzyniabox=findViewById<CheckBox>(R.id.automatyczna_skrzynia)
        val confirm_button=findViewById<Button>(R.id.confirm_button)
        val obrazek=findViewById<ImageView>(R.id.auto_obrazek)
        val myTextView=findViewById<TextView>(R.id.podsumowanie)


        confirm_button.setOnClickListener{
            val car= when(myRadioGroup.checkedRadioButtonId){
                R.id.suv_radiobutton->obrazek.setImageResource(R.drawable.suv)
                R.id.sedan_radiobutton->obrazek.setImageResource(R.drawable.sedan)
                R.id.hatchback->obrazek.setImageResource(R.drawable.hatchback)
                else->"Nie wybrano modelu"
            }
            val podgrzewaneSiedzenia= if (podgrzewaneSiedzeniabox.isChecked)"-Podgrzewane siedzenia\n" else ""
            val klimatyzacja= if (klimatyzacjabox.isChecked)"-Klimatyzacja\n" else ""
            val szyberDach= if (szyberdachbox.isChecked)"-Szyber dach\n" else ""
            val skorzanatapicerka= if (skorzanaTapicerkabox.isChecked)"-Skórzana tapicerka\n" else ""
            val automat= if (automatycznaSkrzyniabox.isChecked)"-Automatyczna skrzynia biegów\n" else ""
            myTextView.text="Dodatkowe opcje wyposażenia:\n$podgrzewaneSiedzenia$klimatyzacja$szyberDach$skorzanatapicerka$automat"
        }


    }
}