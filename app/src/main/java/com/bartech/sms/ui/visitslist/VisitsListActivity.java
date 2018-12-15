package com.bartech.sms.ui.visitslist;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bartech.sms.R;
import com.bartech.sms.data.network.model.GetVisitsRecycler;
import com.bartech.sms.data.network.model.LoginResponseCrm;
import com.bartech.sms.data.network.model.SmsVisitsListResponse;
import com.bartech.sms.ui.base.BaseActivity;
import com.bartech.sms.utils.CommonUtils;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ahmed on 7/4/2018.
 */

public class VisitsListActivity extends BaseActivity implements VisitsListMvpView {

    @Inject
    VisitsListPresenter<VisitsListMvpView> mPresenter;
    private GetVisitsRecycler mRecyclerAdapter;
    private ArrayList<SmsVisitsListResponse> datumGetAllVisits;
    @BindView(R.id.visits_recycler)
    RecyclerView getVisits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visits_list);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(VisitsListActivity.this);

        LoginResponseCrm loginResponseCrm = CommonUtils.getUser(this);
        String UserId = loginResponseCrm.getData().getUserId().toString();

        datumGetAllVisits = new ArrayList<>();
        mPresenter.getAllVisits(UserId);


    }

    @Override
    public void setAllVisits(SmsVisitsListResponse allVisits) {
        datumGetAllVisits = new ArrayList<SmsVisitsListResponse>();
        mRecyclerAdapter = new GetVisitsRecycler(VisitsListActivity.this, datumGetAllVisits);
        getVisits.setHasFixedSize(true);
        getVisits.setLayoutManager(new LinearLayoutManager(this));
        getVisits.setAdapter(mRecyclerAdapter);

    }


    @Override
    protected void setUp() {

    }


}
