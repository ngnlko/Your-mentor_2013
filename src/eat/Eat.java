package eat;

import com.youtrain.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

public class Eat extends Activity {
	
	 TextView out;
	  protected void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
			 setContentView(R.layout.eat);
			 
			 out=(TextView)findViewById(R.id.prot);
			 String text=getString(R.string.pitanie);
			 
			 Spanned result = Html.fromHtml(text);

			 out.setText(result);
			 
	  }
	

}
