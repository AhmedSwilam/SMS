package com.bartech.sms.ui.visitslist;

import com.androidnetworking.error.ANError;
import com.bartech.sms.data.DataManager;
import com.bartech.sms.data.network.model.SmsRequestsCountRequest;
import com.bartech.sms.data.network.model.SmsVisitsListResponse;
import com.bartech.sms.ui.base.BasePresenter;
import com.bartech.sms.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by Ahmed on 7/4/2018.
 */

public class VisitsListPresenter <V extends VisitsListMvpView> extends BasePresenter<V> implements VisitsListMvpPresenter<V> {
    @Inject
    public VisitsListPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void getAllVisits(String UserId) {
        getCompositeDisposable().add(getDataManager()
        .doServerSmsVisitsList(new SmsRequestsCountRequest.serverSmsRequestCountRequest(UserId))
        .subscribeOn(getSchedulerProvider().io())
        .observeOn(getSchedulerProvider().ui())
        .subscribe(new Consumer<SmsVisitsListResponse>() {
            @Override
            public void accept(SmsVisitsListResponse smsVisitsListResponse) throws Exception {
                if (smsVisitsListResponse.getData()!=null){
                    getMvpView().setAllVisits(smsVisitsListResponse);
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
