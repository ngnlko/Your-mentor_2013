package com.youtrain.article;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import com.youtrain.R;

public class Novich extends Activity {

	
	 TextView out;
	  protected void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
			 setContentView(R.layout.work);
			 
			 out=(TextView)findViewById(R.id.textout);
			 String text=getString(R.string.novich);
			 
			 Spanned result = Html.fromHtml(text);

			 out.setText(result);
			 
			 
			 
	  }
	

	
}
