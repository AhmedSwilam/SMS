package com.bartech.sms.ui.requestslist;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RequestsListActivity_MembersInjector
    implements MembersInjector<RequestsListActivity> {
  private final Provider<RequestsListMvpPresenter<RequestsListMvpView>> mPresenterProvider;

  public RequestsListActivity_MembersInjector(
      Provider<RequestsListMvpPresenter<RequestsListMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<RequestsListActivity> create(
      Provider<RequestsListMvpPresenter<RequestsListMvpView>> mPresenterProvider) {
    return new RequestsListActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(RequestsListActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      RequestsListActivity instance,
      Provider<RequestsListMvpPresenter<RequestsListMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
