package com.cool.photoalbum.ui.fragment;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseFragment;
import com.cool.photoalbum.model.domain.DataServer;
import com.cool.photoalbum.ui.adapter.CategoryAdapter;
import com.cool.photoalbum.utils.Constants;
import com.cool.photoalbum.utils.PushActivityUtil;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class CategoryFragment extends BaseFragment {
    private RecyclerView mRecyclerView;
    private CategoryAdapter mAdapter;
    private AdView adView;
    private RelativeLayout containerView;

    @Override
    protected int getRootViewResId() {
        return R.layout.fragment_category;
    }

    @Override
    protected void initView(View rootView) {
        setUpState(State.SUCCESS);

        mRecyclerView = rootView.findViewById(R.id.category_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new CategoryAdapter();
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setAnimationEnable(true);
        mAdapter.addChildClickViewIds(R.id.category_item_img);
        mAdapter.setOnItemChildClickListener(new OnItemChildClickListener() {
            @Override
            public void onItemChildClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                PushActivityUtil.toPhotoListPage(getContext(), DataServer.getCategoryList().get(position));
            }
        });

        MobileAds.initialize(getContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                Log.d("TAG", "onInitializationComplete: " + initializationStatus.toString());
            }
        });

        containerView = rootView.findViewById(R.id.category_container);
        adView = new AdView(getContext());
        adView.setAdUnitId(Constants.KEY_AD_VIEW_ID);
        containerView.addView(adView);

        RelativeLayout.LayoutParams layoutParams=(RelativeLayout.LayoutParams)adView.getLayoutParams();
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        layoutParams.addRule(RelativeLayout.BELOW,R.id.category_linear_layout);
        adView.setLayoutParams(layoutParams);
        loadBanner();
    }

    private void loadBanner() {
        // Create an ad request. Check your logcat output for the hashed device ID
        // to get test ads on a physical device, e.g.,
        // "Use AdRequest.Builder.addTestDevice("ABCDE0123") to get test ads on this
        // device."
        AdRequest adRequest =
                new AdRequest.Builder().build();

        AdSize adSize = getAdSize();
        // Step 4 - Set the adaptive ad size on the ad view.
        adView.setAdSize(adSize);


        // Step 5 - Start loading the ad in the background.
        adView.loadAd(adRequest);
    }

    private AdSize getAdSize() {
        // Step 2 - Determine the screen width (less decorations) to use for the ad width.
        Display display = getActivity().getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        float widthPixels = outMetrics.widthPixels;
        float density = outMetrics.density;

        int adWidth = (int) (widthPixels / density);

        // Step 3 - Get adaptive ad size and return for setting on the ad view.
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(getContext(), adWidth);
    }
}
