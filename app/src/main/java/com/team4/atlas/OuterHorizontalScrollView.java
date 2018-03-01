package com.team4.atlas;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;

/**
 * Created by victo on 1/03/2018.
 */

public class OuterHorizontalScrollView extends HorizontalScrollView {

    public ScrollView scrollView;

    public OuterHorizontalScrollView(Context context) {
        super(context);
    }

    public OuterHorizontalScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OuterHorizontalScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        super.onInterceptTouchEvent(ev);
        scrollView.onInterceptTouchEvent(ev);
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        super.onTouchEvent(ev);
        scrollView.dispatchTouchEvent(ev);
        return true;
    }
}
