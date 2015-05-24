package yprag;

import com.youtrain.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Pres extends Activity implements OnClickListener {
	Button btn1,btn2,btn3, btn4,btn5;
	TextView test;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.press);
    	
        
        
    	btn1 = (Button) findViewById(R.id.skry);
    	btn2 = (Button) findViewById(R.id.skrnanak);
    	btn3 = (Button) findViewById(R.id.obrskry);
    	btn4 = (Button) findViewById(R.id.presvvise);
    	btn5= (Button)findViewById(R.id.kosiskry);

	
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

		case R.id.skry:
		    Intent intent1 = new Intent(this, yprag.press.Skrych.class);
		      startActivity(intent1);
			break;
		case R.id.skrnanak:
		    Intent intent2 = new Intent(this, yprag.press.Skrychnakl.class);
		      startActivity(intent2);
			break;
		case R.id.obrskry:
		    Intent intent3 = new Intent(this, yprag.press.Obrskrych.class);
		      startActivity(intent3);
			break;
		case R.id.presvvise:
		    Intent intent4 = new Intent(this, yprag.press.Podiemnog.class);
		      startActivity(intent4);
			break;
		case R.id.kosiskry:
		    Intent intent5 = new Intent(this, yprag.press.Kosieskr.class);
		      startActivity(intent5);
			break;
		}
		
	}
}
