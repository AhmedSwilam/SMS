package com.bartech.sms.data.network.model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bartech.sms.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ahmed on 7/4/2018.
 */

public class GetRequestsRecycler extends RecyclerView.Adapter<GetRequestsRecycler.RecyclerViewHolder> {

    private Context mContext;
    public ArrayList<DatumRequestsList> getAllRequestsLists;

    public GetRequestsRecycler(Context context, ArrayList<DatumRequestsList> datumRequestsLists) {
        mContext = context;
        getAllRequestsLists = datumRequestsLists;
    }



    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.activity_requests_recycler_data,parent,false);
        return new RecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(GetRequestsRecycler.RecyclerViewHolder holder, int position) {
        DatumRequestsList currentItem = getAllRequestsLists.get(position);
        String ComplaintNumber = currentItem.getId().toString();
        String ComplaintDate= currentItem.getDate();
        String deviceName = currentItem.getDeviceIdName();
        String ClientName = currentItem.getClientIdName();
        String frequencyType = currentItem.getFrequencyName();
        holder.txtComplaintNumber.setText(ComplaintNumber);
        holder.txtComplaintDate.setText(ComplaintDate);
        holder.txtDeviceName.setText(deviceName);
        holder.txtClientName.setText(ClientName);
        holder.txtFrequencyType.setText(frequencyType);
    }

    @Override
    public int getItemCount() {
        return getAllRequestsLists.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.txt_complaint_number)
        TextView txtComplaintNumber;
        @BindView(R.id.txt_complaint_date)
        TextView txtComplaintDate;
        @BindView(R.id.txt_device_name)
        TextView txtDeviceName;
        @BindView(R.id.txt_client_name)
        TextView txtClientName;
        @BindView(R.id.txt_frequency_type)
        TextView txtFrequencyType;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
