package nr.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Page2 extends Activity implements OnClickListener {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_NoTitleBar);
		setContentView(R.layout.page2);

		ImageButton btnBack = (ImageButton) findViewById(R.id.btnBack);
		ImageButton btnNext = (ImageButton) findViewById(R.id.btnNext);
		RadioButton rdo1 = (RadioButton) findViewById(R.id.rdo1);
		RadioButton rdo2 = (RadioButton) findViewById(R.id.rdo2);
		RadioButton rdo3 = (RadioButton) findViewById(R.id.rdo3);
		RadioButton rdo4 = (RadioButton) findViewById(R.id.rdo4);

		rdo1.setTextColor(Color.BLUE);
		rdo2.setTextColor(Color.RED);
		rdo3.setTextColor(Color.YELLOW);
		rdo4.setTextColor(Color.BLACK);
		rdo1.setTextSize(25);
		rdo2.setTextSize(25);
		rdo3.setTextSize(25);
		rdo4.setTextSize(25);

		btnNext.setOnClickListener(this);
		btnBack.setOnClickListener(this);

	}

	public void onClick(View v) {
		char personal_1 = 'c'; // c = cute, p = pretty, a = attractive(매력적인), n
								// = nomal
		if (v.getId() == R.id.rdo1) {
			personal_1 = 'c';
		} else if (v.getId() == R.id.rdo2) {
			personal_1 = 'p';
		} else if (v.getId() == R.id.rdo3) {
			personal_1 = 'a';
		} else if (v.getId() == R.id.rdo4) {
			personal_1 = 'n';
		}
		if (v.getId() == R.id.btnNext) {
			// 첫번째 액티비티를 호출
			Intent intent1 = new Intent(this, Page3.class);
			startActivity(intent1);
		} else if (v.getId() == R.id.btnBack) {
			finish();
		}
	}

}
