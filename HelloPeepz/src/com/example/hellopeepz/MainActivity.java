package com.example.hellopeepz;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.content.DialogInterface;

public class MainActivity extends Activity {

	
    private Button button;
    private Button button2;
    private Button button3;
    
	public void onCreate(Bundle savedInstanceState) {
		 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
 
		button = (Button) findViewById(R.id.Toastyz);
		button2 = (Button) findViewById(R.id.Toastyz2);
		button3 = (Button) findViewById(R.id.Alertz);
 
		
		button.setOnClickListener(new OnClickListener() {
 
			  @Override
			  public void onClick(View arg0) {
 
			     Toast.makeText(getApplicationContext(), 
                               "Owie q.q", Toast.LENGTH_LONG).show();
			  }
		});
		
		
		
		
		button2.setOnClickListener(new OnClickListener() {
			 
			  @Override
			  public void onClick(View arg0) {

			     Toast.makeText(getApplicationContext(), 
                             "Please die :)", Toast.LENGTH_LONG).show();
			  }
		});
	

	
	button3.setOnClickListener(new OnClickListener() {
		
		@SuppressWarnings("deprecation")
		public void onClick(View arg0) {
			
			AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();               
            alertDialog.setTitle("Alertz");
            alertDialog.setMessage("Be Advised: GIMME A COOKIE DAMNIT");
            //alertDialog.setButton("OK", listener)
            alertDialog.setButton("OK", new DialogInterface.OnClickListener(){
            	public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();
            	}
            });
            alertDialog.show();
            finish();
        }
    }); 

}
}