package com.youtrain;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;

public class Timer extends Activity implements OnClickListener {
	
	
	Button start,stop,pause;
	Chronometer c;
	long time = 0;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.timer);
		
		start = (Button) findViewById(R.id.start);
		stop = (Button) findViewById(R.id.stop);
		pause = (Button) findViewById(R.id.pausa);
		c = (Chronometer) findViewById(R.id.chronometer);
		
    	start.setOnClickListener(this);
    	stop.setOnClickListener(this);
    	pause.setOnClickListener(this);
    	
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{

		case R.id.start:
			c.setBase(SystemClock.elapsedRealtime()+time);
			c.start();
			break;
			
		case R.id.pausa:
			time=c.getBase()-SystemClock.elapsedRealtime();
			c.stop();
			break;
			
		case R.id.stop:
			c.setBase(SystemClock.elapsedRealtime());
			time=0;
			c.stop();
			break;
		
	}
		
	}
	

}
