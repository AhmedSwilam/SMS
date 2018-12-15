package com.bartech.sms.ui.requestslist;

import com.androidnetworking.error.ANError;
import com.bartech.sms.data.DataManager;
import com.bartech.sms.data.network.model.SmsRequestsCountRequest;
import com.bartech.sms.data.network.model.SmsRequestsListResponse;
import com.bartech.sms.ui.base.BasePresenter;
import com.bartech.sms.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by Ahmed on 7/4/2018.
 */

public class RequestsListPresenter <V extends RequestsListMvpView> extends BasePresenter<V> implements RequestsListMvpPresenter<V> {
    @Inject
    public RequestsListPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void getAllRequests(String UserId) {
        getCompositeDisposable().add(getDataManager()
        .doServerRequestsList(new SmsRequestsCountRequest.serverSmsRequestCountRequest(UserId))
        .subscribeOn(getSchedulerProvider().io())
        .observeOn(getSchedulerProvider().ui())
        .subscribe(new Consumer<SmsRequestsListResponse>() {
            @Override
            public void accept(SmsRequestsListResponse smsRequestsListResponse) throws Exception {
                if (smsRequestsListResponse.getData()!=null){
                    getMvpView().setAllRequests(smsRequestsListResponse.getData());
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
        }));
    }
}
