package yprag.plechi;

import com.youtrain.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.ImageView;
import android.widget.TextView;

public class Gimsid1 extends Activity {
	
	 TextView out;
	  protected void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
			 setContentView(R.layout.ypragn);
			 
			 out=(TextView)findViewById(R.id.txtout);
			 String text=getString(R.string.gms1);
			 
			 Spanned result = Html.fromHtml(text);
	            ImageView i = (ImageView) findViewById(R.id.ypr_img);
	            i.setImageResource(R.drawable.gim_s1);

			 out.setText(result);
			 
	  }

}
