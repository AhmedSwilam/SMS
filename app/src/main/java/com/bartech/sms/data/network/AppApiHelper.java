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

package com.bartech.sms.data.network;

import com.bartech.sms.data.network.model.BlogResponse;
import com.bartech.sms.data.network.model.LoginRequest;
import com.bartech.sms.data.network.model.LoginRequestCrm;
import com.bartech.sms.data.network.model.LoginResponse;
import com.bartech.sms.data.network.model.LoginResponseCrm;
import com.bartech.sms.data.network.model.LogoutResponse;
import com.bartech.sms.data.network.model.OpenSourceResponse;
import com.bartech.sms.data.network.model.SmsRequestsCountRequest;
import com.bartech.sms.data.network.model.SmsRequestCountResponse;
import com.bartech.sms.data.network.model.SmsRequestsListResponse;
import com.bartech.sms.data.network.model.SmsVisitsCountRequest;
import com.bartech.sms.data.network.model.SmsVisitsCountResponse;
import com.bartech.sms.data.network.model.SmsVisitsListResponse;
import com.rx2androidnetworking.Rx2AndroidNetworking;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;

/**
 * Created by janisharali on 28/01/17.
 */

@Singleton
public class AppApiHelper implements ApiHelper {

    private ApiHeader mApiHeader;

    @Inject
    public AppApiHelper(ApiHeader apiHeader) {
        mApiHeader = apiHeader;
    }

    @Override
    public ApiHeader getApiHeader() {
        return mApiHeader;
    }

    @Override
    public Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest
                                                              request) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_GOOGLE_LOGIN)
                .addHeaders(mApiHeader.getPublicApiHeader())
                .addBodyParameter(request)
                .build()
                .getObjectSingle(LoginResponse.class);
    }

    @Override
    public Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest
                                                                request) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_FACEBOOK_LOGIN)
                .addHeaders(mApiHeader.getPublicApiHeader())
                .addBodyParameter(request)
                .build()
                .getObjectSingle(LoginResponse.class);
    }

    @Override
    public Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest
                                                              request) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_LOGIN)
                .addHeaders(mApiHeader.getPublicApiHeader())
                .addBodyParameter(request)
                .build()
                .getObjectSingle(LoginResponse.class);
    }

    @Override
    public Single<LoginResponseCrm> doServerLoginApiCallCrm(LoginRequestCrm.serverLoginRequestCrm loginRequestCrm) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_LOGIN)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .addBodyParameter(loginRequestCrm)
                .build()
                .getObjectSingle(LoginResponseCrm.class);
    }

    @Override
    public Single<SmsRequestCountResponse> doServerSmsRequestCount(SmsRequestsCountRequest.serverSmsRequestCountRequest smsRequestCountRequest) {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_REQUEST_COUNT)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .addQueryParameter(smsRequestCountRequest)
                .build()
                .getObjectSingle(SmsRequestCountResponse.class);
    }

    @Override
    public Single<SmsRequestsListResponse> doServerRequestsList(SmsRequestsCountRequest.serverSmsRequestCountRequest smsRequestCountRequest) {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_REQUEST_LIST)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .addQueryParameter(smsRequestCountRequest)
                .build()
                .getObjectSingle(SmsRequestsListResponse.class);
    }

    @Override
    public Single<SmsVisitsCountResponse> doServerSmsVisitsCount(SmsVisitsCountRequest.ServerSmsVisitsCountRequest smsVisitsCountRequest) {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_VISITS_COUNT)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .addQueryParameter(smsVisitsCountRequest)
                .build()
                .getObjectSingle(SmsVisitsCountResponse.class);
    }

    @Override
    public Single<SmsVisitsListResponse> doServerSmsVisitsList(SmsRequestsCountRequest.serverSmsRequestCountRequest smsRequestCountRequest) {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_VISITS_LIST)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .addQueryParameter(smsRequestCountRequest)
                .build()
                .getObjectSingle(SmsVisitsListResponse.class);
    }

    @Override
    public Single<LogoutResponse> doLogoutApiCall() {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_LOGOUT)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(LogoutResponse.class);
    }

    @Override
    public Single<BlogResponse> getBlogApiCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_BLOG)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(BlogResponse.class);
    }

    @Override
    public Single<OpenSourceResponse> getOpenSourceApiCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_OPEN_SOURCE)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(OpenSourceResponse.class);
    }
}

