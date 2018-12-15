package com.bartech.sms.ui.visitslist;

import com.bartech.sms.ui.base.MvpPresenter;

/**
 * Created by Ahmed on 7/4/2018.
 */

public interface VisitsListMvpPresenter <V extends VisitsListMvpView> extends MvpPresenter<V> {

    void getAllVisits(String UserId);
}
