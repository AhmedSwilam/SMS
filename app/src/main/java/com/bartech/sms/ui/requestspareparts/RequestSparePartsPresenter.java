package com.bartech.sms.ui.requestspareparts;

import com.bartech.sms.data.DataManager;
import com.bartech.sms.ui.base.BasePresenter;
import com.bartech.sms.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Ahmed on 8/6/2018.
 */

public class RequestSparePartsPresenter <V extends RequestSparePartsMvpView> extends BasePresenter<V>
        implements RequestSparePartsMvpPresenter<V> {
    @Inject
    public RequestSparePartsPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}
