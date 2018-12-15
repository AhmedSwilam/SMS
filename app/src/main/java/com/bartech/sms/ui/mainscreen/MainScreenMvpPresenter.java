package com.bartech.sms.ui.mainscreen;


import com.bartech.sms.ui.base.MvpPresenter;

/**
 * Created by Ahmed on 6/3/2018.
 */

public interface MainScreenMvpPresenter <V extends MainScreenMvpView> extends MvpPresenter<V> {
    void onNavMenuCreated();
    void onViewInitialized();
    void onMyComplaintItemClicked();
    void onMyDevicesItemClicked();
    void onMyVisitsItemClicked();
    void onMyDashboardItemClicked();
    void onMyLocationItemClicked();
    void onMyRequestClicked();
}
