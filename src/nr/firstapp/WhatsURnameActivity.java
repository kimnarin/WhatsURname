package nr.firstapp;


import android.app.Activity;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WhatsURnameActivity extends Activity implements android.view.View.OnClickListener{
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_NoTitleBar);
        setContentView(R.layout.main);
        
        
        ImageButton btnStrat= (ImageButton)findViewById(R.id.btnStart);

       btnStrat.setOnClickListener(this);
       
    }

	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.btnStart){
    		//첫번째 액티비티를 호출
    		Intent intent1 = new Intent(this, Test1.class);
    		startActivity(intent1);
    	}
	}
    
}