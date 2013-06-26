package nr.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Result extends Activity implements OnClickListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_NoTitleBar);
		setContentView(R.layout.finish);

		TextView txtName = (TextView) findViewById(R.id.txtName);
		TextView txtResult = (TextView) findViewById(R.id.txtResult);
		ImageButton btnOK = (ImageButton) findViewById(R.id.btnOK);

		txtName.setText("Iris(아이리스)");
		txtName.setTextColor(Color.BLUE);
		txtName.setTextSize(28);
		
		txtResult.setText("무지개 여신이라는 뜻인데 성격이 조용한 여자아이들이 써요.");
		txtResult.setTextColor(Color.BLACK);
		txtResult.setTextSize(20);
		
		btnOK.setOnClickListener(this);
	}

	public void onClick(View v) {
		if (v.getId() == R.id.btnOK) {
			// 첫번째 액티비티를 호출
			Intent intent1 = new Intent(this, WhatsURnameActivity.class);
			startActivity(intent1);
		}
	}

}
