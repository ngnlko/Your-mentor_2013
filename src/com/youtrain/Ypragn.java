package com.youtrain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Ypragn extends Activity implements OnClickListener {
	
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
		Toast.makeText(this, "Соблюдай режим дня", Toast.LENGTH_SHORT).show();
		 setContentView(R.layout.yprag);
		 
		    btn1 = (Button) findViewById(R.id.chest);
			btn2 = (Button) findViewById(R.id.plechi);
			btn3=(Button)findViewById(R.id.spina);
			btn4=(Button)findViewById(R.id.nogi);
			btn5=(Button)findViewById(R.id.pres);
			btn6=(Button)findViewById(R.id.bic);
			btn7=(Button)findViewById(R.id.tric);
			
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
		
		case R.id.chest:
		    Intent intent1 = new Intent(this, yprag.Gryd.class);
		      startActivity(intent1);	
			break;
		case R.id.plechi:
		    Intent intent2 = new Intent(this, yprag.Plechi.class);
		      startActivity(intent2);	
			break;
		case R.id.spina:
		    Intent intent3 = new Intent(this, yprag.Spina.class);
		      startActivity(intent3);	
			break;
		case R.id.nogi:
		    Intent intent4 = new Intent(this, yprag.Nogi.class);
		      startActivity(intent4);	
			break;
		case R.id.pres:
		    Intent intent5 = new Intent(this, yprag.Pres.class);
		      startActivity(intent5);	
			break;
		case R.id.bic:
			Intent intent6 = new Intent(this, yprag.Biceps.class);
			startActivity(intent6);	
			break;
		case R.id.tric:
			Intent intent7 = new Intent(this, yprag.Triceps.class);
			startActivity(intent7);	
			break;
			
		
		
		}	
	}
}
