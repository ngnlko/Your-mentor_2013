package com.youtrain;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Dnevnik extends Activity implements OnClickListener {
	
	TextView dnev;
	Button save,clear;
	EditText text;
	
	DBHelper dbHelper;

	
	 @Override
	  public void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
			 setContentView(R.layout.dnevnik);
			 
			 
			 dnev = (TextView) findViewById(R.id.show);
			 
		        save = (Button) findViewById(R.id.save);
		        save.setOnClickListener(this);
		        
		        clear = (Button) findViewById(R.id.clear);
		        clear.setOnClickListener(this);
		        
		        text = (EditText) findViewById(R.id.text);
		        
		        // ������� ������ ��� �������� � ���������� �������� ��
		        dbHelper = new DBHelper(this);
		        
		       out();
	 
	 }

	
	@SuppressLint("SimpleDateFormat")
	@Override
	public void onClick(View v) {
		
	    
	    // ������� ������ ��� ������
	    ContentValues cv = new ContentValues();
	    
	    // �������� ������ �� ����� �����
	    String data = text.getText().toString();
	   
	    // ������������ � ��
	    SQLiteDatabase db = dbHelper.getWritableDatabase();
	    
		Calendar cs = Calendar.getInstance();
		SimpleDateFormat date = new SimpleDateFormat("dd.MM.yy"+"/"+"HH:mm");
		String dt = date.format(cs.getTime());
	    
		switch (v.getId()) 
		{
		
	    case R.id.save:
	        // ���������� ������ ��� ������� � ���� ���: ������������ ������� - ��������
	        cv.put("date", dt);
	        cv.put("data", data);
		      // ��������� ������
	        db.insert("dnevnik", null, cv);
	        out();
	        break;
	        
	    case R.id.clear:
	        db.delete("dnevnik", null, null);
	        dnev.setText("������ �������");
	        break; 
		}
		dbHelper.close();
	}
	
	
 
	    
	  public void out()
	  {
	 
	           
	        SQLiteDatabase db = dbHelper.getWritableDatabase();
	       
	        dnev.setText("");

	        Cursor c = db.query("dnevnik", null, null, null, null, null, null);

	        if (c.moveToFirst()) {
	          
	        	int dateColIndex = c.getColumnIndex("date");
	          int dataColIndex = c.getColumnIndex("data");
	          

	          do {
	            
	          	dnev.setText(dnev.getText()+c.getString(dateColIndex)+": "+c.getString(dataColIndex) +"\n");      
	            

	          } 
	          while (c.moveToNext());
	        } 
	        else 
	        {
	        dnev.setText("������ �� �������"); 
	        c.close();
	        dbHelper.close();
	        }
	        
	       
	        
	  };
	    
	    class DBHelper extends SQLiteOpenHelper {

		    public DBHelper(Context context) {
		      // ����������� �����������
		    	   super(context, "dnevnik", null, 1);
		    }

		    @Override
		    public void onCreate(SQLiteDatabase db) {
			      

			      db.execSQL("create table dnevnik ("
				          + "date text,"
				          + "data text" + ");");
			    }
		    
		    @Override
		    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

		    }
		  }



}
