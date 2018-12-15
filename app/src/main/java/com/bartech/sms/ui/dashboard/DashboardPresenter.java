package com.bartech.sms.ui.dashboard;


import com.androidnetworking.error.ANError;
import com.bartech.sms.data.DataManager;
import com.bartech.sms.data.network.model.SmsRequestsCountRequest;
import com.bartech.sms.data.network.model.SmsRequestCountResponse;
import com.bartech.sms.data.network.model.SmsVisitsCountRequest;
import com.bartech.sms.data.network.model.SmsVisitsCountResponse;
import com.bartech.sms.ui.base.BasePresenter;
import com.bartech.sms.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by Ahmed on 6/18/2018.
 */

public class DashboardPresenter<V extends DashboardMvpView> extends BasePresenter<V> implements DashboardMvpPresenter<V> {
    @Inject
    public DashboardPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }


    @Override
    public void getRequestsCount(String userId) {
        getCompositeDisposable().add(getDataManager()
                .doServerSmsRequestCount(new SmsRequestsCountRequest.serverSmsRequestCountRequest(userId))
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<SmsRequestCountResponse>() {
                               @Override
                               public void accept(SmsRequestCountResponse smsRequestCountResponse) throws Exception {
                                   if (smsRequestCountResponse.getData() != null) {
                                       getMvpView().setRequestsCount(smsRequestCountResponse);
                                   }
                               }
                           }, new Consumer<Throwable>() {
                               @Override
                               public void accept(Throwable throwable) throws Exception {
                                   if (!isViewAttached()) {
                                       return;
                                   }

                                   getMvpView().hideLoading();

                                   // handle the login error here
                                   if (throwable instanceof ANError) {
                                       ANError anError = (ANError) throwable;
                                       handleApiError(anError);
                                   }

                               }
                           }
                ));
    }

    @Override
    public void getVisitsCount(String Id) {
        getCompositeDisposable().add(getDataManager()
                .doServerSmsVisitsCount(new SmsVisitsCountRequest.ServerSmsVisitsCountRequest(Id))
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<SmsVisitsCountResponse>() {
                               @Override
                               public void accept(SmsVisitsCountResponse smsVisitsCountResponse) throws Exception {
                                   if (smsVisitsCountResponse.getData() != null) {
                                       getMvpView().setVisitsCount(smsVisitsCountResponse);
                                   }
                               }
                           }, new Consumer<Throwable>() {
                               @Override
                               public void accept(Throwable throwable) throws Exception {
                                   if (!isViewAttached()) {
                                       return;
                                   }

                                   getMvpView().hideLoading();

                                   // handle the login error here
                                   if (throwable instanceof ANError) {
                                       ANError anError = (ANError) throwable;
                                       handleApiError(anError);
                                   }

                               }
                           }
                ));
    }
}
