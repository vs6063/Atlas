package com.team4.atlas; /**
 * Created by victo on 3/03/2018.
 */

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class NestedVScroll extends android.support.v4.widget.NestedScrollView {

    public NestedVScroll(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public NestedVScroll(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NestedVScroll(Context context) {
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }
}