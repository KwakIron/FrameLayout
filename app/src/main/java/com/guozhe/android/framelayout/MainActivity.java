package com.guozhe.android.framelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.frameLayout);
        final mView mview = new mView(this);
        //为我们的萌妹子添加触摸事件监听器
        mview.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mview.x = motionEvent.getX();
                mview.y = motionEvent.getY();
                mview.invalidate();
                return true;
            }
        });
        frameLayout.addView(mview);



    }
}
