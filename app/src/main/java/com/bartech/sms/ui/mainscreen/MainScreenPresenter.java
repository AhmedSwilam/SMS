package com.bartech.sms.ui.mainscreen;


import com.bartech.sms.data.DataManager;
import com.bartech.sms.ui.base.BasePresenter;
import com.bartech.sms.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Ahmed on 6/3/2018.
 */

public class MainScreenPresenter <V extends MainScreenMvpView> extends BasePresenter<V> implements MainScreenMvpPresenter<V> {
    @Inject
    public MainScreenPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onNavMenuCreated() {

    }

    @Override
    public void onViewInitialized() {

    }

    @Override
    public void onMyComplaintItemClicked() {
        getMvpView().goToMyComplaintActivity();
    }

    @Override
    public void onMyDevicesItemClicked() {
        getMvpView().goToMyDevicesActivity();
    }

    @Override
    public void onMyVisitsItemClicked() {
        getMvpView().goToMyVisitsActivity();
    }

    @Override
    public void onMyDashboardItemClicked() {
        getMvpView().goToMyDashboardActivity();
    }

    @Override
    public void onMyLocationItemClicked() {
        getMvpView().goToGoogleMapsActivity();
    }

    @Override
    public void onMyRequestClicked() {
        getMvpView().goToSparePartsActivity();
    }


}
