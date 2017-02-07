package com.tuantrandev.tuantran.alphaanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnFadeIn, btnFadeOut, btnRepeat, btnZoomIn, btnZoomOut, btnZoomRepeat, btnMoveUp, btnMoveDown, btnMoveLeft, btnMoveRight,
            btnRotate, btnSequence, btnParallel;
    ImageView imgTuanTran;
    Animation anim_fadeIn, anim_fadeOut, anim_repeat, anim_zoomIn, anim_zoomOut, animZoomRepeat, anim_moveUp, anim_moveDown, anim_moveLeft, anim_moveRight,
                anim_rotate, anim_Sequence, anim_Parallel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Map views
        btnFadeIn = (Button)findViewById(R.id.btnFadeIn);
        btnFadeOut = (Button)findViewById(R.id.btnFadeOut);
        btnRepeat = (Button)findViewById(R.id.btnRepeat);
        btnZoomIn = (Button) findViewById(R.id.btnZoomIn);
        btnZoomOut = (Button)findViewById(R.id.btnZoomOut);
        btnZoomRepeat = (Button)findViewById(R.id.btnZoomRepeat);
        btnMoveUp = (Button)findViewById(R.id.btnMoveUp);
        btnMoveDown = (Button)findViewById(R.id.btnMoveDown);
        btnMoveLeft = (Button)findViewById(R.id.btnLeft);
        btnMoveRight = (Button)findViewById(R.id.btnRight);
        btnRotate = (Button)findViewById(R.id.btnRotate);
        btnSequence = (Button)findViewById(R.id.btnSequence);
        btnParallel = (Button)findViewById(R.id.btnParallel);
        imgTuanTran = (ImageView) findViewById(R.id.imgTuanTran);
        myanimation();
        buttonClick();

    }
    // Animation
    private void myanimation(){
        anim_fadeIn = AnimationUtils.loadAnimation(this, R.anim.anim_fadein);
        anim_fadeOut = AnimationUtils.loadAnimation(this, R.anim.anim_fadeout);
        anim_repeat = AnimationUtils.loadAnimation(this, R.anim.anim_repeat);
        anim_zoomIn = AnimationUtils.loadAnimation(this, R.anim.anim_zoomin);
        anim_zoomOut = AnimationUtils.loadAnimation(this, R.anim.anim_zoomout);
        animZoomRepeat = AnimationUtils.loadAnimation(this, R.anim.anim_zoomrepeat);
        anim_moveUp = AnimationUtils.loadAnimation(this,R.anim.anim_moveup);
        anim_moveDown = AnimationUtils.loadAnimation(this, R.anim.anim_movedown);
        anim_moveLeft = AnimationUtils.loadAnimation(this, R.anim.anim_moveleft);
        anim_moveRight = AnimationUtils.loadAnimation(this, R.anim.anim_moveright);
        anim_rotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
        anim_Sequence = AnimationUtils.loadAnimation(this, R.anim.anim_sequence);
        anim_Parallel = AnimationUtils.loadAnimation(this, R.anim.anim_parallel);
    }

    // click button
    private void buttonClick(){
        btnFadeIn.setOnClickListener(this);
        btnFadeOut.setOnClickListener(this);
        btnRepeat.setOnClickListener(this);
        btnZoomIn.setOnClickListener(this);
        btnZoomOut.setOnClickListener(this);
        btnZoomRepeat.setOnClickListener(this);
        btnMoveUp.setOnClickListener(this);
        btnMoveDown.setOnClickListener(this);
        btnMoveLeft.setOnClickListener(this);
        btnMoveRight.setOnClickListener(this);
        btnRotate.setOnClickListener(this);
        btnSequence.setOnClickListener(this);
        btnParallel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==btnFadeIn){
            imgTuanTran.startAnimation(anim_fadeIn);
        }
        if (v==btnFadeOut){
            imgTuanTran.startAnimation(anim_fadeOut);
        }
        if (v==btnRepeat){
            imgTuanTran.startAnimation(anim_repeat);
        }
        if (v==btnZoomIn){
            imgTuanTran.startAnimation(anim_zoomIn);
        }
        if (v==btnZoomOut){
            imgTuanTran.startAnimation(anim_zoomOut);
        }
        if (v==btnZoomRepeat){
            imgTuanTran.startAnimation(animZoomRepeat);
        }
        if (v==btnMoveUp){
            imgTuanTran.startAnimation(anim_moveUp);
        }
        if (v==btnMoveDown){
            imgTuanTran.startAnimation(anim_moveDown);
        }
        if (v==btnMoveLeft){
            imgTuanTran.startAnimation(anim_moveLeft);
        }
        if (v==btnMoveRight){
            imgTuanTran.startAnimation(anim_moveRight);
        }
        if (v==btnRotate){
            imgTuanTran.startAnimation(anim_rotate);
        }
        if (v==btnSequence){
            imgTuanTran.startAnimation(anim_Sequence);
        }
        if (v==btnParallel){
            imgTuanTran.startAnimation(anim_Parallel);
        }
    }
}
