//Tanggal Pengerjaan : 17-5-2022
//NIM : 10119187
//Nama : Alvin Algadri
//Kelas : IF-5

package com.example.selfbiodata

import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button

class ProfileActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnDialog : Button
    private lateinit var btnLocation : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        btnLocation = findViewById(R.id.btn_location)
        btnLocation.setOnClickListener(this)

        //instagram
        val insta = findViewById<View>(R.id.btn_instagram) as Button
        insta.setOnClickListener(View.OnClickListener {
            val uri = Uri.parse("https://www.instagram.com/alvinalgadri1")
            val instagram = Intent(Intent.ACTION_VIEW, uri)
            instagram.setPackage("com.instagram.android")
            try {
                startActivity(instagram)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/alvinalgadri1")))
            }
        })

        //whatsapp
        val wa = findViewById<View>(R.id.btn_whatsapp) as Button
        wa.setOnClickListener(View.OnClickListener {
            val uri = Uri.parse("https://wa.me/6285157011693")
            val whatsapp = Intent(Intent.ACTION_VIEW, uri)
            whatsapp.setPackage("com.whatsapp.android")
            try {
                startActivity(whatsapp)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/6285157011693")))
            }
        })

        //custom dialog
        btnDialog = findViewById(R.id.btnDialog)
        btnDialog.setOnClickListener {
            customDialog()
        }
    }


    //custom dialog
    private fun customDialog (){
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(R.layout.custom_dialog)

        val btnTutup = dialog.findViewById<Button>(R.id.btnTutup)
        btnTutup.setOnClickListener{
            dialog.dismiss()
        }
        dialog.show()
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_location -> {
                val intentLocation = Intent(this@ProfileActivity, MapActivity::class.java)
                startActivity(intentLocation)
            }
        }

    }


}