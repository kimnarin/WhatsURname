package nr.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Test1 extends Activity implements OnClickListener {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_NoTitleBar);
		setContentView(R.layout.test);
		ImageButton btnBoy = (ImageButton) findViewById(R.id.btnBoy);
		ImageButton btnGirl = (ImageButton) findViewById(R.id.btnGirl);
		ImageButton btnBack = (ImageButton) findViewById(R.id.btnBack);

		btnBoy.setOnClickListener(this);
		btnGirl.setOnClickListener(this);
		btnBack.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		boolean gender = false; // 남자=true
		if (v.getId() == R.id.btnBoy) {
			gender = true;
			Intent intent0 = new Intent(this, Page2.class); // 남자
			startActivity(intent0);
		} else if (v.getId() == R.id.btnGirl) {
			Intent intent1 = new Intent(this, Page2.class);
			startActivity(intent1);
		}
		
		if (v.getId() == R.id.btnBack) {
			finish();
		}

	}

}
