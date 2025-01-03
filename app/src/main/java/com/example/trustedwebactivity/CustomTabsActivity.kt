package com.example.trustedwebactivity

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent

class CustomTabsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val url = "https://airhorner.com"
        val intent = CustomTabsIntent.Builder().setShowTitle(true).build()
        intent.launchUrl(this, Uri.parse(url))
    }
}