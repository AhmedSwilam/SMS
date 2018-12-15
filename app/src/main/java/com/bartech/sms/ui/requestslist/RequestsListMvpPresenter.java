package com.bartech.sms.ui.requestslist;

import com.bartech.sms.ui.base.MvpPresenter;

/**
 * Created by Ahmed on 7/4/2018.
 */

public interface RequestsListMvpPresenter <V extends RequestsListMvpView> extends MvpPresenter<V> {

    void getAllRequests(String UserId);
}
