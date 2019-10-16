package com.example.yourdictionary;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Home extends Activity {
	Button search,online,recent,feedback,about,rate,share;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		search=(Button)findViewById(R.id.searchbutton);
		online=(Button)findViewById(R.id.onliine);
		recent=(Button)findViewById(R.id.history);
		feedback=(Button)findViewById(R.id.feedback);
		about=(Button)findViewById(R.id.about);
		rate=(Button)findViewById(R.id.rate);
		share=(Button)findViewById(R.id.share);
	
		
		search.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),Search.class);
				startActivity(i);
				
			}
		});
		
		
		online.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),Online.class);
				startActivity(i);
				
			}
		});


		recent.setOnClickListener(new View.OnClickListener() {
	
			@Override
		public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i = new Intent(getApplicationContext(),Recent.class);
		startActivity(i);
		
			}
		});


		feedback.setOnClickListener(new View.OnClickListener() {
	
		@Override
		public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i = new Intent(getApplicationContext(),Feedback.class);
		startActivity(i);
		
			}
		});



		about.setOnClickListener(new View.OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),About.class);
				startActivity(i);
		
			}
		});


		rate.setOnClickListener(new View.OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=yourdictionary.dextrodev"); // missing 'http://' will cause crashed
	                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
	                startActivity(intent);
		
			}
		});



		share.setOnClickListener(new View.OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND); 
    		    sharingIntent.setType("text/plain");
    		    String shareBody = "Your Dictionary";
    		    sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Check out 'Your Dictionary' - https://play.google.com/store/apps/details?id=yourdictionary.dextrodev");
    		    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
    		startActivity(Intent.createChooser(sharingIntent, "Share via"));	
		
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
