package com.cool.photoalbum.ui.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import com.cool.photoalbum.R;

public class SectionRowView extends RelativeLayout {

    private String mTitle ;
    private TextView mTtitleTextView;

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public SectionRowView(Context context) {
        this(context,null);
    }

    public SectionRowView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SectionRowView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray ta = context.obtainStyledAttributes(attrs,R.styleable.SectionRowStyle);
        mTitle = ta.getString(R.styleable.SectionRowStyle_title);
        ta.recycle();

        LayoutInflater.from(context).inflate(R.layout.include_item_row_view,this);
        mTtitleTextView = findViewById(R.id.section_item_title_view);
        mTtitleTextView.setText(mTitle);
    }


}
