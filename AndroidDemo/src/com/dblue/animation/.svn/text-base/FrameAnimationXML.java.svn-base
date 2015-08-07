package com.dblue.animation;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.dblue.androiddemo.R;

public class FrameAnimationXML extends Activity {
	private ImageView img;
	AnimationDrawable ad;
	private Button start,stop;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frame_animation);
		img = (ImageView) findViewById(R.id.img);
		start = (Button) findViewById(R.id.start);
		stop = (Button) findViewById(R.id.stop);
		ad = (AnimationDrawable) img.getBackground();
		start.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				ad.start();
			}
		});
		stop.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				ad.stop();
			}
		});
				
	}
}
