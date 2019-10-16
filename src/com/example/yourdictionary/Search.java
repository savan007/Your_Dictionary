package com.example.yourdictionary;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Search extends Activity {
    /** Called when the activity is first created. */
	ArrayList< String> list = new ArrayList<String>();
	ListView lv;
	EditText et;
	int textlength;
	 ArrayList<String> ORIGINAL;
	 String text[],text1[];
	 ArrayList<String> arraylist1_temp = new ArrayList<String>();
	 ArrayList<String> arraylist_temp2 = new ArrayList<String>();
	 
	 ArrayList<String> Temp_original = new ArrayList<String>();
	 ArrayList<String> arraylist1_temp12 = new ArrayList<String>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        
        TextView helloTxt = (TextView)findViewById(R.id.hellotxt);
        helloTxt.setText(readTxt());
        String str=helloTxt.getText().toString();
        
      ORIGINAL = new ArrayList<String>(Arrays.asList(str.split("\n")));   
      helloTxt.setText("d"+ORIGINAL.get(ORIGINAL.size()-1));
      for(int j=0;j<ORIGINAL.size();j++)
      {
    	  
    	  String str1 = ORIGINAL.get(j);
      char[] charArray = str1.toCharArray();
      
      
      String temp="";
		      for(int ij=0;ij<ORIGINAL.get(j).length();ij++)
		      {
		    	  if(String.valueOf(charArray[ij]).equals(" "))
		    			  {
		    		  ij=ORIGINAL.size()+1;
		    			  }
		    	  else {
					temp=temp+charArray[ij];
		    	  		}
		    	 
		      }
    	  
		      Temp_original.add(temp);
		      arraylist_temp2.add(temp);
      }
      
      
      
      
      
      
		et=(EditText)findViewById(R.id.editText1);
		 lv=(ListView)findViewById(R.id.listView1);
	
		
		  lv.setAdapter(new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, Temp_original));
		  text= new String[Temp_original.size()];
for(int i=0;i<Temp_original.size();i++)
{
	text[i]=Temp_original.get(i);
}
		et.addTextChangedListener(new TextWatcher() {
 	     
  	    public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
  	        // When user changed the Text

  	    	
  	    	
  	    	textlength = et.getText().length();
  	    	
  	    	arraylist1_temp=Temp_original;


  	    	Temp_original.clear();
  	       // image_sort.clear();

  	        for (int i = 0; i < text.length; i++)
  	        {
  	         if (textlength <= text[i].length())
  	         {
  	          if (et.getText().toString().
  	        		  equalsIgnoreCase((String) text[i].subSequence(0, textlength)))
  	          {
  	        	  Temp_original.add(text[i]);
  	         
  	          }
  	         }
  	        }

  	       /* listview.setAdapter(new MyCustomAdapter
  	         (text_sort, image_sort));*/
  		  lv.setAdapter(new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, Temp_original));	
  		if(textlength==0)
	    	{
	    	  lv.setAdapter(new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, arraylist1_temp12));		
	     	 
	    	}
  	    	
  	    }
  	    
  	    public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
  	            int arg3) {
  	        // TODO Auto-generated method stub
  	         
  	    }

		@Override
		public void afterTextChanged(Editable s) {
			// TODO Auto-generated method stub
			
		}
  	     
  	   
  	});
		
		
		
		 lv.setOnItemClickListener(new OnItemClickListener()
	        {
	           

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
						long arg3) {
					// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Detail.class);
				i.putExtra("link",arraylist_temp2 );
				Toast.makeText(getApplicationContext(), "ssd" +arg2, Toast.LENGTH_LONG).show();
				
				startActivity(i);
				}
	        });
		
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
}