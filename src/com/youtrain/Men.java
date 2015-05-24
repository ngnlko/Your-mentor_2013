package com.youtrain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Men extends Activity implements OnClickListener{

	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
	
	
	  protected void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
			 setContentView(R.layout.men);
			 
		    btn1 = (Button) findViewById(R.id.butn1);
			btn2 = (Button) findViewById(R.id.butn2);
			btn3=(Button)findViewById(R.id.butn3);
			btn4=(Button)findViewById(R.id.butn4);
			btn5=(Button)findViewById(R.id.butn5);
			btn6=(Button)findViewById(R.id.butn6);
			btn7=(Button)findViewById(R.id.butn7);
			
			btn1.setOnClickListener(this);
			btn2.setOnClickListener(this);
			btn3.setOnClickListener(this);
			btn4.setOnClickListener(this);
			btn5.setOnClickListener(this);
			btn6.setOnClickListener(this);
			btn7.setOnClickListener(this);
		  }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
		
		case R.id.butn1:
		    Intent intent1 = new Intent(this, com.youtrain.article.Novich.class);
		      startActivity(intent1);	
			break;
		case R.id.butn2:
		    Intent intent2 = new Intent(this, com.youtrain.article.Massa.class);
		      startActivity(intent2);	
			break;
		case R.id.butn3:
		    Intent intent3 = new Intent(this, com.youtrain.article.Sila.class);
		      startActivity(intent3);	
			break;
		case R.id.butn4:
		    Intent intent4 = new Intent(this, com.youtrain.article.Skalioz.class);
		      startActivity(intent4);	
			break;
		case R.id.butn5:
		    Intent intent5 = new Intent(this,com.youtrain.article.Notime.class);
		      startActivity(intent5);	
			break;
		case R.id.butn6:
		    Intent intent6 = new Intent(this, com.youtrain.article.Relief.class);
		      startActivity(intent6);	
			break;
		case R.id.butn7:
		    Intent intent7 = new Intent(this, com.youtrain.article.Dvnedeli.class);
		      startActivity(intent7);	
			break;
		}
		
	}
}
