package com.youtrain.article;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.youtrain.R;

public class Article extends Activity implements OnClickListener {
	
	
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14;
	
	
	@Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
		
		 setContentView(R.layout.article);
		 
		    btn1 = (Button) findViewById(R.id.stroen);
			btn2 = (Button) findViewById(R.id.stroenw);
			btn3=(Button)findViewById(R.id.ygl);
			btn4=(Button)findViewById(R.id.kollor);
			btn5=(Button)findViewById(R.id.immyn);
			btn6=(Button)findViewById(R.id.split);
			btn7=(Button)findViewById(R.id.plechr);
			btn8=(Button)findViewById(R.id.trnsila);
			btn9=(Button)findViewById(R.id.pozvon);
			btn10=(Button)findViewById(R.id.smassi);
			btn11=(Button)findViewById(R.id.pitanp);
			btn12=(Button)findViewById(R.id.pprost);
			btn13=(Button)findViewById(R.id.sytyl);
			btn14=(Button)findViewById(R.id.do16);
			
			btn1.setOnClickListener(this);
			btn2.setOnClickListener(this);
			btn3.setOnClickListener(this);
			btn4.setOnClickListener(this);
			btn5.setOnClickListener(this);
			btn6.setOnClickListener(this);
			btn7.setOnClickListener(this);
			btn8.setOnClickListener(this);
			btn9.setOnClickListener(this);
			btn10.setOnClickListener(this);
			btn11.setOnClickListener(this);
			btn12.setOnClickListener(this);
			btn13.setOnClickListener(this);
			btn14.setOnClickListener(this);
	  }
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId())
		{
		
		case R.id.stroen:
		    Intent intent1 = new Intent(this, stat.Stroen.class);
		      startActivity(intent1);	
			break;
		case R.id.stroenw:
		    Intent intent2 = new Intent(this, stat.Stroenw.class);
		      startActivity(intent2);	
			break;
		case R.id.ygl:
		    Intent intent3 = new Intent(this, stat.Ygl.class);
		      startActivity(intent3);	
			break;
		case R.id.kollor:
		    Intent intent4 = new Intent(this, stat.Kollor.class);
		      startActivity(intent4);	
			break;
		case R.id.immyn:
		    Intent intent5 = new Intent(this, stat.Immyn.class);
		      startActivity(intent5);	
			break;
		case R.id.split:
			Intent intent6 = new Intent(this, stat.Split.class);
			startActivity(intent6);	
			break;
		case R.id.plechr:
			Intent intent7 = new Intent(this, stat.Plechr.class);
			startActivity(intent7);	
			break;
		case R.id.trnsila:
			Intent intent8 = new Intent(this, stat.Trnsila.class);
			startActivity(intent8);	
			break;
		case R.id.pozvon:
			Intent intent9 = new Intent(this, stat.Pozvon.class);
			startActivity(intent9);	
			break;
		case R.id.smassi:
			Intent intent10 = new Intent(this, stat.Smassi.class);
			startActivity(intent10);	
			break;
		case R.id.pitanp:
			Intent intent11 = new Intent(this, stat.Pitanp.class);
			startActivity(intent11);	
			break;
		case R.id.pprost:
			Intent intent12 = new Intent(this, stat.Pprost.class);
			startActivity(intent12);	
			break;
		case R.id.sytyl:
			Intent intent13 = new Intent(this, stat.Sytyl.class);
			startActivity(intent13);	
			break;
		case R.id.do16:
			Intent intent14 = new Intent(this, stat.Do16.class);
			startActivity(intent14);	
			break;
		
		}	
	}
}
