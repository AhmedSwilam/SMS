package com.bartech.sms.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.bartech.sms.R;
import com.bartech.sms.data.network.model.LoginResponseCrm;
import com.bartech.sms.data.network.model.SmsRequestCountResponse;
import com.bartech.sms.data.network.model.SmsVisitsCountResponse;
import com.bartech.sms.ui.base.BaseActivity;
import com.bartech.sms.ui.requestslist.RequestsListActivity;
import com.bartech.sms.ui.visitslist.VisitsListActivity;
import com.bartech.sms.utils.CommonUtils;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Ahmed on 6/18/2018.
 */

public class DashboardActivity extends BaseActivity implements DashboardMvpView {
    @Inject
    DashboardMvpPresenter<DashboardMvpView> mPresenter;
    @BindView(R.id.txt_client_name)
    TextView txtClientName;
    @BindView(R.id.txt_visits_count)
    TextView txtVisitCount;
    @BindView(R.id.txt_complaint_count)
    TextView txtRequestsCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));

        LoginResponseCrm loginResponseCrm = CommonUtils.getUser(this);
        String clientName = loginResponseCrm.getData().getNameAr();
        String clientType = loginResponseCrm.getData().getTypeId().toString();
        String userId = loginResponseCrm.getData().getUserId().toString();
        String Id = loginResponseCrm.getData().getId().toString();
        mPresenter.onAttach(DashboardActivity.this);
        txtClientName.setText(clientName);
        mPresenter.getRequestsCount(userId);
        mPresenter.getVisitsCount(Id);

    }

    @Override
    protected void setUp() {

    }

    @Override
    public void getSavedUserObject(LoginResponseCrm loginResponseCrm) {
        CommonUtils.saveUser(this, loginResponseCrm);

    }

    @Override
    public void setRequestsCount(SmsRequestCountResponse requestsCount) {
        txtRequestsCount.setText(requestsCount.getData());
    }

    @Override
    public void setVisitsCount(SmsVisitsCountResponse visitsCount) {
        txtVisitCount.setText(visitsCount.getData());
    }
    @OnClick(R.id.txt_complaint_count)
    public void openAllRequests(){
        startActivity(new Intent(DashboardActivity.this, RequestsListActivity.class));
    }
    @OnClick(R.id.txt_visits_count)
    public void openAllVisits(){
        startActivity(new Intent(DashboardActivity.this, VisitsListActivity.class));
    }
}
