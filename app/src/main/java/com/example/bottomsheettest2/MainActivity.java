package com.example.bottomsheettest2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coordinatorlayout);

        // get the bottom sheet view
        LinearLayout llBottomSheet = (LinearLayout) findViewById(R.id.bottom_sheet);

// init the bottom sheet behavior
        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from(llBottomSheet);

// change the state of the bottom sheet

        //默认的折叠状态， bottom sheets只在底部显示一部分布局。显示高度可以通过 app:behavior_peekHeight 设置（默认是0）
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        //不折叠，全部展开内容
       // bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        //折叠部分，折叠部分向上滑动，展示全部内容
       // bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);

// set hideable or not
        bottomSheetBehavior.setHideable(false);

// set callback for changes
        bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {

            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });

    }
}
