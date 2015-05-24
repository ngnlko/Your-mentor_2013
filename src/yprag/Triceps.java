package yprag;

import com.youtrain.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Triceps extends Activity implements OnClickListener {
	Button btn1,btn2,btn3, btn4,btn5;
	TextView test;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.triceps);
    	
        
        
    	btn1 = (Button) findViewById(R.id.jimsh);
    	btn2 = (Button) findViewById(R.id.otjimsk);
    	btn3 = (Button) findViewById(R.id.franc);
    	btn4 = (Button) findViewById(R.id.jimvtren);
    	btn5= (Button)findViewById(R.id.razgiban);

	
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

		case R.id.jimsh:
		    Intent intent1 = new Intent(this, yprag.triceps.Yzkim.class);
		      startActivity(intent1);
			break;
		case R.id.otjimsk:
		    Intent intent2 = new Intent(this, yprag.triceps.Otskam.class);
		      startActivity(intent2);
			break;
		case R.id.franc:
		    Intent intent3 = new Intent(this, yprag.triceps.Franc.class);
		      startActivity(intent3);
			break;
		case R.id.jimvtren:
		    Intent intent4 = new Intent(this, yprag.triceps.Vtrenaj.class);
		      startActivity(intent4);
			break;
		case R.id.razgiban:
		    Intent intent5 = new Intent(this, yprag.triceps.Razgiban.class);
		      startActivity(intent5);
			break;
		}
	}
}
