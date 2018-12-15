package com.bartech.sms.ui.requestspareparts;

import android.os.Bundle;

import com.bartech.sms.R;
import com.bartech.sms.ui.base.BaseActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * Created by Ahmed on 8/6/2018.
 */

public class RequestSparePartsActivity extends BaseActivity implements RequestSparePartsMvpView {

    @Inject
    RequestSparePartsMvpPresenter<RequestSparePartsMvpView> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spare_parts);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(RequestSparePartsActivity.this);

    }

















    @Override
    protected void setUp() {

    }
}
