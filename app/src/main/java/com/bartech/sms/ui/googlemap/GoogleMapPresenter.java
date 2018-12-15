package com.bartech.sms.ui.googlemap;

import com.bartech.sms.data.DataManager;
import com.bartech.sms.ui.base.BasePresenter;
import com.bartech.sms.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Ahmed on 7/9/2018.
 */

public class GoogleMapPresenter <V extends GoogleMapMvpView> extends BasePresenter<V> implements GoogleMapMvpPresenter<V> {
    @Inject
    public GoogleMapPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}
