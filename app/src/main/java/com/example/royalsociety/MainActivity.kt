package com.example.royalsociety

import android.annotation.SuppressLint
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.royalsociety.fragments.HallOfFameFragment
import com.example.royalsociety.fragments.HomeFragment
import com.example.royalsociety.fragments.MembershipFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val homeFragment = HomeFragment()
//        val membershipFragment = MembershipFragment()
//        val hallOfFameFragment = HallOfFameFragment()
//
//        setCurrentFragment(homeFragment)
//
//        findViewById<BottomNavigationView>(R.id.bottomNavigationView).setOnNavigationItemSelectedListener {
//            when(it.itemId){
//                R.id.home->setCurrentFragment(homeFragment)
//                R.id.membership->setCurrentFragment(membershipFragment)
//                R.id.hall_of_fame->setCurrentFragment(hallOfFameFragment)
//            }
//            true
//        }
        val webView = findViewById<WebView>(R.id.webView)
        webView.visibility = View.INVISIBLE
        Thread.sleep(5000)
        webView.visibility = View.VISIBLE
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://royal-society.cc/")
        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)
    }

//    private fun setCurrentFragment(fragment: Fragment) =
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.flFragment,fragment)
//            commit()
//        }
}