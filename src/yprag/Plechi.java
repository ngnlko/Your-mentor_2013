package yprag;

import com.youtrain.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Plechi extends Activity implements OnClickListener {

	
	Button btn1,btn2,btn3, btn4,btn5;
	TextView test;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.plechi);
    	
        
        
    	btn1 = (Button) findViewById(R.id.gmsid);
    	btn2 = (Button) findViewById(R.id.gmsid1);
    	btn3 = (Button) findViewById(R.id.arni);
    	btn4 = (Button) findViewById(R.id.rzvg);
    	btn5= (Button)findViewById(R.id.podie);

	
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

		case R.id.gmsid:
		    Intent intent1 = new Intent(this, yprag.plechi.Gimsid.class);
		      startActivity(intent1);
			break;
		case R.id.gmsid1:
		    Intent intent2 = new Intent(this, yprag.plechi.Gimsid1.class);
		      startActivity(intent2);
			break;
		case R.id.arni:
		    Intent intent3 = new Intent(this, yprag.plechi.Arni.class);
		      startActivity(intent3);
			break;
		case R.id.rzvg:
		    Intent intent4 = new Intent(this, yprag.plechi.Razved.class);
		      startActivity(intent4);
			break;
		case R.id.podie:
		    Intent intent5 = new Intent(this, yprag.plechi.Podiem.class);
		      startActivity(intent5);
			break;
		}
		
	}

	
	
}
