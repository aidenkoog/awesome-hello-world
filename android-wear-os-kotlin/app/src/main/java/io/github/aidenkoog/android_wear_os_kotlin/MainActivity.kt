package io.github.aidenkoog.android_wear_os_kotlin

import android.app.Activity
import android.os.Bundle
import io.github.aidenkoog.android_wear_os_kotlin.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}