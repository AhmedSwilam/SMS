// Generated code from Butter Knife. Do not modify!
package com.bartech.sms.ui.dashboard;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bartech.sms.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DashboardActivity_ViewBinding implements Unbinder {
  private DashboardActivity target;

  private View view2131296655;

  private View view2131296644;

  @UiThread
  public DashboardActivity_ViewBinding(DashboardActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DashboardActivity_ViewBinding(final DashboardActivity target, View source) {
    this.target = target;

    View view;
    target.txtClientName = Utils.findRequiredViewAsType(source, R.id.txt_client_name, "field 'txtClientName'", TextView.class);
    view = Utils.findRequiredView(source, R.id.txt_visits_count, "field 'txtVisitCount' and method 'openAllVisits'");
    target.txtVisitCount = Utils.castView(view, R.id.txt_visits_count, "field 'txtVisitCount'", TextView.class);
    view2131296655 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openAllVisits();
      }
    });
    view = Utils.findRequiredView(source, R.id.txt_complaint_count, "field 'txtRequestsCount' and method 'openAllRequests'");
    target.txtRequestsCount = Utils.castView(view, R.id.txt_complaint_count, "field 'txtRequestsCount'", TextView.class);
    view2131296644 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openAllRequests();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    DashboardActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtClientName = null;
    target.txtVisitCount = null;
    target.txtRequestsCount = null;

    view2131296655.setOnClickListener(null);
    view2131296655 = null;
    view2131296644.setOnClickListener(null);
    view2131296644 = null;
  }
}
