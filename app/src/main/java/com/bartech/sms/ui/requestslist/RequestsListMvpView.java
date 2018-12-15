package com.bartech.sms.ui.requestslist;

import com.bartech.sms.data.network.model.DatumRequestsList;
import com.bartech.sms.ui.base.MvpView;

import java.util.List;

/**
 * Created by Ahmed on 7/4/2018.
 */

public interface RequestsListMvpView extends MvpView {

    void setAllRequests(List<DatumRequestsList> allRequests);
}
