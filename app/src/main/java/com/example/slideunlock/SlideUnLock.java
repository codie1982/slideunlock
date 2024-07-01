package com.example.slideunlock;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class SlideUnLock extends MotionLayout {
    MotionLayout motionLayout;
    ISlideunlock iSlideunlock;
    public SlideUnLock(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        View v = LayoutInflater.from(context).inflate(R.layout.slide_unlock, this, true);
        motionLayout = v.findViewById(R.id.motionLayout);

    }

    public void setListener(ISlideunlock iSlideunlock) {
        this.iSlideunlock = iSlideunlock;
        init();
    }

    private void init() {
        motionLayout.setTransitionListener(new TransitionListener() {
            @Override
            public void onTransitionStarted(MotionLayout motionLayout, int startId, int endId) {

            }

            @Override
            public void onTransitionChange(MotionLayout motionLayout, int startId, int endId, float progress) {

            }

            @Override
            public void onTransitionCompleted(MotionLayout motionLayout, int currentId) {
                iSlideunlock.onComplete();
            }

            @Override
            public void onTransitionTrigger(MotionLayout motionLayout, int triggerId, boolean positive, float progress) {

            }
        });
    }
}
