package yprag;

import com.youtrain.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Biceps extends Activity implements OnClickListener {
	
	Button btn1,btn2,btn3, btn4,btn5;
	TextView test;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.biceps);
    	
        
        
    	btn1 = (Button) findViewById(R.id.pdsht);
    	btn2 = (Button) findViewById(R.id.pdgan);
    	btn3 = (Button) findViewById(R.id.molotok);
    	btn4 = (Button) findViewById(R.id.skot);
    	btn5= (Button)findViewById(R.id.obrathv);

	
    	btn1.setOnClickListener(this);
    	btn2.setOnClickListener(this);
    	btn3.setOnClickListener(this);
    	btn4.setOnClickListener(this);
    	btn5.setOnClickListener(this);


    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{

		case R.id.pdsht:
		    Intent intent1 = new Intent(this, yprag.biceps.Shtanga.class);
		      startActivity(intent1);
			break;
		case R.id.pdgan:
		    Intent intent2 = new Intent(this, yprag.biceps.Gantel.class);
		      startActivity(intent2);
			break;
		case R.id.molotok:
		    Intent intent3 = new Intent(this, yprag.biceps.Molotok.class);
		      startActivity(intent3);
			break;
		case R.id.skot:
		    Intent intent4 = new Intent(this, yprag.biceps.Skott.class);
		      startActivity(intent4);
			break;
		case R.id.obrathv:
		    Intent intent5 = new Intent(this, yprag.biceps.Obratnhvat.class);
		      startActivity(intent5);
			break;
		}
	}
}
