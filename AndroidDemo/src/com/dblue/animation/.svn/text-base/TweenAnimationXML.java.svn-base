package com.dblue.animation;

import com.dblue.androiddemo.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class TweenAnimationXML extends Activity implements OnClickListener{
	private Animation animation;
	private Button alpha, rotate, translate, scale;
	private ImageView img;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tween_animation);
		img = (ImageView) findViewById(R.id.image);
		alpha = (Button) findViewById(R.id.alpha);
		rotate = (Button) findViewById(R.id.rotate);
		translate = (Button) findViewById(R.id.translate);
		scale = (Button) findViewById(R.id.scale);
		alpha.setOnClickListener(this);
		rotate.setOnClickListener(this);
		translate.setOnClickListener(this);
		scale.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.alpha:
			animation = AnimationUtils.loadAnimation(TweenAnimationXML.this,R.anim.alpha_test);
			img.setAnimation(animation);
			break;
		case R.id.rotate:
			animation = AnimationUtils.loadAnimation(TweenAnimationXML.this,R.anim.alpha_test);
			img.setAnimation(animation);
			break;
		case R.id.translate:
			animation = AnimationUtils.loadAnimation(TweenAnimationXML.this,R.anim.alpha_test);
			img.setAnimation(animation);
			break;
		case R.id.scale:
			animation = AnimationUtils.loadAnimation(TweenAnimationXML.this,R.anim.alpha_test);
			img.setAnimation(animation);
			break;
		}
	}
}
