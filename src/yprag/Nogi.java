package yprag;

import com.youtrain.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Nogi extends Activity implements OnClickListener {

	Button btn1,btn2,btn3, btn4,btn5,btn6;
	TextView test;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.nogi);
    	
        
        
    	btn1 = (Button) findViewById(R.id.priced);
    	btn2 = (Button) findViewById(R.id.gmnog);
    	btn3 = (Button) findViewById(R.id.vipadi);
    	btn4 = (Button) findViewById(R.id.razgeb);
    	btn5= (Button)findViewById(R.id.sgiban);
    	btn6= (Button)findViewById(R.id.podiemsid);

	
    	btn1.setOnClickListener(this);
    	btn2.setOnClickListener(this);
    	btn3.setOnClickListener(this);
    	btn4.setOnClickListener(this);
    	btn5.setOnClickListener(this);
    	btn6.setOnClickListener(this);


    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{

		case R.id.priced:
		    Intent intent1 = new Intent(this, yprag.nogi.Priced.class);
		      startActivity(intent1);
			break;
		case R.id.gmnog:
		    Intent intent2 = new Intent(this, yprag.nogi.Jimnog.class);
		      startActivity(intent2);
			break;
		case R.id.vipadi:
		    Intent intent3 = new Intent(this, yprag.nogi.Vipad.class);
		      startActivity(intent3);
			break;
		case R.id.razgeb:
		    Intent intent4 = new Intent(this, yprag.nogi.Razgiban.class);
		      startActivity(intent4);
			break;
		case R.id.sgiban:
		    Intent intent5 = new Intent(this, yprag.nogi.Sgibanie.class);
		      startActivity(intent5);
			break;
		case R.id.podiemsid:
		    Intent intent6 = new Intent(this, yprag.nogi.Podiem.class);
		      startActivity(intent6);
			break;
		}
		
		
	}
	
	
	
	
}
