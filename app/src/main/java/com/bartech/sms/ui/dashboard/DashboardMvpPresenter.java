package com.bartech.sms.ui.dashboard;


import com.bartech.sms.ui.base.MvpPresenter;

/**
 * Created by Ahmed on 6/18/2018.
 */

public interface DashboardMvpPresenter<V extends DashboardMvpView> extends MvpPresenter<V> {

    void getRequestsCount(String userId);

    void getVisitsCount(String Id);
}
