package com.bartech.sms.ui.visitslist;

import com.bartech.sms.data.network.model.SmsVisitsListResponse;
import com.bartech.sms.ui.base.MvpView;

/**
 * Created by Ahmed on 7/4/2018.
 */

public interface VisitsListMvpView extends MvpView {

    void setAllVisits(SmsVisitsListResponse allVisits);
}
