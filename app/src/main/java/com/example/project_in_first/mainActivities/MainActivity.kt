package com.example.project_in_first.mainActivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.project_in_first.SazhinActivity
import com.example.project_in_first.constance.Constance
import com.example.project_in_first.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater);
        setContentView(bindingClass.root)

        bindingClass.btSearch.setOnClickListener {
            val firstName : String = bindingClass.edFirstName.text.toString().lowercase();
            val name : String = bindingClass.edName.text.toString().lowercase();
            bindingClass.tvError.visibility = View.INVISIBLE;
            if(Constance.ADMIN.equals(firstName) || Constance.ADMIN.equals(name)) {
                val intent = Intent(this, SazhinActivity::class.java);
                startActivity(intent);
            }
            else if(Constance.EGOR.equals(firstName) && Constance.SAZHIN.equals(name)) {
                val intent = Intent(this, SazhinActivity2::class.java);
                startActivity(intent);
            }
            else {
                bindingClass.tvError.visibility = View.VISIBLE;
                bindingClass.tvError.text = "Нет такого. Вы не из наших?)"
            }
        }
    }
}