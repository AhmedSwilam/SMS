// Generated code from Butter Knife. Do not modify!
package com.bartech.sms.ui.visitslist;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bartech.sms.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VisitsListActivity_ViewBinding implements Unbinder {
  private VisitsListActivity target;

  @UiThread
  public VisitsListActivity_ViewBinding(VisitsListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VisitsListActivity_ViewBinding(VisitsListActivity target, View source) {
    this.target = target;

    target.getVisits = Utils.findRequiredViewAsType(source, R.id.visits_recycler, "field 'getVisits'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VisitsListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.getVisits = null;
  }
}
