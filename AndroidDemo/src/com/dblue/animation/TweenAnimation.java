package com.dblue.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import com.dblue.androiddemo.R;

public class TweenAnimation extends Activity implements OnClickListener {
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
			animation = new AlphaAnimation(0, 1);
			animation.setDuration(5000);
			img.startAnimation(animation);
			break;

		case R.id.rotate:
			/*参数1：旋转的起始角度
			参数2：旋转的终止角度
			参数3：旋转中心的x轴取值参照方式
			参数4：中心点x轴的取值
			参数5：旋转中心的y轴取值参照方式
			参数6：中心点y轴的取值
            */
			animation = new  RotateAnimation(360,0,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f); 
			animation.setDuration(5000);
			img.startAnimation(animation);
			break;
		case R.id.translate:
			//参数1：x轴的起始位置;参数2：x轴的终止位置;参数3:y轴的起始位置;参数4：y轴的终止位置
			/*
			 * 以x轴为例介绍参照与对应值的关系:
  如果选择参照为Animation.ABSOLUTE，那么对应的值应该是具体的坐标值，比如100到300，指绝对的屏幕像素单位
  如果选择参照为Animation.RELATIVE_TO_SELF或者 Animation.RELATIVE_TO_PARENT指的是相对于自身或父控件，
  对应值应该理解为相对于自身或者父控件的几倍或百分之多少。
			 */
			animation = new TranslateAnimation(0,200,0,0);
			animation.setDuration(5000);
			img.startAnimation(animation);
			break;
		case R.id.scale:
			/* 参数1：x方向起始大小(1f表示原图大小)
		            参数2：x方向终止大小(0.2f表示原图的0.2倍)
		           参数3：y方向起始大小(1f表示原图大小)
		           参数4：y方向终止大小(0.2f表示原图的0.2倍)
			 */
			animation = new ScaleAnimation(1.0f,0.0f,1.0f,0.0f,0.5f,0.5f);
			animation.setDuration(5000);
			img.startAnimation(animation);
			break;
		}
	}
}
