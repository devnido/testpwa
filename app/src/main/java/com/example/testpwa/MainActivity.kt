package com.example.testpwa

import android.app.Activity
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
            //val url = "https://cmr-mx-onboarding-test.fif.tech/upload-id?title=hola+desde+el+huellero"
            //startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
            val i = Intent()
            i.putExtra("title","hola desde huellero" )
            setResult(Activity.RESULT_OK, i)
            finish()
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
