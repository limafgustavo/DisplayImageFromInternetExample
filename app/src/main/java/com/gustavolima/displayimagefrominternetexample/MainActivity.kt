package com.gustavolima.displayimagefrominternetexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.gustavolima.displayimagefrominternetexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var url = "https://cdn.pixabay.com/photo/2017/12/28/20/34/water-3046088_1280.jpg"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLoadImage.setOnClickListener {

            if (binding.EditTexturl.text.isEmpty()) {
                Glide.with(this).load(url).into(binding.image)
            }else{
                url = binding.EditTexturl.text.toString()
                Glide.with(this).load(url).into(binding.image)
            }


        }

    }
}