package com.bartech.sms.ui.googlemap;

import android.os.Bundle;

import com.bartech.sms.R;
import com.bartech.sms.ui.base.BaseActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * Created by Ahmed on 7/9/2018.
 */

public class GoogleMapActivity extends BaseActivity implements GoogleMapMvpView {

    @Inject
    GoogleMapMvpPresenter<GoogleMapMvpView> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_maps);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(GoogleMapActivity.this);
    }


















    @Override
    protected void setUp() {

    }
}
