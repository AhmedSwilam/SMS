package com.bartech.sms.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ahmed on 7/4/2018.
 */

public class SmsRequestsCountRequest {
    public SmsRequestsCountRequest(){

    }
    public static class serverSmsRequestCountRequest{
        @Expose
        @SerializedName("UserId")
        private String UserId;

        public serverSmsRequestCountRequest(String userId) {
            UserId = userId;
        }
    }
}
