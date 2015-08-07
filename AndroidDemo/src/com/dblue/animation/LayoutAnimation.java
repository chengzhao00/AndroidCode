package com.dblue.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dblue.androiddemo.R;

public class LayoutAnimation extends Activity {
	private Button button;
	private LinearLayout layout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_animation);
		initView();
		setListener();
	}
	private void initView() {
		button = (Button) findViewById(R.id.but);
		layout = (LinearLayout) findViewById(R.id.layout);
	}
	private void setListener() {
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				TextView tv = new TextView(LayoutAnimation.this);
				tv.setText("hello animation");
				layout.addView(tv);
				layout.postInvalidate();
			}
		});
	}
}
