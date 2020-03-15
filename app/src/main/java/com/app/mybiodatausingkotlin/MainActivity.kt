package com.app.mybiodatausingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var edtNama: EditText
    private lateinit var edtNPM: EditText
    private lateinit var edtProdi: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNama = findViewById(R.id.edtName)
        edtNPM = findViewById(R.id.edtNpm)
        edtProdi = findViewById(R.id.edtProdi);
    }

    fun clikSimpan(view: View) {
        var nama: String = edtNama.text.toString()
        var npm: String = edtNPM.text.toString()
        var prodi: String = edtProdi.text.toString()
        Toast.makeText(this,"nama: " + nama + "\nNPM: " + npm +"\nprodi " + prodi,Toast.LENGTH_SHORT).show()
    }
}
