package nr.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class Page3 extends Activity  implements OnClickListener {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_NoTitleBar);
		setContentView(R.layout.page3);
		
		ImageButton btnBack = (ImageButton) findViewById(R.id.btnBack);
		ImageButton btnNext = (ImageButton) findViewById(R.id.btnNext);
		RadioButton rdo1 = (RadioButton) findViewById(R.id.rdo1);
		RadioButton rdo2 = (RadioButton) findViewById(R.id.rdo2);
		rdo1.setTextColor(Color.BLUE);
		rdo2.setTextColor(Color.RED);
		rdo1.setTextSize(25);
		rdo2.setTextSize(25);
		
		btnNext.setOnClickListener(this);
		btnBack.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		char personal_2 = 'o'; // o =outstanding , p = passitive(소극적인)
		if (v.getId() == R.id.rdo1) {
			personal_2 = 'o';
		}else if (v.getId() == R.id.rdo2) {
			personal_2 = 'p';
		}
		if (v.getId() == R.id.btnNext) {
			// 첫번째 액티비티를 호출
			Intent intent1 = new Intent(this, Result.class);
			startActivity(intent1);
		} else if (v.getId() == R.id.btnBack) {
			finish();
		}
	}

}
