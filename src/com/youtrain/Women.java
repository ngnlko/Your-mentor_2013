package com.youtrain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Women extends Activity implements OnClickListener{

	
	
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
	
	
	  protected void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
			 setContentView(R.layout.women);
			 
		    btn1 = (Button) findViewById(R.id.wbtn1);
			btn2 = (Button) findViewById(R.id.wbtn2);
			btn3=(Button)findViewById(R.id.wbtn3);
			btn4=(Button)findViewById(R.id.wbtn4);
			btn5=(Button)findViewById(R.id.wbtn5);
			btn6=(Button)findViewById(R.id.wbtn6);
			btn7=(Button)findViewById(R.id.wbtn7);
			btn8=(Button)findViewById(R.id.wbtn8);
			
			btn1.setOnClickListener(this);
			btn2.setOnClickListener(this);
			btn3.setOnClickListener(this);
			btn4.setOnClickListener(this);
			btn5.setOnClickListener(this);
			btn6.setOnClickListener(this);
			btn7.setOnClickListener(this);
			btn8.setOnClickListener(this);
		  }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
		
		case R.id.wbtn1:
		    Intent intent1 = new Intent(this, women.Universal.class);
		      startActivity(intent1);	
			break;
		case R.id.wbtn2:
		    Intent intent2 = new Intent(this, women.Iobr.class);
		      startActivity(intent2);	
			break;
		case R.id.wbtn3:
		    Intent intent3 = new Intent(this, women.Oobr.class);
		      startActivity(intent3);	
			break;
		case R.id.wbtn4:
		    Intent intent4 = new Intent(this, com.youtrain.article.Skalioz.class);
		      startActivity(intent4);	
			break;
		case R.id.wbtn5:
		    Intent intent5 = new Intent(this,com.youtrain.article.Notime.class);
		      startActivity(intent5);	
			break;
		case R.id.wbtn6:
		    Intent intent6 = new Intent(this, com.youtrain.article.Relief.class);
		      startActivity(intent6);	
			break;
		case R.id.wbtn7:
		    Intent intent7 = new Intent(this, com.youtrain.article.Dvnedeli.class);
		      startActivity(intent7);	
			break;
		case R.id.wbtn8:
		    Intent intent8 = new Intent(this, women.Poxyd.class);
		      startActivity(intent8);	
			break;
		}
	}
}
