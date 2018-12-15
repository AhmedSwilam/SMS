package com.bartech.sms.ui.visitslist;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VisitsListActivity_MembersInjector
    implements MembersInjector<VisitsListActivity> {
  private final Provider<VisitsListPresenter<VisitsListMvpView>> mPresenterProvider;

  public VisitsListActivity_MembersInjector(
      Provider<VisitsListPresenter<VisitsListMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<VisitsListActivity> create(
      Provider<VisitsListPresenter<VisitsListMvpView>> mPresenterProvider) {
    return new VisitsListActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(VisitsListActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      VisitsListActivity instance,
      Provider<VisitsListPresenter<VisitsListMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
