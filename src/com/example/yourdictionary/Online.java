package com.example.yourdictionary;

/*package com.example.yourdictionary;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Online extends Activity {
	private WebView webView;	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_online);
		
		webView = (WebView) findViewById(R.id.webView1);
	//	webView.setWebViewClient(new MyWebViewClient());
		
		
		 WebSettings webSettings = webView.getSettings();
		    webSettings.setJavaScriptEnabled(true);
		    
		    
		 webView.loadUrl("http://dictionary.reference.com/");
		
		
                webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("http://www.mkyong.com/android/android-webview-example");		
	}

	private class MyWebViewClient extends WebViewClient {
	    @Override
	    public boolean shouldOverrideUrlLoading(WebView view, String url) {
	        view.loadUrl(url);
	        return true;
	    }
	}	

}
}*/


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Online extends Activity {

	private WebView mwebview;
	Context context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_online);
		/*		WebView webView = (WebView) findViewById(R.id.webview);
		WebView webView1 = new WebView( context );
		webView1.getSettings().setAppCacheMaxSize( 5 * 1024 * 1024 ); // 5MB
		webView1.getSettings().setAppCachePath( getApplicationContext().getCacheDir().getAbsolutePath() );
		webView1.getSettings().setAllowFileAccess( true );
		webView1.getSettings().setAppCacheEnabled( true );
		webView1.getSettings().setJavaScriptEnabled( true );
		webView1.getSettings().setCacheMode( WebSettings.LOAD_DEFAULT ); // load online by default

		if ( !isNetworkAvailable() ) { // loading offline
		    webView1.getSettings().setCacheMode( WebSettings.LOAD_CACHE_ELSE_NETWORK );
		}

		webView1.loadUrl( "http://rto.kar.nic.in/local_browser.html" );
	}
	private boolean isNetworkAvailable() {
	    ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService( CONNECTIVITY_SERVICE );
	    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
	    return activeNetworkInfo != null && activeNetworkInfo.isConnected();
	}
	*/
		mwebview=(WebView)findViewById(R.id.webView1);
		
		WebSettings websetting = mwebview.getSettings();
		websetting.setJavaScriptEnabled(true);
		
		mwebview.loadUrl("http://beta.html5test.com/");
	}
}