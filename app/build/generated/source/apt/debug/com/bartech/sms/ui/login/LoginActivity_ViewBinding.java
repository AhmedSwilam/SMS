// Generated code from Butter Knife. Do not modify!
package com.bartech.sms.ui.login;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bartech.sms.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view2131296314;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    target.mEmailEditText = Utils.findRequiredViewAsType(source, R.id.et_Email, "field 'mEmailEditText'", EditText.class);
    target.mPasswordEditText = Utils.findRequiredViewAsType(source, R.id.et_password_login, "field 'mPasswordEditText'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_login_screen, "field 'btnLogin' and method 'onServerLoginClicked'");
    target.btnLogin = Utils.castView(view, R.id.btn_login_screen, "field 'btnLogin'", Button.class);
    view2131296314 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onServerLoginClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mEmailEditText = null;
    target.mPasswordEditText = null;
    target.btnLogin = null;

    view2131296314.setOnClickListener(null);
    view2131296314 = null;
  }
}
