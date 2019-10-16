package com.example.yourdictionary;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class Detail extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
	

		TextView helloTxt = (TextView)findViewById(R.id.hellotxt);
        helloTxt.setText(readTxt());
        String str=helloTxt.getText().toString();
		
	}
	  
	
	
	
	
	private String readTxt(){
	    	 InputStream inputStream = getResources().openRawResource(R.raw.dic);
	     
	     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	     
	     int i;
	  try {
	   i = inputStream.read();
	   while (i != -1)
	      {
	       byteArrayOutputStream.write(i);
	       i = inputStream.read();
	      }
	      inputStream.close();
	  } catch (IOException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	  
	     return byteArrayOutputStream.toString();
	    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.detail, menu);
		return true;
	}

}
