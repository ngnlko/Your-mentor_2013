package yprag.spina;

import com.youtrain.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.ImageView;
import android.widget.TextView;

public class Tgant extends Activity {
	 TextView out;
	  protected void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
			 setContentView(R.layout.ypragn);
			 
			 out=(TextView)findViewById(R.id.txtout);
			 String text=getString(R.string.gant);
			 
			 Spanned result = Html.fromHtml(text);
	            ImageView i = (ImageView) findViewById(R.id.ypr_img);
	            i.setImageResource(R.drawable.gant);

			 out.setText(result);
			 
	  }
}