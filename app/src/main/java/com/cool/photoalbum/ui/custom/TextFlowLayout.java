package com.cool.photoalbum.ui.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import com.cool.photoalbum.R;

import java.util.ArrayList;
import java.util.List;

public class TextFlowLayout extends ViewGroup {

    public static final int DEFAULT_SPACE = 10;
    private float mItemHorizontalSpace = DEFAULT_SPACE;
    private float mItemVerticalSpace = DEFAULT_SPACE;
    private int mSelfWidth;
    private int mItemHeight;
    private OnFlowTextItemClickListener mItemClickListener;

    public float getmItemHorizontalSpace() {
        return mItemHorizontalSpace;
    }

    public void setmItemHorizontalSpace(float mItemHorizontalSpace) {
        this.mItemHorizontalSpace = mItemHorizontalSpace;
    }

    public float getmItemVerticalSpace() {
        return mItemVerticalSpace;
    }

    public void setmItemVerticalSpace(float mItemVerticalSpace) {
        this.mItemVerticalSpace = mItemVerticalSpace;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public TextFlowLayout(Context context) {
        this(context,null);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public TextFlowLayout(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public TextFlowLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr,0);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public TextFlowLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        TypedArray ta = context.obtainStyledAttributes(attrs,R.styleable.FlowTextStyle);
        mItemVerticalSpace = ta.getDimension(R.styleable.FlowTextStyle_verticalSpace,DEFAULT_SPACE);
        mItemHorizontalSpace = ta.getDimension(R.styleable.FlowTextStyle_horizontalSpace,DEFAULT_SPACE);
        ta.recycle();
    }

    public void setTextList(List<String> textList){
        for (String text : textList) {
            TextView view = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.flow_text_view,this,false);
            view.setText(text);
            view.setOnClickListener(v -> {
                if (mItemClickListener != null) {
                    mItemClickListener.onFlowItemClick(text);
                }
            });
            addView(view);
        }
    }

    // 总行
    private List<List<View>> lines = new ArrayList<>();
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        lines.clear();
        // 单行
        List<View> line = null;
        
        mSelfWidth = MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft() - getPaddingRight();
        
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++){
            View itemView = getChildAt(i);
            
            if (itemView.getVisibility() != VISIBLE){
                continue;
            }
            
            measureChild(itemView,widthMeasureSpec,heightMeasureSpec);
            
            if (line == null){
                line = createNewLine(itemView);
            }else {
                if (canBrAdd(itemView,line)) {
                    line.add(itemView);
                }else {
                    line = createNewLine(itemView);
                }
            }
        }

        // 测量自己
        mItemHeight = getChildAt(0).getMeasuredHeight();
        int mSelfHeight = (int)(lines.size() * mItemHeight + (lines.size() + 1) * mItemVerticalSpace + 0.5f);
        setMeasuredDimension(mSelfWidth,mSelfHeight);
    }

    private boolean canBrAdd(View itemView, List<View> line) {
        // 行内子所有View的宽度 +（line.size + 1） * mItemHorizontalSpace + itemView.getMeasuredWidth()
        // 如果 小于、等于 当前控件的宽度，则可以添加，否则不能添加
        int totalWidth = itemView.getMeasuredWidth();
        for (View view: line){
            totalWidth += view.getMeasuredWidth();
        }

        // 因为加过itemView之后，右侧也要保存间距,需要再加一次  mItemVerticalSpace
        totalWidth += mItemHorizontalSpace * (line.size() + 1) + mItemVerticalSpace;

        return totalWidth <= mSelfWidth;
    }

    private List<View> createNewLine(View itemView) {
        List<View> line = new ArrayList<>();
        line.add(itemView);
        lines.add(line);
        return line;
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        // 摆放子View位置
        int topOffset = (int)mItemHorizontalSpace;
        for (List<View> views : lines) {
            int leftOffset = (int)mItemHorizontalSpace;
            for (View view : views) {
                view.layout(leftOffset,topOffset,leftOffset + view.getMeasuredWidth(),topOffset + view.getMeasuredHeight());
                leftOffset += view.getMeasuredWidth() + mItemHorizontalSpace;
            }
            topOffset += mItemHeight + mItemVerticalSpace;
        }
    }

    public void setOnFlowTextItemClickListener(OnFlowTextItemClickListener listener){
        mItemClickListener = listener;
    }

    public interface OnFlowTextItemClickListener{
        void onFlowItemClick(String text);
    }
}
