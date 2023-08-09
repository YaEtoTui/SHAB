package com.example.project_in_first.mainActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.project_in_first.R

class SazhinActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sazhin2)
    }

    fun setOnClickCloseSazhin2(view: View) {
        finish();
    }
}