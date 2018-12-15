/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.bartech.sms.ui.login;

import com.androidnetworking.error.ANError;
import com.bartech.sms.R;
import com.bartech.sms.data.DataManager;
import com.bartech.sms.data.network.model.LoginRequestCrm;
import com.bartech.sms.data.network.model.LoginResponseCrm;
import com.bartech.sms.ui.base.BasePresenter;
import com.bartech.sms.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by janisharali on 27/01/17.
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V>
        implements LoginMvpPresenter<V> {

    private static final String TAG = "LoginPresenter";

    @Inject
    public LoginPresenter(DataManager dataManager,
                          SchedulerProvider schedulerProvider,
                          CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
    @Override
    public void onServerLoginClicked(final String UserName, final String Password) {

        if (UserName == null && UserName.isEmpty()){
            getMvpView().onError(R.string.empty_email);
        }
        if (Password== null && Password.isEmpty()){
            getMvpView().onError(R.string.empty_password);
        }
        getCompositeDisposable().add(getDataManager()
                .doServerLoginApiCallCrm(new LoginRequestCrm.serverLoginRequestCrm(UserName,Password))
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<LoginResponseCrm>() {
                    @Override
                    public void accept(LoginResponseCrm loginResponseCrm) throws Exception {
                        if (loginResponseCrm.getData()!=null){
                            getMvpView().saveLoginResponseCrm(loginResponseCrm);
                            getMvpView().openMainScreen();

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
