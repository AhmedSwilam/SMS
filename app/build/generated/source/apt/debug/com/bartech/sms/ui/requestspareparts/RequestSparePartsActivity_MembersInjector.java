package com.bartech.sms.ui.requestspareparts;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RequestSparePartsActivity_MembersInjector
    implements MembersInjector<RequestSparePartsActivity> {
  private final Provider<RequestSparePartsMvpPresenter<RequestSparePartsMvpView>>
      mPresenterProvider;

  public RequestSparePartsActivity_MembersInjector(
      Provider<RequestSparePartsMvpPresenter<RequestSparePartsMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<RequestSparePartsActivity> create(
      Provider<RequestSparePartsMvpPresenter<RequestSparePartsMvpView>> mPresenterProvider) {
    return new RequestSparePartsActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(RequestSparePartsActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      RequestSparePartsActivity instance,
      Provider<RequestSparePartsMvpPresenter<RequestSparePartsMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
