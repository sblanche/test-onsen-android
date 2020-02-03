package com.sylvinhoid.testvueonsen

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val wb = findViewById(R.id.wv) as WebView

        val webSettings: WebSettings = wb.getSettings()
        webSettings.javaScriptEnabled = true
        wb.setNetworkAvailable(true)

        wb.loadUrl("file:///android_asset/index.html")
        //setContentView(wb)
    }
}
