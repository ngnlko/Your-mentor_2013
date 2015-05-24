package com.youtrain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	
	Button btn1,btn2,btn3, btn4,btn5, btn6, about;
	TextView test;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Будь сильным!", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
    	
        
        
    	btn1 = (Button) findViewById(R.id.btn1);
    	btn2 = (Button) findViewById(R.id.btn2);
    	btn3 = (Button) findViewById(R.id.btn3);
    	btn4 = (Button) findViewById(R.id.btn4);
    	btn5= (Button)findViewById(R.id.btn5);
    	btn6=(Button)findViewById(R.id.btn6);
    	about=(Button)findViewById(R.id.about);

    	
    	
    	btn1.setOnClickListener(this);
    	btn2.setOnClickListener(this);
    	btn3.setOnClickListener(this);
    	btn4.setOnClickListener(this);
    	btn5.setOnClickListener(this);
    	btn6.setOnClickListener(this);
    	about.setOnClickListener(this);

    	

    }
    
  
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

			switch(v.getId())
			{

			case R.id.btn1:
			    Intent intent4 = new Intent(this, Timer.class);
			      startActivity(intent4);
				break;
			case R.id.btn2:
			    Intent intent1 = new Intent(this, Programi.class);
			      startActivity(intent1);
				break;
			case R.id.btn3:
			    Intent intent2 = new Intent(this, Ypragn.class);
			      startActivity(intent2);
				break;
			case R.id.btn4:
			    Intent intent6 = new Intent(this, com.youtrain.article.Article.class);
			      startActivity(intent6);
				break;
			case R.id.btn5:
			    Intent intent3 = new Intent(this, Dnevnik.class);
			      startActivity(intent3);
				break;
			case R.id.btn6:
			    Intent intent5 = new Intent(this, eat.Eat.class);
			      startActivity(intent5);
				break;
			case R.id.about:
		Toast.makeText(this, "Шакирданов Роберт " +
				"2013", Toast.LENGTH_LONG).show();
				break;
				
							
			
	   	}
	}
    
}
