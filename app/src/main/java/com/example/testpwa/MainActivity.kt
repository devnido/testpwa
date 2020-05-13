package com.example.testpwa

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpView()
    }

    private fun setUpView() {
        btn_action.setOnClickListener {
           // startActivity(Intent(applicationContext, ViewModelActivity::class.java))

            val url = "open://com.example.testdeeplink/saludosDesdeHuellero"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))

        }
      if(intent?.data != null){

        val action: String? = intent?.action
        val data: Uri? = intent?.data
        var segments = data?.pathSegments

        Log.d("PATH_SEGMENTS_LENGTH",segments?.size.toString())

        val parametro = data?.lastPathSegment

        Toast.makeText(this,"Parametro enviado desde PWA: "+parametro,Toast.LENGTH_LONG).show();
        }
    }


}
