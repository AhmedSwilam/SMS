// Generated code from Butter Knife. Do not modify!
package com.bartech.sms.ui.requestslist;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bartech.sms.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RequestsListActivity_ViewBinding implements Unbinder {
  private RequestsListActivity target;

  @UiThread
  public RequestsListActivity_ViewBinding(RequestsListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RequestsListActivity_ViewBinding(RequestsListActivity target, View source) {
    this.target = target;

    target.getRequests = Utils.findRequiredViewAsType(source, R.id.requests_recycler, "field 'getRequests'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RequestsListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.getRequests = null;
  }
}
