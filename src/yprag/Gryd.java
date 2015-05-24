package yprag;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.youtrain.R;

public class Gryd extends Activity implements OnClickListener {
	
	Button btn1,btn2,btn3, btn4,btn5, btn6, btn7,btn8,btn9;
	TextView test;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.gryd);
    	
        
        
    	btn1 = (Button) findViewById(R.id.gim);
    	btn2 = (Button) findViewById(R.id.gim1);
    	btn3 = (Button) findViewById(R.id.razved);
    	btn4 = (Button) findViewById(R.id.otjim);
    	btn5= (Button)findViewById(R.id.otjim1);
    	btn6=(Button)findViewById(R.id.pylov);
    	btn7=(Button)findViewById(R.id.sved);
    	btn8=(Button)findViewById(R.id.naklon);
    	btn9=(Button)findViewById(R.id.cros);
	
    	btn1.setOnClickListener(this);
    	btn2.setOnClickListener(this);
    	btn3.setOnClickListener(this);
    	btn4.setOnClickListener(this);
    	btn5.setOnClickListener(this);
    	btn6.setOnClickListener(this);
    	btn7.setOnClickListener(this);
    	btn8.setOnClickListener(this);
    	btn9.setOnClickListener(this);

    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{

		case R.id.gim:
		    Intent intent1 = new Intent(this, yprag.gryd.Gimsh.class);
		      startActivity(intent1);
			break;
		case R.id.gim1:
		    Intent intent2 = new Intent(this, yprag.gryd.Gims1.class);
		      startActivity(intent2);
			break;
		case R.id.razved:
		    Intent intent3 = new Intent(this, yprag.gryd.Razved.class);
		      startActivity(intent3);
			break;
		case R.id.otjim:
		    Intent intent4 = new Intent(this, yprag.gryd.Otjim.class);
		      startActivity(intent4);
			break;
		case R.id.otjim1:
		    Intent intent5 = new Intent(this, yprag.gryd.Otjim1.class);
		      startActivity(intent5);
			break;
		case R.id.pylov:
		    Intent intent6 = new Intent(this, yprag.gryd.Pylov.class);
		      startActivity(intent6);
			break;
		case R.id.sved:
		    Intent intent7 = new Intent(this, yprag.gryd.Sved.class);
		      startActivity(intent7);
			break;
		case R.id.naklon:
		    Intent intent8 = new Intent(this, yprag.gryd.Naklon.class);
		      startActivity(intent8);
			break;
		case R.id.cros:
		    Intent intent9 = new Intent(this, yprag.gryd.Cros.class);
		      startActivity(intent9);
			break;
		}
	}
	

}
