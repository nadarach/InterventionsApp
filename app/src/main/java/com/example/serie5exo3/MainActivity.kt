package com.example.serie5exo3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import com.example.serie5exo3.database.InterventionsDatabase
import com.example.serie5exo3.entites.Interventions

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addBtn = findViewById<Button>(R.id.add_button)
        val numberEV = findViewById<EditText>(R.id.numberInput)
        val dateEV = findViewById<EditText>(R.id.dateInput)
        val name = findViewById<Spinner>(R.id.nameInput)
        val type = findViewById<Spinner>(R.id.typeInput)

        addBtn.setOnClickListener{
/// TODO: 23/05/2022  fix insert 
            val interv : Interventions = Interventions()
            //interv.numero = numberEV.text
            interv.date = dateEV.text.toString()
            //interv.name = name.text
            //InterventionsDatabase.getDatabase(this).interventionDao().insertInterventions(interv)
        }

    }
}