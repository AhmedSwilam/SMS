// Generated code from Butter Knife. Do not modify!
package com.bartech.sms.data.network.model;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bartech.sms.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GetRequestsRecycler$RecyclerViewHolder_ViewBinding implements Unbinder {
  private GetRequestsRecycler.RecyclerViewHolder target;

  @UiThread
  public GetRequestsRecycler$RecyclerViewHolder_ViewBinding(GetRequestsRecycler.RecyclerViewHolder target, View source) {
    this.target = target;

    target.txtComplaintNumber = Utils.findRequiredViewAsType(source, R.id.txt_complaint_number, "field 'txtComplaintNumber'", TextView.class);
    target.txtComplaintDate = Utils.findRequiredViewAsType(source, R.id.txt_complaint_date, "field 'txtComplaintDate'", TextView.class);
    target.txtDeviceName = Utils.findRequiredViewAsType(source, R.id.txt_device_name, "field 'txtDeviceName'", TextView.class);
    target.txtClientName = Utils.findRequiredViewAsType(source, R.id.txt_client_name, "field 'txtClientName'", TextView.class);
    target.txtFrequencyType = Utils.findRequiredViewAsType(source, R.id.txt_frequency_type, "field 'txtFrequencyType'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GetRequestsRecycler.RecyclerViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtComplaintNumber = null;
    target.txtComplaintDate = null;
    target.txtDeviceName = null;
    target.txtClientName = null;
    target.txtFrequencyType = null;
  }
}
