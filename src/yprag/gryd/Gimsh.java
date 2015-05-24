package yprag.gryd;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.ImageView;
import android.widget.TextView;

import com.youtrain.R;

public class Gimsh extends Activity {
	
	 TextView out;
	  protected void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
			 setContentView(R.layout.ypragn);
			 
			 out=(TextView)findViewById(R.id.txtout);
			 String text=getString(R.string.gimshtan);
			 
			 Spanned result = Html.fromHtml(text);
	            ImageView i = (ImageView) findViewById(R.id.ypr_img);
	            i.setImageResource(R.drawable.gim_leja);

			 out.setText(result);
			 
	  }

}
