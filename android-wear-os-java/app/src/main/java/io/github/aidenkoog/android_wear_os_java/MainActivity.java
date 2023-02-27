package io.github.aidenkoog.android_wear_os_java;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import io.github.aidenkoog.android_wear_os_java.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}