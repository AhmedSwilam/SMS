package com.bartech.sms.ui.dashboard;


import com.bartech.sms.data.network.model.LoginResponseCrm;
import com.bartech.sms.data.network.model.SmsRequestCountResponse;
import com.bartech.sms.data.network.model.SmsVisitsCountResponse;
import com.bartech.sms.ui.base.MvpView;

/**
 * Created by Ahmed on 6/18/2018.
 */

public interface DashboardMvpView extends MvpView {

    void getSavedUserObject(LoginResponseCrm loginResponseCrm);

    void setRequestsCount(SmsRequestCountResponse requestsCount);

    void setVisitsCount(SmsVisitsCountResponse visitsCount);
}
