package yprag;

import com.youtrain.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Spina extends Activity implements OnClickListener {

	Button btn1,btn2,btn3, btn4,btn5;
	TextView test;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.spina);
    	
        
        
    	btn1 = (Button) findViewById(R.id.vnakl);
    	btn2 = (Button) findViewById(R.id.tgant);
    	btn3 = (Button) findViewById(R.id.vtyag);
    	btn4 = (Button) findViewById(R.id.vtyag1);
    	btn5= (Button)findViewById(R.id.gtyag);

	
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

		case R.id.vnakl:
		    Intent intent1 = new Intent(this, yprag.spina.Vnaklone.class);
		      startActivity(intent1);
			break;
		case R.id.tgant:
		    Intent intent2 = new Intent(this, yprag.spina.Tgant.class);
		      startActivity(intent2);
			break;
		case R.id.vtyag:
		    Intent intent3 = new Intent(this, yprag.spina.Verttyag.class);
		      startActivity(intent3);
			break;
		case R.id.vtyag1:
		    Intent intent4 = new Intent(this, yprag.spina.Verttyag1.class);
		      startActivity(intent4);
			break;
		case R.id.gtyag:
		    Intent intent5 = new Intent(this, yprag.spina.Goriztyag.class);
		      startActivity(intent5);
			break;
		}
		
		
	}
	
	
}
