package com.bartech.sms.di.module;

import com.bartech.sms.ui.googlemap.GoogleMapMvpPresenter;
import com.bartech.sms.ui.googlemap.GoogleMapMvpView;
import com.bartech.sms.ui.googlemap.GoogleMapPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideGoogleMapPresenterFactory
    implements Factory<GoogleMapMvpPresenter<GoogleMapMvpView>> {
  private final ActivityModule module;

  private final Provider<GoogleMapPresenter<GoogleMapMvpView>> presenterProvider;

  public ActivityModule_ProvideGoogleMapPresenterFactory(
      ActivityModule module, Provider<GoogleMapPresenter<GoogleMapMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public GoogleMapMvpPresenter<GoogleMapMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideGoogleMapPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<GoogleMapMvpPresenter<GoogleMapMvpView>> create(
      ActivityModule module, Provider<GoogleMapPresenter<GoogleMapMvpView>> presenterProvider) {
    return new ActivityModule_ProvideGoogleMapPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideGoogleMapPresenter(GoogleMapPresenter)}. */
  public static GoogleMapMvpPresenter<GoogleMapMvpView> proxyProvideGoogleMapPresenter(
      ActivityModule instance, GoogleMapPresenter<GoogleMapMvpView> presenter) {
    return instance.provideGoogleMapPresenter(presenter);
  }
}
