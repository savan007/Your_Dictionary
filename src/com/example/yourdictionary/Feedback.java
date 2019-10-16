package com.example.yourdictionary;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Feedback extends Activity {
	
	private WebView mwebview;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feedback);
	
	mwebview=(WebView)findViewById(R.id.webView1);
	
	WebSettings websetting = mwebview.getSettings();
	websetting.setJavaScriptEnabled(true);
	
	
	
	mwebview.loadUrl("https://docs.google.com/forms/d/17kXxjO_KkXmhLxCKnKwoS6uce72W99BrgEiFHTySLvc/viewform?c=0&w=1&usp=mail_form_link");
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.feedback, menu);
		return true;
	}

}
