package com.bartech.sms.ui.requestslist;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bartech.sms.R;
import com.bartech.sms.data.network.model.DatumRequestsList;
import com.bartech.sms.data.network.model.GetRequestsRecycler;
import com.bartech.sms.data.network.model.LoginResponseCrm;
import com.bartech.sms.ui.base.BaseActivity;
import com.bartech.sms.utils.CommonUtils;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ahmed on 7/4/2018.
 */

public class RequestsListActivity extends BaseActivity implements RequestsListMvpView {

    @Inject
    RequestsListMvpPresenter<RequestsListMvpView> mPresenter;
    private GetRequestsRecycler mRecyclerAdapter;
    private ArrayList<DatumRequestsList> datumGetAllRequests;
    @BindView(R.id.requests_recycler)
    RecyclerView getRequests;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests_list);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(RequestsListActivity.this);

        LoginResponseCrm loginResponseCrm = CommonUtils.getUser(this);
        String UserId = loginResponseCrm.getData().getUserId().toString();

        datumGetAllRequests = new ArrayList<>();
        mPresenter.getAllRequests(UserId);


    }

    @Override
    public void setAllRequests(List<DatumRequestsList> allRequests) {
        datumGetAllRequests = new ArrayList<DatumRequestsList>(allRequests);
        mRecyclerAdapter = new GetRequestsRecycler(RequestsListActivity.this, datumGetAllRequests);
        getRequests.setHasFixedSize(true);
        getRequests.setLayoutManager(new LinearLayoutManager(this));
        getRequests.setAdapter(mRecyclerAdapter);
    }
























    @Override
    protected void setUp() {

    }


}
