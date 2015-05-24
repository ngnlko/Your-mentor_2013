package yprag.gryd;

import com.youtrain.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.ImageView;
import android.widget.TextView;

public class Pylov extends Activity {
	
	 TextView out;
	  protected void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
			 setContentView(R.layout.ypragn);
			 
			 out=(TextView)findViewById(R.id.txtout);
			 String text=getString(R.string.pyl);
			 
			 Spanned result = Html.fromHtml(text);
	            ImageView i = (ImageView) findViewById(R.id.ypr_img);
	            i.setImageResource(R.drawable.pylov);

			 out.setText(result);
			 
	  }

}
