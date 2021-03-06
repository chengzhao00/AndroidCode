package com.dblue.animation;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.dblue.androiddemo.R;

public class PropertyAnimation extends Activity {
	private ImageView img;
	private Button but1,but2;
	private float screenHeight;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.property_animation02);
		DisplayMetrics dm = new DisplayMetrics();
		//��ȡ��Ļ��Ϣ
		        getWindowManager().getDefaultDisplay().getMetrics(dm);
		        screenHeight = dm.heightPixels;
		img = (ImageView) findViewById(R.id.id_ball);
		but1 = (Button) findViewById(R.id.vertical);
		but2 = (Button) findViewById(R.id.para);
		but1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
//				ObjectAnimator.ofFloat(img, "scaleX", 0.0f,360f).setDuration(500).start();
				ValueAnimator animator = ValueAnimator.ofFloat(0, screenHeight - img.getHeight());  
		        animator.setTarget(img);  
		        animator.setDuration(1000).start();  
		        animator.addUpdateListener(new AnimatorUpdateListener(){  
		            @Override  
		            public void onAnimationUpdate(ValueAnimator animation)  {  
		            	img.setTranslationY((Float) animation.getAnimatedValue());  
		            }  
		        });  
			}
		});
		but2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
			}
		});
	}
}
