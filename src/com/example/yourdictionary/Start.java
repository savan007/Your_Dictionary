package com.example.yourdictionary;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Start extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        
        Thread timer=new Thread(){
        	public void run()
        	{
        		try{
        			sleep(3000);
        		}catch(InterruptedException e){
        			e.printStackTrace();
        		}finally{
        			Intent i = new Intent(getApplicationContext(),Home.class);
        			startActivity(i);
        			
        		}
        	}
        };
        timer.start();
    }


    @Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
