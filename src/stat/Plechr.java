package stat;

import com.youtrain.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

public class Plechr extends Activity {
	 TextView out;
	  protected void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
			 setContentView(R.layout.work);
			 
			 out=(TextView)findViewById(R.id.textout);
			 String text=getString(R.string.plechr);
			 
			 Spanned result = Html.fromHtml(text);

			 out.setText(result);
			 
	  }
}
