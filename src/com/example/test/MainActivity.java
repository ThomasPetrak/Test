package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	int i = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		final TextView tw1 = (TextView) findViewById(R.id.textView1);

		button1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				tw1.setText(tw1.getText().toString() + ++i);
			}
		});

		button2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				i = 0;
				tw1.setText("Hello World");
				Intent intent = new Intent(MainActivity.this, Activity2.class);
				startActivity(intent);
			}
		});
	}
}
