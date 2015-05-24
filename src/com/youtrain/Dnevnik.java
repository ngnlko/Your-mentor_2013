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
		        
		        // создаем объект для создания и управления версиями БД
		        dbHelper = new DBHelper(this);
		        
		       out();
	 
	 }

	
	@SuppressLint("SimpleDateFormat")
	@Override
	public void onClick(View v) {
		
	    
	    // создаем объект для данных
	    ContentValues cv = new ContentValues();
	    
	    // получаем данные из полей ввода
	    String data = text.getText().toString();
	   
	    // подключаемся к БД
	    SQLiteDatabase db = dbHelper.getWritableDatabase();
	    
		Calendar cs = Calendar.getInstance();
		SimpleDateFormat date = new SimpleDateFormat("dd.MM.yy"+"/"+"HH:mm");
		String dt = date.format(cs.getTime());
	    
		switch (v.getId()) 
		{
		
	    case R.id.save:
	        // подготовим данные для вставки в виде пар: наименование столбца - значение
	        cv.put("date", dt);
	        cv.put("data", data);
		      // вставляем запись
	        db.insert("dnevnik", null, cv);
	        out();
	        break;
	        
	    case R.id.clear:
	        db.delete("dnevnik", null, null);
	        dnev.setText("Данные удалены");
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
	        dnev.setText("Ничего не найдено"); 
	        c.close();
	        dbHelper.close();
	        }
	        
	       
	        
	  };
	    
	    class DBHelper extends SQLiteOpenHelper {

		    public DBHelper(Context context) {
		      // конструктор суперкласса
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
