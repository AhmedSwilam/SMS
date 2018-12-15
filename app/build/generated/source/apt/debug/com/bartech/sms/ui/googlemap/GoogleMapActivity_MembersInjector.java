package com.bartech.sms.ui.googlemap;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GoogleMapActivity_MembersInjector implements MembersInjector<GoogleMapActivity> {
  private final Provider<GoogleMapMvpPresenter<GoogleMapMvpView>> mPresenterProvider;

  public GoogleMapActivity_MembersInjector(
      Provider<GoogleMapMvpPresenter<GoogleMapMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<GoogleMapActivity> create(
      Provider<GoogleMapMvpPresenter<GoogleMapMvpView>> mPresenterProvider) {
    return new GoogleMapActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(GoogleMapActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      GoogleMapActivity instance,
      Provider<GoogleMapMvpPresenter<GoogleMapMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
