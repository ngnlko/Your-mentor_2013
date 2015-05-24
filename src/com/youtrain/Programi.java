package com.youtrain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Programi extends Activity implements OnClickListener{
	
	
	Button men,women;
	
	
	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
		Toast.makeText(this, "В день спи не менее 8 часов за ночь!", Toast.LENGTH_SHORT).show();
		 setContentView(R.layout.progr);
		 
		men = (Button) findViewById(R.id.men);
		women = (Button) findViewById(R.id.women);
		
		
		men.setOnClickListener(this);
		women.setOnClickListener(this);
		 
	  }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
		
		case R.id.men:
		    Intent intent1 = new Intent(this, Men.class);
		      startActivity(intent1);	
			break;
			
		case R.id.women:
		    Intent intent2 = new Intent(this, Women.class);
		      startActivity(intent2);
			break;
		}
		
		
	}
}
