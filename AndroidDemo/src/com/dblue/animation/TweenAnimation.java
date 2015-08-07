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
			/*����1����ת����ʼ�Ƕ�
			����2����ת����ֹ�Ƕ�
			����3����ת���ĵ�x��ȡֵ���շ�ʽ
			����4�����ĵ�x���ȡֵ
			����5����ת���ĵ�y��ȡֵ���շ�ʽ
			����6�����ĵ�y���ȡֵ
            */
			animation = new  RotateAnimation(360,0,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f); 
			animation.setDuration(5000);
			img.startAnimation(animation);
			break;
		case R.id.translate:
			//����1��x�����ʼλ��;����2��x�����ֹλ��;����3:y�����ʼλ��;����4��y�����ֹλ��
			/*
			 * ��x��Ϊ�����ܲ������Ӧֵ�Ĺ�ϵ:
  ���ѡ�����ΪAnimation.ABSOLUTE����ô��Ӧ��ֵӦ���Ǿ��������ֵ������100��300��ָ���Ե���Ļ���ص�λ
  ���ѡ�����ΪAnimation.RELATIVE_TO_SELF���� Animation.RELATIVE_TO_PARENTָ�������������򸸿ؼ���
  ��ӦֵӦ�����Ϊ�����������߸��ؼ��ļ�����ٷ�֮���١�
			 */
			animation = new TranslateAnimation(0,200,0,0);
			animation.setDuration(5000);
			img.startAnimation(animation);
			break;
		case R.id.scale:
			/* ����1��x������ʼ��С(1f��ʾԭͼ��С)
		            ����2��x������ֹ��С(0.2f��ʾԭͼ��0.2��)
		           ����3��y������ʼ��С(1f��ʾԭͼ��С)
		           ����4��y������ֹ��С(0.2f��ʾԭͼ��0.2��)
			 */
			animation = new ScaleAnimation(1.0f,0.0f,1.0f,0.0f,0.5f,0.5f);
			animation.setDuration(5000);
			img.startAnimation(animation);
			break;
		}
	}
}
