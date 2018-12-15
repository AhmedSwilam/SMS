package com.bartech.sms.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ahmed on 7/4/2018.
 */

public class SmsVisitsCountRequest {
    public SmsVisitsCountRequest(){

    }
    public static class ServerSmsVisitsCountRequest{
        @Expose
        @SerializedName("Id")
        private String Id;

        public ServerSmsVisitsCountRequest(String id) {
            Id = id;
        }
    }
}
