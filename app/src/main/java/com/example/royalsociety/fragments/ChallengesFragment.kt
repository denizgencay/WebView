package com.example.royalsociety.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.royalsociety.R


class ChallengesFragment : Fragment() {

    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_challenges, container, false)
        webView = view.findViewById(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://royal-society.cc/challenges/")
        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)

        return view
    }

}