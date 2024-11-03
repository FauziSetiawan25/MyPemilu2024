package com.example.mypemilu2024

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mypemilu2024.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val adapterCalon = CalonAdapter(generateDataDumy())
        with(binding){
            rvCalon.apply {
                adapter = adapterCalon
                layoutManager = GridLayoutManager(this@MainActivity,3)
            }
        }
    }
    fun generateDataDumy():List<Calon>{
        return listOf(
            Calon(nomor = R.drawable.number1, capres = R.drawable.capres1, cawapres = R.drawable.cawapres1),
            Calon(nomor = R.drawable.number2, capres = R.drawable.capres2, cawapres = R.drawable.cawapres2),
            Calon(nomor = R.drawable.number3, capres = R.drawable.capres3, cawapres = R.drawable.cawapres3),
        )
    }
}